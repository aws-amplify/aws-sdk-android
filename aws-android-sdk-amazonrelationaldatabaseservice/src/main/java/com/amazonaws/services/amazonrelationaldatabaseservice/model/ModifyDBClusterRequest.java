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
 * Modify a setting for an Amazon Aurora DB cluster. You can change one or more
 * database configuration parameters by specifying these parameters and the new
 * values in the request. For more information on Amazon Aurora, see <a href=
 * "https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/CHAP_AuroraOverview.html"
 * > What Is Amazon Aurora?</a> in the <i>Amazon Aurora User Guide.</i>
 * </p>
 * <note>
 * <p>
 * This action only applies to Aurora DB clusters.
 * </p>
 * </note>
 */
public class ModifyDBClusterRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB
     * cluster.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     */
    private String newDBClusterIdentifier;

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for the
     * DB cluster. If this parameter is disabled, changes to the DB cluster are
     * applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the
     * <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values. If the <code>ApplyImmediately</code> parameter is disabled, then
     * changes to the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values are applied during the next maintenance window. All other changes
     * are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     */
    private Boolean applyImmediately;

    /**
     * <p>
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
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
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     */
    private String dBClusterParameterGroupName;

    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The new password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group. Changing this parameter doesn't result in an
     * outage except in the following case, and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code> is
     * enabled for this request. If the parameter change results in an option
     * group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted.
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
     * automated backups are enabled, using the
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
     * The configuration setting for the log types to be enabled for export to
     * CloudWatch Logs for a specific DB cluster.
     * </p>
     */
    private CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration;

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade.
     * Changing this parameter results in an outage. The change is applied
     * during the next maintenance window unless <code>ApplyImmediately</code>
     * is enabled.
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
     */
    private String engineVersion;

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a
     * value for the <code>EngineVersion</code> parameter that is a different
     * major version than the DB cluster's current version.
     * </p>
     */
    private Boolean allowMajorVersionUpgrade;

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the
     * <code>DBInstanceParameterGroupName</code> parameter, the DB cluster isn't
     * rebooted automatically. Also, parameter changes aren't applied during the
     * next maintenance window but instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as
     * this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in
     * combination with the <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     */
    private String dBInstanceParameterGroupName;

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify
     * <code>none</code> to remove the cluster from its current domain. The
     * domain must be created prior to this operation.
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
     * The scaling properties of the DB cluster. You can only modify scaling
     * properties for DB clusters in <code>serverless</code> DB engine mode.
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
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         The DB cluster identifier for the cluster being modified. This
     *         parameter isn't case-sensitive.
     *         </p>
     *         <p>
     *         Constraints: This identifier must match the identifier of an
     *         existing DB cluster.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB
     * cluster.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier for the cluster being modified. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints: This identifier must match the identifier of an
     *            existing DB cluster.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The DB cluster identifier for the cluster being modified. This parameter
     * isn't case-sensitive.
     * </p>
     * <p>
     * Constraints: This identifier must match the identifier of an existing DB
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The DB cluster identifier for the cluster being modified. This
     *            parameter isn't case-sensitive.
     *            </p>
     *            <p>
     *            Constraints: This identifier must match the identifier of an
     *            existing DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     *
     * @return <p>
     *         The new DB cluster identifier for the DB cluster when renaming a
     *         DB cluster. This value is stored as a lowercase string.
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
     *         The first character must be a letter
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't end with a hyphen or contain two consecutive hyphens
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Example: <code>my-cluster2</code>
     *         </p>
     */
    public String getNewDBClusterIdentifier() {
        return newDBClusterIdentifier;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     *
     * @param newDBClusterIdentifier <p>
     *            The new DB cluster identifier for the DB cluster when renaming
     *            a DB cluster. This value is stored as a lowercase string.
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
     *            The first character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster2</code>
     *            </p>
     */
    public void setNewDBClusterIdentifier(String newDBClusterIdentifier) {
        this.newDBClusterIdentifier = newDBClusterIdentifier;
    }

    /**
     * <p>
     * The new DB cluster identifier for the DB cluster when renaming a DB
     * cluster. This value is stored as a lowercase string.
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
     * The first character must be a letter
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't end with a hyphen or contain two consecutive hyphens
     * </p>
     * </li>
     * </ul>
     * <p>
     * Example: <code>my-cluster2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param newDBClusterIdentifier <p>
     *            The new DB cluster identifier for the DB cluster when renaming
     *            a DB cluster. This value is stored as a lowercase string.
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
     *            The first character must be a letter
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't end with a hyphen or contain two consecutive hyphens
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            Example: <code>my-cluster2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withNewDBClusterIdentifier(String newDBClusterIdentifier) {
        this.newDBClusterIdentifier = newDBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for the
     * DB cluster. If this parameter is disabled, changes to the DB cluster are
     * applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the
     * <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values. If the <code>ApplyImmediately</code> parameter is disabled, then
     * changes to the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values are applied during the next maintenance window. All other changes
     * are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the modifications in this request
     *         and any pending modifications are asynchronously applied as soon
     *         as possible, regardless of the
     *         <code>PreferredMaintenanceWindow</code> setting for the DB
     *         cluster. If this parameter is disabled, changes to the DB cluster
     *         are applied during the next maintenance window.
     *         </p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter only affects the
     *         <code>EnableIAMDatabaseAuthentication</code>,
     *         <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values. If the
     *         <code>ApplyImmediately</code> parameter is disabled, then changes
     *         to the <code>EnableIAMDatabaseAuthentication</code>,
     *         <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values are applied during the
     *         next maintenance window. All other changes are applied
     *         immediately, regardless of the value of the
     *         <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         By default, this parameter is disabled.
     *         </p>
     */
    public Boolean isApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for the
     * DB cluster. If this parameter is disabled, changes to the DB cluster are
     * applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the
     * <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values. If the <code>ApplyImmediately</code> parameter is disabled, then
     * changes to the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values are applied during the next maintenance window. All other changes
     * are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the modifications in this request
     *         and any pending modifications are asynchronously applied as soon
     *         as possible, regardless of the
     *         <code>PreferredMaintenanceWindow</code> setting for the DB
     *         cluster. If this parameter is disabled, changes to the DB cluster
     *         are applied during the next maintenance window.
     *         </p>
     *         <p>
     *         The <code>ApplyImmediately</code> parameter only affects the
     *         <code>EnableIAMDatabaseAuthentication</code>,
     *         <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values. If the
     *         <code>ApplyImmediately</code> parameter is disabled, then changes
     *         to the <code>EnableIAMDatabaseAuthentication</code>,
     *         <code>MasterUserPassword</code>, and
     *         <code>NewDBClusterIdentifier</code> values are applied during the
     *         next maintenance window. All other changes are applied
     *         immediately, regardless of the value of the
     *         <code>ApplyImmediately</code> parameter.
     *         </p>
     *         <p>
     *         By default, this parameter is disabled.
     *         </p>
     */
    public Boolean getApplyImmediately() {
        return applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for the
     * DB cluster. If this parameter is disabled, changes to the DB cluster are
     * applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the
     * <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values. If the <code>ApplyImmediately</code> parameter is disabled, then
     * changes to the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values are applied during the next maintenance window. All other changes
     * are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     *
     * @param applyImmediately <p>
     *            A value that indicates whether the modifications in this
     *            request and any pending modifications are asynchronously
     *            applied as soon as possible, regardless of the
     *            <code>PreferredMaintenanceWindow</code> setting for the DB
     *            cluster. If this parameter is disabled, changes to the DB
     *            cluster are applied during the next maintenance window.
     *            </p>
     *            <p>
     *            The <code>ApplyImmediately</code> parameter only affects the
     *            <code>EnableIAMDatabaseAuthentication</code>,
     *            <code>MasterUserPassword</code>, and
     *            <code>NewDBClusterIdentifier</code> values. If the
     *            <code>ApplyImmediately</code> parameter is disabled, then
     *            changes to the <code>EnableIAMDatabaseAuthentication</code>,
     *            <code>MasterUserPassword</code>, and
     *            <code>NewDBClusterIdentifier</code> values are applied during
     *            the next maintenance window. All other changes are applied
     *            immediately, regardless of the value of the
     *            <code>ApplyImmediately</code> parameter.
     *            </p>
     *            <p>
     *            By default, this parameter is disabled.
     *            </p>
     */
    public void setApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
    }

    /**
     * <p>
     * A value that indicates whether the modifications in this request and any
     * pending modifications are asynchronously applied as soon as possible,
     * regardless of the <code>PreferredMaintenanceWindow</code> setting for the
     * DB cluster. If this parameter is disabled, changes to the DB cluster are
     * applied during the next maintenance window.
     * </p>
     * <p>
     * The <code>ApplyImmediately</code> parameter only affects the
     * <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values. If the <code>ApplyImmediately</code> parameter is disabled, then
     * changes to the <code>EnableIAMDatabaseAuthentication</code>,
     * <code>MasterUserPassword</code>, and <code>NewDBClusterIdentifier</code>
     * values are applied during the next maintenance window. All other changes
     * are applied immediately, regardless of the value of the
     * <code>ApplyImmediately</code> parameter.
     * </p>
     * <p>
     * By default, this parameter is disabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applyImmediately <p>
     *            A value that indicates whether the modifications in this
     *            request and any pending modifications are asynchronously
     *            applied as soon as possible, regardless of the
     *            <code>PreferredMaintenanceWindow</code> setting for the DB
     *            cluster. If this parameter is disabled, changes to the DB
     *            cluster are applied during the next maintenance window.
     *            </p>
     *            <p>
     *            The <code>ApplyImmediately</code> parameter only affects the
     *            <code>EnableIAMDatabaseAuthentication</code>,
     *            <code>MasterUserPassword</code>, and
     *            <code>NewDBClusterIdentifier</code> values. If the
     *            <code>ApplyImmediately</code> parameter is disabled, then
     *            changes to the <code>EnableIAMDatabaseAuthentication</code>,
     *            <code>MasterUserPassword</code>, and
     *            <code>NewDBClusterIdentifier</code> values are applied during
     *            the next maintenance window. All other changes are applied
     *            immediately, regardless of the value of the
     *            <code>ApplyImmediately</code> parameter.
     *            </p>
     *            <p>
     *            By default, this parameter is disabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withApplyImmediately(Boolean applyImmediately) {
        this.applyImmediately = applyImmediately;
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
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
     *         The number of days for which automated backups are retained. You
     *         must specify a minimum value of 1.
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
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
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
     *            You must specify a minimum value of 1.
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
     * The number of days for which automated backups are retained. You must
     * specify a minimum value of 1.
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
     *            You must specify a minimum value of 1.
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
    public ModifyDBClusterRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     *
     * @return <p>
     *         The name of the DB cluster parameter group to use for the DB
     *         cluster.
     *         </p>
     */
    public String getDBClusterParameterGroupName() {
        return dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to use for the DB
     *            cluster.
     *            </p>
     */
    public void setDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB cluster parameter group to use for the DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterParameterGroupName <p>
     *            The name of the DB cluster parameter group to use for the DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withDBClusterParameterGroupName(String dBClusterParameterGroupName) {
        this.dBClusterParameterGroupName = dBClusterParameterGroupName;
        return this;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     *
     * @return <p>
     *         A list of VPC security groups that the DB cluster will belong to.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the DB cluster will belong
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
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the DB cluster will belong
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of VPC security groups that the DB cluster will belong to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of VPC security groups that the DB cluster will belong
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     *
     * @return <p>
     *         The port number on which the DB cluster accepts connections.
     *         </p>
     *         <p>
     *         Constraints: Value must be <code>1150-65535</code>
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
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     *
     * @param port <p>
     *            The port number on which the DB cluster accepts connections.
     *            </p>
     *            <p>
     *            Constraints: Value must be <code>1150-65535</code>
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
     * The port number on which the DB cluster accepts connections.
     * </p>
     * <p>
     * Constraints: Value must be <code>1150-65535</code>
     * </p>
     * <p>
     * Default: The same port as the original DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the DB cluster accepts connections.
     *            </p>
     *            <p>
     *            Constraints: Value must be <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Default: The same port as the original DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The new password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     *
     * @return <p>
     *         The new password for the master database user. This password can
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
     * The new password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The new password for the master database user. This password
     *            can contain any printable ASCII character except "/",
     *            """, or "@".
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
     * The new password for the master database user. This password can contain
     * any printable ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            The new password for the master database user. This password
     *            can contain any printable ASCII character except "/",
     *            """, or "@".
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * A value that indicates that the DB cluster should be associated with the
     * specified option group. Changing this parameter doesn't result in an
     * outage except in the following case, and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code> is
     * enabled for this request. If the parameter change results in an option
     * group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group
     * can't be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         A value that indicates that the DB cluster should be associated
     *         with the specified option group. Changing this parameter doesn't
     *         result in an outage except in the following case, and the change
     *         is applied during the next maintenance window unless the
     *         <code>ApplyImmediately</code> is enabled for this request. If the
     *         parameter change results in an option group that enables OEM,
     *         this change can cause a brief (sub-second) period during which
     *         new connections are rejected but existing connections are not
     *         interrupted.
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
     * specified option group. Changing this parameter doesn't result in an
     * outage except in the following case, and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code> is
     * enabled for this request. If the parameter change results in an option
     * group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted.
     * </p>
     * <p>
     * Permanent options can't be removed from an option group. The option group
     * can't be removed from a DB cluster once it is associated with a DB
     * cluster.
     * </p>
     *
     * @param optionGroupName <p>
     *            A value that indicates that the DB cluster should be
     *            associated with the specified option group. Changing this
     *            parameter doesn't result in an outage except in the following
     *            case, and the change is applied during the next maintenance
     *            window unless the <code>ApplyImmediately</code> is enabled for
     *            this request. If the parameter change results in an option
     *            group that enables OEM, this change can cause a brief
     *            (sub-second) period during which new connections are rejected
     *            but existing connections are not interrupted.
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
     * specified option group. Changing this parameter doesn't result in an
     * outage except in the following case, and the change is applied during the
     * next maintenance window unless the <code>ApplyImmediately</code> is
     * enabled for this request. If the parameter change results in an option
     * group that enables OEM, this change can cause a brief (sub-second) period
     * during which new connections are rejected but existing connections are
     * not interrupted.
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
     *            associated with the specified option group. Changing this
     *            parameter doesn't result in an outage except in the following
     *            case, and the change is applied during the next maintenance
     *            window unless the <code>ApplyImmediately</code> is enabled for
     *            this request. If the parameter change results in an option
     *            group that enables OEM, this change can cause a brief
     *            (sub-second) period during which new connections are rejected
     *            but existing connections are not interrupted.
     *            </p>
     *            <p>
     *            Permanent options can't be removed from an option group. The
     *            option group can't be removed from a DB cluster once it is
     *            associated with a DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
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
     *         if automated backups are enabled, using the
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
     * automated backups are enabled, using the
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
     *            created if automated backups are enabled, using the
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
     * automated backups are enabled, using the
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
     *            created if automated backups are enabled, using the
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
    public ModifyDBClusterRequest withPreferredBackupWindow(String preferredBackupWindow) {
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
    public ModifyDBClusterRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
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
    public ModifyDBClusterRequest withEnableIAMDatabaseAuthentication(
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
    public ModifyDBClusterRequest withBacktrackWindow(Long backtrackWindow) {
        this.backtrackWindow = backtrackWindow;
        return this;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to
     * CloudWatch Logs for a specific DB cluster.
     * </p>
     *
     * @return <p>
     *         The configuration setting for the log types to be enabled for
     *         export to CloudWatch Logs for a specific DB cluster.
     *         </p>
     */
    public CloudwatchLogsExportConfiguration getCloudwatchLogsExportConfiguration() {
        return cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to
     * CloudWatch Logs for a specific DB cluster.
     * </p>
     *
     * @param cloudwatchLogsExportConfiguration <p>
     *            The configuration setting for the log types to be enabled for
     *            export to CloudWatch Logs for a specific DB cluster.
     *            </p>
     */
    public void setCloudwatchLogsExportConfiguration(
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
    }

    /**
     * <p>
     * The configuration setting for the log types to be enabled for export to
     * CloudWatch Logs for a specific DB cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cloudwatchLogsExportConfiguration <p>
     *            The configuration setting for the log types to be enabled for
     *            export to CloudWatch Logs for a specific DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withCloudwatchLogsExportConfiguration(
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration) {
        this.cloudwatchLogsExportConfiguration = cloudwatchLogsExportConfiguration;
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade.
     * Changing this parameter results in an outage. The change is applied
     * during the next maintenance window unless <code>ApplyImmediately</code>
     * is enabled.
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
     *
     * @return <p>
     *         The version number of the database engine to which you want to
     *         upgrade. Changing this parameter results in an outage. The change
     *         is applied during the next maintenance window unless
     *         <code>ApplyImmediately</code> is enabled.
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
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade.
     * Changing this parameter results in an outage. The change is applied
     * during the next maintenance window unless <code>ApplyImmediately</code>
     * is enabled.
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
     *
     * @param engineVersion <p>
     *            The version number of the database engine to which you want to
     *            upgrade. Changing this parameter results in an outage. The
     *            change is applied during the next maintenance window unless
     *            <code>ApplyImmediately</code> is enabled.
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
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version number of the database engine to which you want to upgrade.
     * Changing this parameter results in an outage. The change is applied
     * during the next maintenance window unless <code>ApplyImmediately</code>
     * is enabled.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the database engine to which you want to
     *            upgrade. Changing this parameter results in an outage. The
     *            change is applied during the next maintenance window unless
     *            <code>ApplyImmediately</code> is enabled.
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a
     * value for the <code>EngineVersion</code> parameter that is a different
     * major version than the DB cluster's current version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether major version upgrades are
     *         allowed.
     *         </p>
     *         <p>
     *         Constraints: You must allow major version upgrades when
     *         specifying a value for the <code>EngineVersion</code> parameter
     *         that is a different major version than the DB cluster's current
     *         version.
     *         </p>
     */
    public Boolean isAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a
     * value for the <code>EngineVersion</code> parameter that is a different
     * major version than the DB cluster's current version.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether major version upgrades are
     *         allowed.
     *         </p>
     *         <p>
     *         Constraints: You must allow major version upgrades when
     *         specifying a value for the <code>EngineVersion</code> parameter
     *         that is a different major version than the DB cluster's current
     *         version.
     *         </p>
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a
     * value for the <code>EngineVersion</code> parameter that is a different
     * major version than the DB cluster's current version.
     * </p>
     *
     * @param allowMajorVersionUpgrade <p>
     *            A value that indicates whether major version upgrades are
     *            allowed.
     *            </p>
     *            <p>
     *            Constraints: You must allow major version upgrades when
     *            specifying a value for the <code>EngineVersion</code>
     *            parameter that is a different major version than the DB
     *            cluster's current version.
     *            </p>
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether major version upgrades are allowed.
     * </p>
     * <p>
     * Constraints: You must allow major version upgrades when specifying a
     * value for the <code>EngineVersion</code> parameter that is a different
     * major version than the DB cluster's current version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allowMajorVersionUpgrade <p>
     *            A value that indicates whether major version upgrades are
     *            allowed.
     *            </p>
     *            <p>
     *            Constraints: You must allow major version upgrades when
     *            specifying a value for the <code>EngineVersion</code>
     *            parameter that is a different major version than the DB
     *            cluster's current version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the
     * <code>DBInstanceParameterGroupName</code> parameter, the DB cluster isn't
     * rebooted automatically. Also, parameter changes aren't applied during the
     * next maintenance window but instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as
     * this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in
     * combination with the <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the DB parameter group to apply to all instances of
     *         the DB cluster.
     *         </p>
     *         <note>
     *         <p>
     *         When you apply a parameter group using the
     *         <code>DBInstanceParameterGroupName</code> parameter, the DB
     *         cluster isn't rebooted automatically. Also, parameter changes
     *         aren't applied during the next maintenance window but instead are
     *         applied immediately.
     *         </p>
     *         </note>
     *         <p>
     *         Default: The existing name setting
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The DB parameter group must be in the same DB parameter group
     *         family as this DB cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>DBInstanceParameterGroupName</code> parameter is only
     *         valid in combination with the
     *         <code>AllowMajorVersionUpgrade</code> parameter.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getDBInstanceParameterGroupName() {
        return dBInstanceParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the
     * <code>DBInstanceParameterGroupName</code> parameter, the DB cluster isn't
     * rebooted automatically. Also, parameter changes aren't applied during the
     * next maintenance window but instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as
     * this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in
     * combination with the <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     *
     * @param dBInstanceParameterGroupName <p>
     *            The name of the DB parameter group to apply to all instances
     *            of the DB cluster.
     *            </p>
     *            <note>
     *            <p>
     *            When you apply a parameter group using the
     *            <code>DBInstanceParameterGroupName</code> parameter, the DB
     *            cluster isn't rebooted automatically. Also, parameter changes
     *            aren't applied during the next maintenance window but instead
     *            are applied immediately.
     *            </p>
     *            </note>
     *            <p>
     *            Default: The existing name setting
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The DB parameter group must be in the same DB parameter group
     *            family as this DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>DBInstanceParameterGroupName</code> parameter is
     *            only valid in combination with the
     *            <code>AllowMajorVersionUpgrade</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setDBInstanceParameterGroupName(String dBInstanceParameterGroupName) {
        this.dBInstanceParameterGroupName = dBInstanceParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to apply to all instances of the DB
     * cluster.
     * </p>
     * <note>
     * <p>
     * When you apply a parameter group using the
     * <code>DBInstanceParameterGroupName</code> parameter, the DB cluster isn't
     * rebooted automatically. Also, parameter changes aren't applied during the
     * next maintenance window but instead are applied immediately.
     * </p>
     * </note>
     * <p>
     * Default: The existing name setting
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The DB parameter group must be in the same DB parameter group family as
     * this DB cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>DBInstanceParameterGroupName</code> parameter is only valid in
     * combination with the <code>AllowMajorVersionUpgrade</code> parameter.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceParameterGroupName <p>
     *            The name of the DB parameter group to apply to all instances
     *            of the DB cluster.
     *            </p>
     *            <note>
     *            <p>
     *            When you apply a parameter group using the
     *            <code>DBInstanceParameterGroupName</code> parameter, the DB
     *            cluster isn't rebooted automatically. Also, parameter changes
     *            aren't applied during the next maintenance window but instead
     *            are applied immediately.
     *            </p>
     *            </note>
     *            <p>
     *            Default: The existing name setting
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            The DB parameter group must be in the same DB parameter group
     *            family as this DB cluster.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The <code>DBInstanceParameterGroupName</code> parameter is
     *            only valid in combination with the
     *            <code>AllowMajorVersionUpgrade</code> parameter.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withDBInstanceParameterGroupName(
            String dBInstanceParameterGroupName) {
        this.dBInstanceParameterGroupName = dBInstanceParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify
     * <code>none</code> to remove the cluster from its current domain. The
     * domain must be created prior to this operation.
     * </p>
     *
     * @return <p>
     *         The Active Directory directory ID to move the DB cluster to.
     *         Specify <code>none</code> to remove the cluster from its current
     *         domain. The domain must be created prior to this operation.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify
     * <code>none</code> to remove the cluster from its current domain. The
     * domain must be created prior to this operation.
     * </p>
     *
     * @param domain <p>
     *            The Active Directory directory ID to move the DB cluster to.
     *            Specify <code>none</code> to remove the cluster from its
     *            current domain. The domain must be created prior to this
     *            operation.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to move the DB cluster to. Specify
     * <code>none</code> to remove the cluster from its current domain. The
     * domain must be created prior to this operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            The Active Directory directory ID to move the DB cluster to.
     *            Specify <code>none</code> to remove the cluster from its
     *            current domain. The domain must be created prior to this
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withDomain(String domain) {
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
    public ModifyDBClusterRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
        return this;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling
     * properties for DB clusters in <code>serverless</code> DB engine mode.
     * </p>
     *
     * @return <p>
     *         The scaling properties of the DB cluster. You can only modify
     *         scaling properties for DB clusters in <code>serverless</code> DB
     *         engine mode.
     *         </p>
     */
    public ScalingConfiguration getScalingConfiguration() {
        return scalingConfiguration;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling
     * properties for DB clusters in <code>serverless</code> DB engine mode.
     * </p>
     *
     * @param scalingConfiguration <p>
     *            The scaling properties of the DB cluster. You can only modify
     *            scaling properties for DB clusters in <code>serverless</code>
     *            DB engine mode.
     *            </p>
     */
    public void setScalingConfiguration(ScalingConfiguration scalingConfiguration) {
        this.scalingConfiguration = scalingConfiguration;
    }

    /**
     * <p>
     * The scaling properties of the DB cluster. You can only modify scaling
     * properties for DB clusters in <code>serverless</code> DB engine mode.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scalingConfiguration <p>
     *            The scaling properties of the DB cluster. You can only modify
     *            scaling properties for DB clusters in <code>serverless</code>
     *            DB engine mode.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ModifyDBClusterRequest withScalingConfiguration(ScalingConfiguration scalingConfiguration) {
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
    public ModifyDBClusterRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
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
    public ModifyDBClusterRequest withEnableHttpEndpoint(Boolean enableHttpEndpoint) {
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
    public ModifyDBClusterRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
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
        if (getNewDBClusterIdentifier() != null)
            sb.append("NewDBClusterIdentifier: " + getNewDBClusterIdentifier() + ",");
        if (getApplyImmediately() != null)
            sb.append("ApplyImmediately: " + getApplyImmediately() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getDBClusterParameterGroupName() != null)
            sb.append("DBClusterParameterGroupName: " + getDBClusterParameterGroupName() + ",");
        if (getVpcSecurityGroupIds() != null)
            sb.append("VpcSecurityGroupIds: " + getVpcSecurityGroupIds() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPreferredBackupWindow() != null)
            sb.append("PreferredBackupWindow: " + getPreferredBackupWindow() + ",");
        if (getPreferredMaintenanceWindow() != null)
            sb.append("PreferredMaintenanceWindow: " + getPreferredMaintenanceWindow() + ",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: " + getEnableIAMDatabaseAuthentication()
                    + ",");
        if (getBacktrackWindow() != null)
            sb.append("BacktrackWindow: " + getBacktrackWindow() + ",");
        if (getCloudwatchLogsExportConfiguration() != null)
            sb.append("CloudwatchLogsExportConfiguration: "
                    + getCloudwatchLogsExportConfiguration() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getAllowMajorVersionUpgrade() != null)
            sb.append("AllowMajorVersionUpgrade: " + getAllowMajorVersionUpgrade() + ",");
        if (getDBInstanceParameterGroupName() != null)
            sb.append("DBInstanceParameterGroupName: " + getDBInstanceParameterGroupName() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() + ",");
        if (getScalingConfiguration() != null)
            sb.append("ScalingConfiguration: " + getScalingConfiguration() + ",");
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getEnableHttpEndpoint() != null)
            sb.append("EnableHttpEndpoint: " + getEnableHttpEndpoint() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime
                * hashCode
                + ((getNewDBClusterIdentifier() == null) ? 0 : getNewDBClusterIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getApplyImmediately() == null) ? 0 : getApplyImmediately().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterParameterGroupName() == null) ? 0
                        : getDBClusterParameterGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getVpcSecurityGroupIds() == null) ? 0 : getVpcSecurityGroupIds().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
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
                + ((getEnableIAMDatabaseAuthentication() == null) ? 0
                        : getEnableIAMDatabaseAuthentication().hashCode());
        hashCode = prime * hashCode
                + ((getBacktrackWindow() == null) ? 0 : getBacktrackWindow().hashCode());
        hashCode = prime
                * hashCode
                + ((getCloudwatchLogsExportConfiguration() == null) ? 0
                        : getCloudwatchLogsExportConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowMajorVersionUpgrade() == null) ? 0 : getAllowMajorVersionUpgrade()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getDBInstanceParameterGroupName() == null) ? 0
                        : getDBInstanceParameterGroupName().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getScalingConfiguration() == null) ? 0 : getScalingConfiguration().hashCode());
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
        hashCode = prime * hashCode
                + ((getEnableHttpEndpoint() == null) ? 0 : getEnableHttpEndpoint().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBClusterRequest == false)
            return false;
        ModifyDBClusterRequest other = (ModifyDBClusterRequest) obj;

        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
            return false;
        if (other.getNewDBClusterIdentifier() == null ^ this.getNewDBClusterIdentifier() == null)
            return false;
        if (other.getNewDBClusterIdentifier() != null
                && other.getNewDBClusterIdentifier().equals(this.getNewDBClusterIdentifier()) == false)
            return false;
        if (other.getApplyImmediately() == null ^ this.getApplyImmediately() == null)
            return false;
        if (other.getApplyImmediately() != null
                && other.getApplyImmediately().equals(this.getApplyImmediately()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
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
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
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
        if (other.getCloudwatchLogsExportConfiguration() == null
                ^ this.getCloudwatchLogsExportConfiguration() == null)
            return false;
        if (other.getCloudwatchLogsExportConfiguration() != null
                && other.getCloudwatchLogsExportConfiguration().equals(
                        this.getCloudwatchLogsExportConfiguration()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getAllowMajorVersionUpgrade() == null
                ^ this.getAllowMajorVersionUpgrade() == null)
            return false;
        if (other.getAllowMajorVersionUpgrade() != null
                && other.getAllowMajorVersionUpgrade().equals(this.getAllowMajorVersionUpgrade()) == false)
            return false;
        if (other.getDBInstanceParameterGroupName() == null
                ^ this.getDBInstanceParameterGroupName() == null)
            return false;
        if (other.getDBInstanceParameterGroupName() != null
                && other.getDBInstanceParameterGroupName().equals(
                        this.getDBInstanceParameterGroupName()) == false)
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
        return true;
    }
}
