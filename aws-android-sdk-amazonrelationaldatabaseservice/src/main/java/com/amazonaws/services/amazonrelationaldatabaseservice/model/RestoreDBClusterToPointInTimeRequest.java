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
 * Restores a DB cluster to an arbitrary point in time. Users can restore to any
 * point in time before <code>LatestRestorableTime</code> for up to
 * <code>BackupRetentionPeriod</code> days. The target DB cluster is created
 * from the source DB cluster with the same configuration as the original DB
 * cluster, except that the new DB cluster is created with the default DB
 * security group.
 * </p>
 * <note>
 * <p>
 * This action only restores the DB cluster, not the DB instances for that DB
 * cluster. You must invoke the <code>CreateDBInstance</code> action to create
 * DB instances for the restored DB cluster, specifying the identifier of the
 * restored DB cluster in <code>DBClusterIdentifier</code>. You can create DB
 * instances only after the <code>RestoreDBClusterToPointInTime</code> action
 * has completed and the DB cluster is available.
 * </p>
 * </note>
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
public class RestoreDBClusterToPointInTimeRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of
     * the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of
     * the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine
     * version of the source DB cluster is earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB
     * cluster is restored as a full copy of the source DB cluster.
     * </p>
     */
    private String restoreType;

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     */
    private String sourceDBClusterIdentifier;

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't
     * provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is
     * <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     */
    private java.util.Date restoreToTime;

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest
     * restorable backup time. By default, the DB cluster isn't restored to the
     * latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter
     * is provided.
     * </p>
     */
    private Boolean useLatestRestorableTime;

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a
     * KMS key that is different than the KMS key used to encrypt the source DB
     * cluster. The new DB cluster is encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted
     * using the KMS key that was used to encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't
     * encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't
     * encrypted, then the restore request is rejected.
     * </p>
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
     * The list of logs that the restored DB cluster is to export to CloudWatch
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
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
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
     * The name of the new DB cluster to be created.
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
     *
     * @return <p>
     *         The name of the new DB cluster to be created.
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
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     *
     * @param dBClusterIdentifier <p>
     *            The name of the new DB cluster to be created.
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
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The name of the new DB cluster to be created.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The name of the new DB cluster to be created.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of
     * the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of
     * the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine
     * version of the source DB cluster is earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB
     * cluster is restored as a full copy of the source DB cluster.
     * </p>
     *
     * @return <p>
     *         The type of restore to be performed. You can specify one of the
     *         following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>full-copy</code> - The new DB cluster is restored as a full
     *         copy of the source DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>copy-on-write</code> - The new DB cluster is restored as a
     *         clone of the source DB cluster.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraints: You can't specify <code>copy-on-write</code> if the
     *         engine version of the source DB cluster is earlier than 1.11.
     *         </p>
     *         <p>
     *         If you don't specify a <code>RestoreType</code> value, then the
     *         new DB cluster is restored as a full copy of the source DB
     *         cluster.
     *         </p>
     */
    public String getRestoreType() {
        return restoreType;
    }

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of
     * the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of
     * the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine
     * version of the source DB cluster is earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB
     * cluster is restored as a full copy of the source DB cluster.
     * </p>
     *
     * @param restoreType <p>
     *            The type of restore to be performed. You can specify one of
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>full-copy</code> - The new DB cluster is restored as a
     *            full copy of the source DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>copy-on-write</code> - The new DB cluster is restored as
     *            a clone of the source DB cluster.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Constraints: You can't specify <code>copy-on-write</code> if
     *            the engine version of the source DB cluster is earlier than
     *            1.11.
     *            </p>
     *            <p>
     *            If you don't specify a <code>RestoreType</code> value, then
     *            the new DB cluster is restored as a full copy of the source DB
     *            cluster.
     *            </p>
     */
    public void setRestoreType(String restoreType) {
        this.restoreType = restoreType;
    }

    /**
     * <p>
     * The type of restore to be performed. You can specify one of the following
     * values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>full-copy</code> - The new DB cluster is restored as a full copy of
     * the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>copy-on-write</code> - The new DB cluster is restored as a clone of
     * the source DB cluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraints: You can't specify <code>copy-on-write</code> if the engine
     * version of the source DB cluster is earlier than 1.11.
     * </p>
     * <p>
     * If you don't specify a <code>RestoreType</code> value, then the new DB
     * cluster is restored as a full copy of the source DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreType <p>
     *            The type of restore to be performed. You can specify one of
     *            the following values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>full-copy</code> - The new DB cluster is restored as a
     *            full copy of the source DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>copy-on-write</code> - The new DB cluster is restored as
     *            a clone of the source DB cluster.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Constraints: You can't specify <code>copy-on-write</code> if
     *            the engine version of the source DB cluster is earlier than
     *            1.11.
     *            </p>
     *            <p>
     *            If you don't specify a <code>RestoreType</code> value, then
     *            the new DB cluster is restored as a full copy of the source DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withRestoreType(String restoreType) {
        this.restoreType = restoreType;
        return this;
    }

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The identifier of the source DB cluster from which to restore.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must match the identifier of an existing DBCluster.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getSourceDBClusterIdentifier() {
        return sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     *
     * @param sourceDBClusterIdentifier <p>
     *            The identifier of the source DB cluster from which to restore.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBCluster.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setSourceDBClusterIdentifier(String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the source DB cluster from which to restore.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must match the identifier of an existing DBCluster.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBClusterIdentifier <p>
     *            The identifier of the source DB cluster from which to restore.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must match the identifier of an existing DBCluster.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withSourceDBClusterIdentifier(
            String sourceDBClusterIdentifier) {
        this.sourceDBClusterIdentifier = sourceDBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't
     * provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is
     * <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     *
     * @return <p>
     *         The date and time to restore the DB cluster to.
     *         </p>
     *         <p>
     *         Valid Values: Value must be a time in Universal Coordinated Time
     *         (UTC) format
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be before the latest restorable time for the DB instance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be specified if <code>UseLatestRestorableTime</code>
     *         parameter isn't provided
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>UseLatestRestorableTime</code>
     *         parameter is enabled
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be specified if the <code>RestoreType</code> parameter is
     *         <code>copy-on-write</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>2015-03-07T23:45:00Z</code>
     *         </p>
     */
    public java.util.Date getRestoreToTime() {
        return restoreToTime;
    }

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't
     * provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is
     * <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     *
     * @param restoreToTime <p>
     *            The date and time to restore the DB cluster to.
     *            </p>
     *            <p>
     *            Valid Values: Value must be a time in Universal Coordinated
     *            Time (UTC) format
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be before the latest restorable time for the DB instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be specified if <code>UseLatestRestorableTime</code>
     *            parameter isn't provided
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be specified if the <code>UseLatestRestorableTime</code>
     *            parameter is enabled
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be specified if the <code>RestoreType</code> parameter
     *            is <code>copy-on-write</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>2015-03-07T23:45:00Z</code>
     *            </p>
     */
    public void setRestoreToTime(java.util.Date restoreToTime) {
        this.restoreToTime = restoreToTime;
    }

    /**
     * <p>
     * The date and time to restore the DB cluster to.
     * </p>
     * <p>
     * Valid Values: Value must be a time in Universal Coordinated Time (UTC)
     * format
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be before the latest restorable time for the DB instance
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be specified if <code>UseLatestRestorableTime</code> parameter isn't
     * provided
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>UseLatestRestorableTime</code> parameter
     * is enabled
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be specified if the <code>RestoreType</code> parameter is
     * <code>copy-on-write</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>2015-03-07T23:45:00Z</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreToTime <p>
     *            The date and time to restore the DB cluster to.
     *            </p>
     *            <p>
     *            Valid Values: Value must be a time in Universal Coordinated
     *            Time (UTC) format
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be before the latest restorable time for the DB instance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be specified if <code>UseLatestRestorableTime</code>
     *            parameter isn't provided
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be specified if the <code>UseLatestRestorableTime</code>
     *            parameter is enabled
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be specified if the <code>RestoreType</code> parameter
     *            is <code>copy-on-write</code>
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>2015-03-07T23:45:00Z</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withRestoreToTime(java.util.Date restoreToTime) {
        this.restoreToTime = restoreToTime;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest
     * restorable backup time. By default, the DB cluster isn't restored to the
     * latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter
     * is provided.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to restore the DB cluster to the
     *         latest restorable backup time. By default, the DB cluster isn't
     *         restored to the latest restorable backup time.
     *         </p>
     *         <p>
     *         Constraints: Can't be specified if <code>RestoreToTime</code>
     *         parameter is provided.
     *         </p>
     */
    public Boolean isUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest
     * restorable backup time. By default, the DB cluster isn't restored to the
     * latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter
     * is provided.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to restore the DB cluster to the
     *         latest restorable backup time. By default, the DB cluster isn't
     *         restored to the latest restorable backup time.
     *         </p>
     *         <p>
     *         Constraints: Can't be specified if <code>RestoreToTime</code>
     *         parameter is provided.
     *         </p>
     */
    public Boolean getUseLatestRestorableTime() {
        return useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest
     * restorable backup time. By default, the DB cluster isn't restored to the
     * latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter
     * is provided.
     * </p>
     *
     * @param useLatestRestorableTime <p>
     *            A value that indicates whether to restore the DB cluster to
     *            the latest restorable backup time. By default, the DB cluster
     *            isn't restored to the latest restorable backup time.
     *            </p>
     *            <p>
     *            Constraints: Can't be specified if <code>RestoreToTime</code>
     *            parameter is provided.
     *            </p>
     */
    public void setUseLatestRestorableTime(Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
    }

    /**
     * <p>
     * A value that indicates whether to restore the DB cluster to the latest
     * restorable backup time. By default, the DB cluster isn't restored to the
     * latest restorable backup time.
     * </p>
     * <p>
     * Constraints: Can't be specified if <code>RestoreToTime</code> parameter
     * is provided.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param useLatestRestorableTime <p>
     *            A value that indicates whether to restore the DB cluster to
     *            the latest restorable backup time. By default, the DB cluster
     *            isn't restored to the latest restorable backup time.
     *            </p>
     *            <p>
     *            Constraints: Can't be specified if <code>RestoreToTime</code>
     *            parameter is provided.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withUseLatestRestorableTime(
            Boolean useLatestRestorableTime) {
        this.useLatestRestorableTime = useLatestRestorableTime;
        return this;
    }

    /**
     * <p>
     * The port number on which the new DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     *
     * @return <p>
     *         The port number on which the new DB cluster accepts connections.
     *         </p>
     *         <p>
     *         Constraints: A value from <code>1150-65535</code>.
     *         </p>
     *         <p>
     *         Default: The default port for the engine.
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
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
     * </p>
     *
     * @param port <p>
     *            The port number on which the new DB cluster accepts
     *            connections.
     *            </p>
     *            <p>
     *            Constraints: A value from <code>1150-65535</code>.
     *            </p>
     *            <p>
     *            Default: The default port for the engine.
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
     * Constraints: A value from <code>1150-65535</code>.
     * </p>
     * <p>
     * Default: The default port for the engine.
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
     *            Constraints: A value from <code>1150-65535</code>.
     *            </p>
     *            <p>
     *            Default: The default port for the engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @return <p>
     *         The DB subnet group name to use for the new DB cluster.
     *         </p>
     *         <p>
     *         Constraints: If supplied, must match the name of an existing
     *         DBSubnetGroup.
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
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            The DB subnet group name to use for the new DB cluster.
     *            </p>
     *            <p>
     *            Constraints: If supplied, must match the name of an existing
     *            DBSubnetGroup.
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
     * The DB subnet group name to use for the new DB cluster.
     * </p>
     * <p>
     * Constraints: If supplied, must match the name of an existing
     * DBSubnetGroup.
     * </p>
     * <p>
     * Example: <code>mySubnetgroup</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            The DB subnet group name to use for the new DB cluster.
     *            </p>
     *            <p>
     *            Constraints: If supplied, must match the name of an existing
     *            DBSubnetGroup.
     *            </p>
     *            <p>
     *            Example: <code>mySubnetgroup</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     *
     * @return <p>
     *         The name of the option group for the new DB cluster.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     *
     * @param optionGroupName <p>
     *            The name of the option group for the new DB cluster.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The name of the option group for the new DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The name of the option group for the new DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     *
     * @return <p>
     *         A list of VPC security groups that the new DB cluster belongs to.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the new DB cluster belongs
     *            to.
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
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the new DB cluster belongs
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withVpcSecurityGroupIds(
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
     * A list of VPC security groups that the new DB cluster belongs to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the new DB cluster belongs
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A list of tags. For more information, see <a href=
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
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
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
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withTags(Tag... tags) {
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
     * A list of tags. For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     * >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            A list of tags. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Tagging.html"
     *            >Tagging Amazon RDS Resources</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a
     * KMS key that is different than the KMS key used to encrypt the source DB
     * cluster. The new DB cluster is encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted
     * using the KMS key that was used to encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't
     * encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't
     * encrypted, then the restore request is rejected.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key identifier to use when restoring an encrypted DB
     *         cluster from an encrypted DB cluster.
     *         </p>
     *         <p>
     *         The KMS key identifier is the Amazon Resource Name (ARN) for the
     *         KMS encryption key. If you are restoring a DB cluster with the
     *         same AWS account that owns the KMS encryption key used to encrypt
     *         the new DB cluster, then you can use the KMS key alias instead of
     *         the ARN for the KMS encryption key.
     *         </p>
     *         <p>
     *         You can restore to a new DB cluster and encrypt the new DB
     *         cluster with a KMS key that is different than the KMS key used to
     *         encrypt the source DB cluster. The new DB cluster is encrypted
     *         with the KMS key identified by the <code>KmsKeyId</code>
     *         parameter.
     *         </p>
     *         <p>
     *         If you don't specify a value for the <code>KmsKeyId</code>
     *         parameter, then the following occurs:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the DB cluster is encrypted, then the restored DB cluster is
     *         encrypted using the KMS key that was used to encrypt the source
     *         DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the DB cluster isn't encrypted, then the restored DB cluster
     *         isn't encrypted.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBClusterIdentifier</code> refers to a DB cluster that
     *         isn't encrypted, then the restore request is rejected.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a
     * KMS key that is different than the KMS key used to encrypt the source DB
     * cluster. The new DB cluster is encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted
     * using the KMS key that was used to encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't
     * encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't
     * encrypted, then the restore request is rejected.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier to use when restoring an encrypted
     *            DB cluster from an encrypted DB cluster.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are restoring a DB cluster with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB cluster, then you can use the KMS key alias
     *            instead of the ARN for the KMS encryption key.
     *            </p>
     *            <p>
     *            You can restore to a new DB cluster and encrypt the new DB
     *            cluster with a KMS key that is different than the KMS key used
     *            to encrypt the source DB cluster. The new DB cluster is
     *            encrypted with the KMS key identified by the
     *            <code>KmsKeyId</code> parameter.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then the following occurs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the DB cluster is encrypted, then the restored DB cluster
     *            is encrypted using the KMS key that was used to encrypt the
     *            source DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the DB cluster isn't encrypted, then the restored DB
     *            cluster isn't encrypted.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>DBClusterIdentifier</code> refers to a DB cluster
     *            that isn't encrypted, then the restore request is rejected.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key identifier to use when restoring an encrypted DB cluster
     * from an encrypted DB cluster.
     * </p>
     * <p>
     * The KMS key identifier is the Amazon Resource Name (ARN) for the KMS
     * encryption key. If you are restoring a DB cluster with the same AWS
     * account that owns the KMS encryption key used to encrypt the new DB
     * cluster, then you can use the KMS key alias instead of the ARN for the
     * KMS encryption key.
     * </p>
     * <p>
     * You can restore to a new DB cluster and encrypt the new DB cluster with a
     * KMS key that is different than the KMS key used to encrypt the source DB
     * cluster. The new DB cluster is encrypted with the KMS key identified by
     * the <code>KmsKeyId</code> parameter.
     * </p>
     * <p>
     * If you don't specify a value for the <code>KmsKeyId</code> parameter,
     * then the following occurs:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the DB cluster is encrypted, then the restored DB cluster is encrypted
     * using the KMS key that was used to encrypt the source DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the DB cluster isn't encrypted, then the restored DB cluster isn't
     * encrypted.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBClusterIdentifier</code> refers to a DB cluster that isn't
     * encrypted, then the restore request is rejected.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key identifier to use when restoring an encrypted
     *            DB cluster from an encrypted DB cluster.
     *            </p>
     *            <p>
     *            The KMS key identifier is the Amazon Resource Name (ARN) for
     *            the KMS encryption key. If you are restoring a DB cluster with
     *            the same AWS account that owns the KMS encryption key used to
     *            encrypt the new DB cluster, then you can use the KMS key alias
     *            instead of the ARN for the KMS encryption key.
     *            </p>
     *            <p>
     *            You can restore to a new DB cluster and encrypt the new DB
     *            cluster with a KMS key that is different than the KMS key used
     *            to encrypt the source DB cluster. The new DB cluster is
     *            encrypted with the KMS key identified by the
     *            <code>KmsKeyId</code> parameter.
     *            </p>
     *            <p>
     *            If you don't specify a value for the <code>KmsKeyId</code>
     *            parameter, then the following occurs:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the DB cluster is encrypted, then the restored DB cluster
     *            is encrypted using the KMS key that was used to encrypt the
     *            source DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the DB cluster isn't encrypted, then the restored DB
     *            cluster isn't encrypted.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>DBClusterIdentifier</code> refers to a DB cluster
     *            that isn't encrypted, then the restore request is rejected.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withKmsKeyId(String kmsKeyId) {
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
    public RestoreDBClusterToPointInTimeRequest withEnableIAMDatabaseAuthentication(
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
    public RestoreDBClusterToPointInTimeRequest withBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
        return this;
    }

    /**
     * <p>
     * The list of logs that the restored DB cluster is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of logs that the restored DB cluster is to export to
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
     * The list of logs that the restored DB cluster is to export to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs</a> in the <i>Amazon
     * Aurora User Guide</i>.
     * </p>
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of logs that the restored DB cluster is to export to
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
     * The list of logs that the restored DB cluster is to export to CloudWatch
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
     *            The list of logs that the restored DB cluster is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withEnableCloudwatchLogsExports(
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
     * The list of logs that the restored DB cluster is to export to CloudWatch
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
     *            The list of logs that the restored DB cluster is to export to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs</a> in the
     *            <i>Amazon Aurora User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RestoreDBClusterToPointInTimeRequest withEnableCloudwatchLogsExports(
            java.util.Collection<String> enableCloudwatchLogsExports) {
        setEnableCloudwatchLogsExports(enableCloudwatchLogsExports);
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
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
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
     *         If supplied, must match the name of an existing DB cluster
     *         parameter group.
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
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
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
     *            If supplied, must match the name of an existing DB cluster
     *            parameter group.
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
     * If supplied, must match the name of an existing DB cluster parameter
     * group.
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
     *            If supplied, must match the name of an existing DB cluster
     *            parameter group.
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
    public RestoreDBClusterToPointInTimeRequest withDBClusterParameterGroupName(
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
    public RestoreDBClusterToPointInTimeRequest withDeletionProtection(Boolean deletionProtection) {
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
    public RestoreDBClusterToPointInTimeRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
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
     *         Specify the Active Directory directory ID to restore the DB
     *         cluster in. The domain must be created prior to this operation.
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
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
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
     *            Specify the Active Directory directory ID to restore the DB
     *            cluster in. The domain must be created prior to this
     *            operation.
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
     * Specify the Active Directory directory ID to restore the DB cluster in.
     * The domain must be created prior to this operation.
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
     *            Specify the Active Directory directory ID to restore the DB
     *            cluster in. The domain must be created prior to this
     *            operation.
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
    public RestoreDBClusterToPointInTimeRequest withDomain(String domain) {
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
    public RestoreDBClusterToPointInTimeRequest withDomainIAMRoleName(String domainIAMRoleName) {
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
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getRestoreType() != null)
            sb.append("RestoreType: " + getRestoreType() + ",");
        if (getSourceDBClusterIdentifier() != null)
            sb.append("SourceDBClusterIdentifier: " + getSourceDBClusterIdentifier() + ",");
        if (getRestoreToTime() != null)
            sb.append("RestoreToTime: " + getRestoreToTime() + ",");
        if (getUseLatestRestorableTime() != null)
            sb.append("UseLatestRestorableTime: " + getUseLatestRestorableTime() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
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
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreType() == null) ? 0 : getRestoreType().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceDBClusterIdentifier() == null) ? 0 : getSourceDBClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getRestoreToTime() == null) ? 0 : getRestoreToTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getUseLatestRestorableTime() == null) ? 0 : getUseLatestRestorableTime()
                        .hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
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

        if (obj instanceof RestoreDBClusterToPointInTimeRequest == false)
            return false;
        RestoreDBClusterToPointInTimeRequest other = (RestoreDBClusterToPointInTimeRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getRestoreType() == null ^ this.getRestoreType() == null)
            return false;
        if (other.getRestoreType() != null
                && other.getRestoreType().equals(this.getRestoreType()) == false)
            return false;
        if (other.getSourceDBClusterIdentifier() == null
                ^ this.getSourceDBClusterIdentifier() == null)
            return false;
        if (other.getSourceDBClusterIdentifier() != null
                && other.getSourceDBClusterIdentifier().equals(this.getSourceDBClusterIdentifier()) == false)
            return false;
        if (other.getRestoreToTime() == null ^ this.getRestoreToTime() == null)
            return false;
        if (other.getRestoreToTime() != null
                && other.getRestoreToTime().equals(this.getRestoreToTime()) == false)
            return false;
        if (other.getUseLatestRestorableTime() == null ^ this.getUseLatestRestorableTime() == null)
            return false;
        if (other.getUseLatestRestorableTime() != null
                && other.getUseLatestRestorableTime().equals(this.getUseLatestRestorableTime()) == false)
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
