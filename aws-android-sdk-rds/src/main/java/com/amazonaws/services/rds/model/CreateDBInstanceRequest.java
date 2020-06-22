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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Creates a new DB instance.
 * </p>
 */
public class CreateDBInstanceRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, the default "postgres" database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be
     * letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify
     * <code>null</code>, the default value <code>ORCL</code> is used. You can't
     * specify the string NULL, or any other reserved word, for
     * <code>DBName</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB
     * cluster is created. If this parameter isn't specified, no database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
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
     * The amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount
     * of data in your database increases, though you are only charged for the
     * space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
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
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     */
    private String engine;

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MariaDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 128 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
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
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for Oracle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 30 letters or numbers.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
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
     * A list of Amazon EC2 VPC security groups to associate with this DB
     * instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed
     * by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     */
    private java.util.List<String> vpcSecurityGroupIds;

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
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
     * <note>
     * <p>
     * If you're creating a DB instance in an RDS on VMware environment, specify
     * the identifier of the custom Availability Zone to create the DB instance
     * in.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * </note>
     */
    private String availabilityZone;

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
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
     * The name of the DB parameter group to associate with this DB instance. If
     * you do not specify a value, then the default DB parameter group for the
     * specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
    private String dBParameterGroupName;

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by
     * the DB cluster.
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
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is
     * managed by the DB cluster.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a> in the
     * <i>Amazon RDS User Guide</i>.
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
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>,
     * <code>1434</code>, <code>3260</code>, <code>3343</code>,
     * <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * You can't set the <code>AvailabilityZone</code> parameter if the DB
     * instance is a Multi-AZ deployment.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, use the
     * <code>DescribeDBEngineVersions</code> action.
     * </p>
     * <p>
     * The following are the database engines and links to information about the
     * major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by
     * the DB instance is managed by the DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     * >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     * >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     * >Supported PostgreSQL Database Versions</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are applied automatically.
     * </p>
     */
    private Boolean autoMinorVersionUpgrade;

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances,
     * must be a multiple between .5 and 50 of the storage amount for the DB
     * instance. For SQL Server DB instances, must be a multiple between 1 and
     * 50 of the storage amount for the DB instance.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified
     * option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group. Also, that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more
     * information, see <code>CreateDBCluster</code>.
     * </p>
     */
    private String characterSetName;

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether
     * <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target region doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target region has an Internet gateway attached
     * to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an Internet gateway attached to
     * it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     */
    private Boolean publiclyAccessible;

    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     */
    private String dBClusterIdentifier;

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     */
    private String tdeCredentialArn;

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     */
    private String tdeCredentialPassword;

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default,
     * it isn't encrypted.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB
     * cluster.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The KMS key identifier is managed by the DB cluster. For
     * more information, see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a
     * value for the <code>KmsKeyId</code> parameter, then Amazon RDS will use
     * your default encryption key. AWS KMS creates the default encryption key
     * for your AWS account. Your AWS account has a different default encryption
     * key for each AWS Region.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in.
     * Currently, only Microsoft SQL Server and Oracle DB instances can be
     * created in an Active Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     */
    private String domain;

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     * </p>
     */
    private Boolean copyTagsToSnapshot;

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     */
    private Integer monitoringInterval;

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to Amazon CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on
     * creating a monitoring role, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide</i>.
     * </p>
     * <p>
     * If <code>MonitoringInterval</code> is set to a value other than 0, then
     * you must supply a <code>MonitoringRoleArn</code> value.
     * </p>
     */
    private String monitoringRoleArn;

    /**
     * <p>
     * Specify the name of the IAM role to be used when making API calls to the
     * Directory Service.
     * </p>
     */
    private String domainIAMRoleName;

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
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
     * </p>
     */
    private Integer promotionTier;

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently
     * supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     */
    private String timezone;

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database
     * engines:
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed
     * by the DB cluster.
     * </p>
     * <p>
     * <b>MySQL</b>
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
     * For MySQL 8.0, minor version 8.0.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For PostgreSQL 9.5, minor version 9.5.15 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For PostgreSQL 9.6, minor version 9.6.11 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * PostgreSQL 10.6, 10.7, and 10.9
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     */
    private Boolean enableIAMDatabaseAuthentication;

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
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
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
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Relational Database Service User Guide</i>.
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
     * A value that indicates whether the DB instance has deletion protection
     * enabled. The database can't be deleted when deletion protection is
     * enabled. By default, deletion protection is disabled. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_DeleteInstance.html"
     * > Deleting a DB Instance</a>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB
     * cluster. For more information, see <code>CreateDBCluster</code>. DB
     * instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
     * </p>
     */
    private Boolean deletionProtection;

    /**
     * <p>
     * The upper limit to which Amazon RDS can automatically scale the storage
     * of the DB instance.
     * </p>
     */
    private Integer maxAllocatedStorage;

    /**
     * <p>
     * The meaning of this parameter differs according to the database engine
     * you use.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, the default "postgres" database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be
     * letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify
     * <code>null</code>, the default value <code>ORCL</code> is used. You can't
     * specify the string NULL, or any other reserved word, for
     * <code>DBName</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB
     * cluster is created. If this parameter isn't specified, no database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The meaning of this parameter differs according to the database
     *         engine you use.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is
     *         created. If this parameter isn't specified, no database is
     *         created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is
     *         created. If this parameter isn't specified, no database is
     *         created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the DB instance is
     *         created. If this parameter isn't specified, the default
     *         "postgres" database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 63 letters, numbers, or underscores.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must begin with a letter or an underscore. Subsequent characters
     *         can be letters, underscores, or digits (0-9).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         The Oracle System ID (SID) of the created DB instance. If you
     *         specify <code>null</code>, the default value <code>ORCL</code> is
     *         used. You can't specify the string NULL, or any other reserved
     *         word, for <code>DBName</code>.
     *         </p>
     *         <p>
     *         Default: <code>ORCL</code>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Can't be longer than 8 characters
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Not applicable. Must be null.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         The name of the database to create when the primary instance of
     *         the DB cluster is created. If this parameter isn't specified, no
     *         database is created in the DB instance.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must contain 1 to 64 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a word reserved by the specified database engine
     *         </p>
     *         </li>
     *         </ul>
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
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, the default "postgres" database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be
     * letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify
     * <code>null</code>, the default value <code>ORCL</code> is used. You can't
     * specify the string NULL, or any other reserved word, for
     * <code>DBName</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB
     * cluster is created. If this parameter isn't specified, no database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     *
     * @param dBName <p>
     *            The meaning of this parameter differs according to the
     *            database engine you use.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the DB instance is
     *            created. If this parameter isn't specified, no database is
     *            created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 64 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the DB instance is
     *            created. If this parameter isn't specified, no database is
     *            created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 64 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the DB instance is
     *            created. If this parameter isn't specified, the default
     *            "postgres" database is created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 63 letters, numbers, or underscores.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must begin with a letter or an underscore. Subsequent
     *            characters can be letters, underscores, or digits (0-9).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            The Oracle System ID (SID) of the created DB instance. If you
     *            specify <code>null</code>, the default value <code>ORCL</code>
     *            is used. You can't specify the string NULL, or any other
     *            reserved word, for <code>DBName</code>.
     *            </p>
     *            <p>
     *            Default: <code>ORCL</code>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can't be longer than 8 characters
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Not applicable. Must be null.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the primary instance
     *            of the DB cluster is created. If this parameter isn't
     *            specified, no database is created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 64 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
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
     * <b>MySQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, no database is created in the DB
     * instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * The name of the database to create when the DB instance is created. If
     * this parameter isn't specified, the default "postgres" database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 63 letters, numbers, or underscores.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must begin with a letter or an underscore. Subsequent characters can be
     * letters, underscores, or digits (0-9).
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * The Oracle System ID (SID) of the created DB instance. If you specify
     * <code>null</code>, the default value <code>ORCL</code> is used. You can't
     * specify the string NULL, or any other reserved word, for
     * <code>DBName</code>.
     * </p>
     * <p>
     * Default: <code>ORCL</code>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Can't be longer than 8 characters
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Not applicable. Must be null.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * The name of the database to create when the primary instance of the DB
     * cluster is created. If this parameter isn't specified, no database is
     * created in the DB instance.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must contain 1 to 64 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a word reserved by the specified database engine
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBName <p>
     *            The meaning of this parameter differs according to the
     *            database engine you use.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the DB instance is
     *            created. If this parameter isn't specified, no database is
     *            created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 64 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the DB instance is
     *            created. If this parameter isn't specified, no database is
     *            created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 64 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the DB instance is
     *            created. If this parameter isn't specified, the default
     *            "postgres" database is created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 63 letters, numbers, or underscores.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must begin with a letter or an underscore. Subsequent
     *            characters can be letters, underscores, or digits (0-9).
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            The Oracle System ID (SID) of the created DB instance. If you
     *            specify <code>null</code>, the default value <code>ORCL</code>
     *            is used. You can't specify the string NULL, or any other
     *            reserved word, for <code>DBName</code>.
     *            </p>
     *            <p>
     *            Default: <code>ORCL</code>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Can't be longer than 8 characters
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Not applicable. Must be null.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            The name of the database to create when the primary instance
     *            of the DB cluster is created. If this parameter isn't
     *            specified, no database is created in the DB instance.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must contain 1 to 64 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a word reserved by the specified database engine
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withDBName(String dBName) {
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
    public CreateDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount
     * of data in your database increases, though you are only charged for the
     * space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The amount of storage (in gibibytes) to allocate for the DB
     *         instance.
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Aurora cluster volumes automatically grow as the
     *         amount of data in your database increases, though you are only
     *         charged for the space that you use in an Aurora cluster volume.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2): Must be an integer from 20
     *         to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to
     *         65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 5 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2): Must be an integer from 20
     *         to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to
     *         65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 5 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2): Must be an integer from 20
     *         to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to
     *         65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 5 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2): Must be an integer from 20
     *         to 65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1): Must be an integer from 100 to
     *         65536.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard): Must be an integer from 10 to 3072.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints to the amount of storage for each storage type are
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         General Purpose (SSD) storage (gp2):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enterprise and Standard editions: Must be an integer from 200 to
     *         16384.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Web and Express editions: Must be an integer from 20 to 16384.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Provisioned IOPS storage (io1):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enterprise and Standard editions: Must be an integer from 200 to
     *         16384.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Web and Express editions: Must be an integer from 100 to 16384.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         Magnetic storage (standard):
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Enterprise and Standard editions: Must be an integer from 200 to
     *         1024.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Web and Express editions: Must be an integer from 20 to 1024.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         </ul>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount
     * of data in your database increases, though you are only charged for the
     * space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gibibytes) to allocate for the DB
     *            instance.
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Aurora cluster volumes automatically grow as
     *            the amount of data in your database increases, though you are
     *            only charged for the space that you use in an Aurora cluster
     *            volume.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 5 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 5 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 5 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 10 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2):
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Enterprise and Standard editions: Must be an integer from 200
     *            to 16384.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Web and Express editions: Must be an integer from 20 to 16384.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1):
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Enterprise and Standard editions: Must be an integer from 200
     *            to 16384.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Web and Express editions: Must be an integer from 100 to
     *            16384.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard):
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Enterprise and Standard editions: Must be an integer from 200
     *            to 1024.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Web and Express editions: Must be an integer from 20 to 1024.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * The amount of storage (in gibibytes) to allocate for the DB instance.
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Aurora cluster volumes automatically grow as the amount
     * of data in your database increases, though you are only charged for the
     * space that you use in an Aurora cluster volume.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 5 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2): Must be an integer from 20 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1): Must be an integer from 100 to 65536.
     * </p>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard): Must be an integer from 10 to 3072.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Constraints to the amount of storage for each storage type are the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * General Purpose (SSD) storage (gp2):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Provisioned IOPS storage (io1):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 16384.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 100 to 16384.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * Magnetic storage (standard):
     * </p>
     * <ul>
     * <li>
     * <p>
     * Enterprise and Standard editions: Must be an integer from 200 to 1024.
     * </p>
     * </li>
     * <li>
     * <p>
     * Web and Express editions: Must be an integer from 20 to 1024.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            The amount of storage (in gibibytes) to allocate for the DB
     *            instance.
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Aurora cluster volumes automatically grow as
     *            the amount of data in your database increases, though you are
     *            only charged for the space that you use in an Aurora cluster
     *            volume.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 5 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 5 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 5 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2): Must be an integer from
     *            20 to 65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1): Must be an integer from 100 to
     *            65536.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard): Must be an integer from 10 to
     *            3072.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Constraints to the amount of storage for each storage type are
     *            the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            General Purpose (SSD) storage (gp2):
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Enterprise and Standard editions: Must be an integer from 200
     *            to 16384.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Web and Express editions: Must be an integer from 20 to 16384.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Provisioned IOPS storage (io1):
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Enterprise and Standard editions: Must be an integer from 200
     *            to 16384.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Web and Express editions: Must be an integer from 100 to
     *            16384.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            Magnetic storage (standard):
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Enterprise and Standard editions: Must be an integer from 200
     *            to 1024.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Web and Express editions: Must be an integer from 20 to 1024.
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withAllocatedStorage(Integer allocatedStorage) {
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
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The name of the database engine to be used for this instance.
     *         </p>
     *         <p>
     *         Not every database engine is available for every AWS Region.
     *         </p>
     *         <p>
     *         Valid Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>aurora-postgresql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mariadb</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>mysql</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se2</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se1</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>oracle-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>postgres</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ee</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-se</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-ex</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>sqlserver-web</code>
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     *
     * @param engine <p>
     *            The name of the database engine to be used for this instance.
     *            </p>
     *            <p>
     *            Not every database engine is available for every AWS Region.
     *            </p>
     *            <p>
     *            Valid Values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>aurora-postgresql</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mariadb</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mysql</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se2</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se1</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>postgres</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ex</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-web</code>
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine to be used for this instance.
     * </p>
     * <p>
     * Not every database engine is available for every AWS Region.
     * </p>
     * <p>
     * Valid Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>aurora-postgresql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mariadb</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>mysql</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se2</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se1</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>oracle-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>postgres</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ee</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-se</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-ex</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>sqlserver-web</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the database engine to be used for this instance.
     *            </p>
     *            <p>
     *            Not every database engine is available for every AWS Region.
     *            </p>
     *            <p>
     *            Valid Values:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>aurora</code> (for MySQL 5.6-compatible Aurora)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>aurora-mysql</code> (for MySQL 5.7-compatible Aurora)
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>aurora-postgresql</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mariadb</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>mysql</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se2</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se1</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>oracle-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>postgres</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ee</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-se</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-ex</code>
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>sqlserver-web</code>
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The name for the master user.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MariaDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 128 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
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
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for Oracle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 30 letters or numbers.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers.
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
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The name for the master user is managed by the DB
     *         cluster.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for MariaDB.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 16 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for SQL Server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 128 letters or numbers.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The first character must be a letter.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be a reserved word for the chosen database engine.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for MySQL.
     *         </p>
     *         </li>
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
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for Oracle.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 30 letters or numbers.
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
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Required for PostgreSQL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Must be 1 to 63 letters or numbers.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MariaDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 128 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
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
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for Oracle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 30 letters or numbers.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers.
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
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The name for the master user is managed by the
     *            DB cluster.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for MariaDB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 16 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a reserved word for the chosen database engine.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Microsoft SQL Server</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for SQL Server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 128 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a reserved word for the chosen database engine.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for MySQL.
     *            </p>
     *            </li>
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
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for Oracle.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 30 letters or numbers.
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
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for PostgreSQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 63 letters or numbers.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The name for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MariaDB.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 16 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for SQL Server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 128 letters or numbers.
     * </p>
     * </li>
     * <li>
     * <p>
     * The first character must be a letter.
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be a reserved word for the chosen database engine.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for MySQL.
     * </p>
     * </li>
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
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for Oracle.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 30 letters or numbers.
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
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Required for PostgreSQL.
     * </p>
     * </li>
     * <li>
     * <p>
     * Must be 1 to 63 letters or numbers.
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
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The name for the master user is managed by the
     *            DB cluster.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for MariaDB.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 16 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a reserved word for the chosen database engine.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>Microsoft SQL Server</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for SQL Server.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 128 letters or numbers.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            The first character must be a letter.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be a reserved word for the chosen database engine.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for MySQL.
     *            </p>
     *            </li>
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
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for Oracle.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 30 letters or numbers.
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
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Required for PostgreSQL.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Must be 1 to 63 letters or numbers.
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
    public CreateDBInstanceRequest withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The password for the master user. The password can include any printable
     * ASCII character except "/", """, or "@".
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     *
     * @return <p>
     *         The password for the master user. The password can include any
     *         printable ASCII character except "/", """, or "@".
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The password for the master user is managed by
     *         the DB cluster.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 41 characters.
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 30 characters.
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Constraints: Must contain from 8 to 128 characters.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     *
     * @param masterUserPassword <p>
     *            The password for the master user. The password can include any
     *            printable ASCII character except "/", """, or "@".
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The password for the master user is managed by
     *            the DB cluster.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     *            <p>
     *            <b>Microsoft SQL Server</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 128 characters.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 30 characters.
     *            </p>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 128 characters.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The password for the master user is managed by the DB
     * cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 41 characters.
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 30 characters.
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Constraints: Must contain from 8 to 128 characters.
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
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The password for the master user is managed by
     *            the DB cluster.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     *            <p>
     *            <b>Microsoft SQL Server</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 128 characters.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 41 characters.
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 30 characters.
     *            </p>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Constraints: Must contain from 8 to 128 characters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withMasterUserPassword(String masterUserPassword) {
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
    public CreateDBInstanceRequest withDBSecurityGroups(String... dBSecurityGroups) {
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
    public CreateDBInstanceRequest withDBSecurityGroups(
            java.util.Collection<String> dBSecurityGroups) {
        setDBSecurityGroups(dBSecurityGroups);
        return this;
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB
     * instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed
     * by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     *
     * @return <p>
     *         A list of Amazon EC2 VPC security groups to associate with this
     *         DB instance.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The associated list of EC2 VPC security groups is
     *         managed by the DB cluster.
     *         </p>
     *         <p>
     *         Default: The default EC2 VPC security group for the DB subnet
     *         group's VPC.
     *         </p>
     */
    public java.util.List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * <p>
     * A list of Amazon EC2 VPC security groups to associate with this DB
     * instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed
     * by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of Amazon EC2 VPC security groups to associate with
     *            this DB instance.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The associated list of EC2 VPC security groups
     *            is managed by the DB cluster.
     *            </p>
     *            <p>
     *            Default: The default EC2 VPC security group for the DB subnet
     *            group's VPC.
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
     * A list of Amazon EC2 VPC security groups to associate with this DB
     * instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed
     * by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of Amazon EC2 VPC security groups to associate with
     *            this DB instance.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The associated list of EC2 VPC security groups
     *            is managed by the DB cluster.
     *            </p>
     *            <p>
     *            Default: The default EC2 VPC security group for the DB subnet
     *            group's VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withVpcSecurityGroupIds(String... vpcSecurityGroupIds) {
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
     * A list of Amazon EC2 VPC security groups to associate with this DB
     * instance.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The associated list of EC2 VPC security groups is managed
     * by the DB cluster.
     * </p>
     * <p>
     * Default: The default EC2 VPC security group for the DB subnet group's
     * VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcSecurityGroupIds <p>
     *            A list of Amazon EC2 VPC security groups to associate with
     *            this DB instance.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The associated list of EC2 VPC security groups
     *            is managed by the DB cluster.
     *            </p>
     *            <p>
     *            Default: The default EC2 VPC security group for the DB subnet
     *            group's VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withVpcSecurityGroupIds(
            java.util.Collection<String> vpcSecurityGroupIds) {
        setVpcSecurityGroupIds(vpcSecurityGroupIds);
        return this;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
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
     * <note>
     * <p>
     * If you're creating a DB instance in an RDS on VMware environment, specify
     * the identifier of the custom Availability Zone to create the DB instance
     * in.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * </note>
     *
     * @return <p>
     *         The Availability Zone (AZ) where the database will be created.
     *         For information on AWS Regions and Availability Zones, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>.
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
     *         <note>
     *         <p>
     *         If you're creating a DB instance in an RDS on VMware environment,
     *         specify the identifier of the custom Availability Zone to create
     *         the DB instance in.
     *         </p>
     *         <p>
     *         For more information about RDS on VMware, see the <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     *         > <i>RDS on VMware User Guide.</i> </a>
     *         </p>
     *         </note>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
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
     * <note>
     * <p>
     * If you're creating a DB instance in an RDS on VMware environment, specify
     * the identifier of the custom Availability Zone to create the DB instance
     * in.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * </note>
     *
     * @param availabilityZone <p>
     *            The Availability Zone (AZ) where the database will be created.
     *            For information on AWS Regions and Availability Zones, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Regions and Availability Zones</a>.
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
     *            <note>
     *            <p>
     *            If you're creating a DB instance in an RDS on VMware
     *            environment, specify the identifier of the custom Availability
     *            Zone to create the DB instance in.
     *            </p>
     *            <p>
     *            For more information about RDS on VMware, see the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     *            > <i>RDS on VMware User Guide.</i> </a>
     *            </p>
     *            </note>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone (AZ) where the database will be created. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
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
     * <note>
     * <p>
     * If you're creating a DB instance in an RDS on VMware environment, specify
     * the identifier of the custom Availability Zone to create the DB instance
     * in.
     * </p>
     * <p>
     * For more information about RDS on VMware, see the <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     * > <i>RDS on VMware User Guide.</i> </a>
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone (AZ) where the database will be created.
     *            For information on AWS Regions and Availability Zones, see <a
     *            href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Regions and Availability Zones</a>.
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
     *            <note>
     *            <p>
     *            If you're creating a DB instance in an RDS on VMware
     *            environment, specify the identifier of the custom Availability
     *            Zone to create the DB instance in.
     *            </p>
     *            <p>
     *            For more information about RDS on VMware, see the <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/RDSonVMwareUserGuide/rds-on-vmware.html"
     *            > <i>RDS on VMware User Guide.</i> </a>
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     *
     * @return <p>
     *         A DB subnet group to associate with this DB instance.
     *         </p>
     *         <p>
     *         If there is no DB subnet group, then it is a non-VPC DB instance.
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * A DB subnet group to associate with this DB instance.
     * </p>
     * <p>
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            A DB subnet group to associate with this DB instance.
     *            </p>
     *            <p>
     *            If there is no DB subnet group, then it is a non-VPC DB
     *            instance.
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
     * If there is no DB subnet group, then it is a non-VPC DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            A DB subnet group to associate with this DB instance.
     *            </p>
     *            <p>
     *            If there is no DB subnet group, then it is a non-VPC DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @return <p>
     *         The time range each week during which system maintenance can
     *         occur, in Universal Coordinated Time (UTC). For more information,
     *         see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *         >Amazon RDS Maintenance Window</a>.
     *         </p>
     *         <p>
     *         Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region, occurring on a random
     *         day of the week.
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
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
     * </p>
     * <p>
     * Valid Days: Mon, Tue, Wed, Thu, Fri, Sat, Sun.
     * </p>
     * <p>
     * Constraints: Minimum 30-minute window.
     * </p>
     *
     * @param preferredMaintenanceWindow <p>
     *            The time range each week during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *            >Amazon RDS Maintenance Window</a>.
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region, occurring on a
     *            random day of the week.
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
     * The time range each week during which system maintenance can occur, in
     * Universal Coordinated Time (UTC). For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     * >Amazon RDS Maintenance Window</a>.
     * </p>
     * <p>
     * Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region, occurring on a random day of the week.
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
     *            The time range each week during which system maintenance can
     *            occur, in Universal Coordinated Time (UTC). For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#Concepts.DBMaintenance"
     *            >Amazon RDS Maintenance Window</a>.
     *            </p>
     *            <p>
     *            Format: <code>ddd:hh24:mi-ddd:hh24:mi</code>
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region, occurring on a
     *            random day of the week.
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
    public CreateDBInstanceRequest withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If
     * you do not specify a value, then the default DB parameter group for the
     * specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     *         The name of the DB parameter group to associate with this DB
     *         instance. If you do not specify a value, then the default DB
     *         parameter group for the specified DB engine and version is used.
     *         </p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Must be 1 to 255 letters, numbers, or hyphens.
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
    public String getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If
     * you do not specify a value, then the default DB parameter group for the
     * specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group to associate with this DB
     *            instance. If you do not specify a value, then the default DB
     *            parameter group for the specified DB engine and version is
     *            used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
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
    public void setDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    /**
     * <p>
     * The name of the DB parameter group to associate with this DB instance. If
     * you do not specify a value, then the default DB parameter group for the
     * specified DB engine and version is used.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Must be 1 to 255 letters, numbers, or hyphens.
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
     * @param dBParameterGroupName <p>
     *            The name of the DB parameter group to associate with this DB
     *            instance. If you do not specify a value, then the default DB
     *            parameter group for the specified DB engine and version is
     *            used.
     *            </p>
     *            <p>
     *            Constraints:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Must be 1 to 255 letters, numbers, or hyphens.
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
    public CreateDBInstanceRequest withDBParameterGroupName(String dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by
     * the DB cluster.
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
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         The number of days for which automated backups are retained.
     *         Setting this parameter to a positive number enables backups.
     *         Setting this parameter to 0 disables automated backups.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The retention period for automated backups is
     *         managed by the DB cluster.
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
     *         Must be a value from 0 to 35
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Can't be set to 0 if the DB instance is a source to read replicas
     *         </p>
     *         </li>
     *         </ul>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by
     * the DB cluster.
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
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            Setting this parameter to a positive number enables backups.
     *            Setting this parameter to 0 disables automated backups.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The retention period for automated backups is
     *            managed by the DB cluster.
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
     *            Must be a value from 0 to 35
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be set to 0 if the DB instance is a source to read
     *            replicas
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * The number of days for which automated backups are retained. Setting this
     * parameter to a positive number enables backups. Setting this parameter to
     * 0 disables automated backups.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The retention period for automated backups is managed by
     * the DB cluster.
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
     * Must be a value from 0 to 35
     * </p>
     * </li>
     * <li>
     * <p>
     * Can't be set to 0 if the DB instance is a source to read replicas
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionPeriod <p>
     *            The number of days for which automated backups are retained.
     *            Setting this parameter to a positive number enables backups.
     *            Setting this parameter to 0 disables automated backups.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The retention period for automated backups is
     *            managed by the DB cluster.
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
     *            Must be a value from 0 to 35
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Can't be set to 0 if the DB instance is a source to read
     *            replicas
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The daily time range during which automated backups are created if
     * automated backups are enabled, using the
     * <code>BackupRetentionPeriod</code> parameter. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is
     * managed by the DB cluster.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a> in the
     * <i>Amazon RDS User Guide</i>.
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
     *         <code>BackupRetentionPeriod</code> parameter. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *         >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The daily time range for creating automated
     *         backups is managed by the DB cluster.
     *         </p>
     *         <p>
     *         The default is a 30-minute window selected at random from an
     *         8-hour block of time for each AWS Region. To see the time blocks
     *         available, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     *         > Adjusting the Preferred DB Instance Maintenance Window</a> in
     *         the <i>Amazon RDS User Guide</i>.
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
     * <code>BackupRetentionPeriod</code> parameter. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is
     * managed by the DB cluster.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a> in the
     * <i>Amazon RDS User Guide</i>.
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
     *            <code>BackupRetentionPeriod</code> parameter. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *            >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The daily time range for creating automated
     *            backups is managed by the DB cluster.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. To see the time
     *            blocks available, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     *            > Adjusting the Preferred DB Instance Maintenance Window</a>
     *            in the <i>Amazon RDS User Guide</i>.
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
     * <code>BackupRetentionPeriod</code> parameter. For more information, see
     * <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     * >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The daily time range for creating automated backups is
     * managed by the DB cluster.
     * </p>
     * <p>
     * The default is a 30-minute window selected at random from an 8-hour block
     * of time for each AWS Region. To see the time blocks available, see <a
     * href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     * > Adjusting the Preferred DB Instance Maintenance Window</a> in the
     * <i>Amazon RDS User Guide</i>.
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
     *            <code>BackupRetentionPeriod</code> parameter. For more
     *            information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_WorkingWithAutomatedBackups.html#USER_WorkingWithAutomatedBackups.BackupWindow"
     *            >The Backup Window</a> in the <i>Amazon RDS User Guide</i>.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The daily time range for creating automated
     *            backups is managed by the DB cluster.
     *            </p>
     *            <p>
     *            The default is a 30-minute window selected at random from an
     *            8-hour block of time for each AWS Region. To see the time
     *            blocks available, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_UpgradeDBInstance.Maintenance.html#AdjustingTheMaintenanceWindow"
     *            > Adjusting the Preferred DB Instance Maintenance Window</a>
     *            in the <i>Amazon RDS User Guide</i>.
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
    public CreateDBInstanceRequest withPreferredBackupWindow(String preferredBackupWindow) {
        this.preferredBackupWindow = preferredBackupWindow;
        return this;
    }

    /**
     * <p>
     * The port number on which the database accepts connections.
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>,
     * <code>1434</code>, <code>3260</code>, <code>3343</code>,
     * <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     *
     * @return <p>
     *         The port number on which the database accepts connections.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         Default: <code>5432</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         Default: <code>1521</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         <b>SQL Server</b>
     *         </p>
     *         <p>
     *         Default: <code>1433</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code> except <code>1234</code>,
     *         <code>1434</code>, <code>3260</code>, <code>3343</code>,
     *         <code>3389</code>, <code>47001</code>, and
     *         <code>49152-49156</code>.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Default: <code>3306</code>
     *         </p>
     *         <p>
     *         Valid values: <code>1150-65535</code>
     *         </p>
     *         <p>
     *         Type: Integer
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
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>,
     * <code>1434</code>, <code>3260</code>, <code>3343</code>,
     * <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     *
     * @param port <p>
     *            The port number on which the database accepts connections.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Default: <code>5432</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Default: <code>1521</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Default: <code>1433</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>, <code>3343</code>,
     *            <code>3389</code>, <code>47001</code>, and
     *            <code>49152-49156</code>.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
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
     * <b>MySQL</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * Default: <code>5432</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * Default: <code>1521</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * <b>SQL Server</b>
     * </p>
     * <p>
     * Default: <code>1433</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code> except <code>1234</code>,
     * <code>1434</code>, <code>3260</code>, <code>3343</code>,
     * <code>3389</code>, <code>47001</code>, and <code>49152-49156</code>.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Default: <code>3306</code>
     * </p>
     * <p>
     * Valid values: <code>1150-65535</code>
     * </p>
     * <p>
     * Type: Integer
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number on which the database accepts connections.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            Default: <code>5432</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            Default: <code>1521</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            <b>SQL Server</b>
     *            </p>
     *            <p>
     *            Default: <code>1433</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code> except <code>1234</code>, <code>1434</code>, <code>3260</code>, <code>3343</code>,
     *            <code>3389</code>, <code>47001</code>, and
     *            <code>49152-49156</code>.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Default: <code>3306</code>
     *            </p>
     *            <p>
     *            Valid values: <code>1150-65535</code>
     *            </p>
     *            <p>
     *            Type: Integer
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * You can't set the <code>AvailabilityZone</code> parameter if the DB
     * instance is a Multi-AZ deployment.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is a Multi-AZ
     *         deployment. You can't set the <code>AvailabilityZone</code>
     *         parameter if the DB instance is a Multi-AZ deployment.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * You can't set the <code>AvailabilityZone</code> parameter if the DB
     * instance is a Multi-AZ deployment.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is a Multi-AZ
     *         deployment. You can't set the <code>AvailabilityZone</code>
     *         parameter if the DB instance is a Multi-AZ deployment.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * You can't set the <code>AvailabilityZone</code> parameter if the DB
     * instance is a Multi-AZ deployment.
     * </p>
     *
     * @param multiAZ <p>
     *            A value that indicates whether the DB instance is a Multi-AZ
     *            deployment. You can't set the <code>AvailabilityZone</code>
     *            parameter if the DB instance is a Multi-AZ deployment.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is a Multi-AZ deployment.
     * You can't set the <code>AvailabilityZone</code> parameter if the DB
     * instance is a Multi-AZ deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            A value that indicates whether the DB instance is a Multi-AZ
     *            deployment. You can't set the <code>AvailabilityZone</code>
     *            parameter if the DB instance is a Multi-AZ deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * <p>
     * The version number of the database engine to use.
     * </p>
     * <p>
     * For a list of valid engine versions, use the
     * <code>DescribeDBEngineVersions</code> action.
     * </p>
     * <p>
     * The following are the database engines and links to information about the
     * major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by
     * the DB instance is managed by the DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     * >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     * >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     * >Supported PostgreSQL Database Versions</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     *
     * @return <p>
     *         The version number of the database engine to use.
     *         </p>
     *         <p>
     *         For a list of valid engine versions, use the
     *         <code>DescribeDBEngineVersions</code> action.
     *         </p>
     *         <p>
     *         The following are the database engines and links to information
     *         about the major and minor versions that are available with Amazon
     *         RDS. Not every database engine is available for every AWS Region.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The version number of the database engine to be
     *         used by the DB instance is managed by the DB cluster.
     *         </p>
     *         <p>
     *         <b>MariaDB</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     *         >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     *         <p>
     *         <b>Microsoft SQL Server</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     *         >Version and Feature Support on Amazon RDS</a> in the <i>Amazon
     *         RDS User Guide.</i>
     *         </p>
     *         <p>
     *         <b>MySQL</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *         >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User
     *         Guide.</i>
     *         </p>
     *         <p>
     *         <b>Oracle</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     *         >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS
     *         User Guide.</i>
     *         </p>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <p>
     *         See <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     *         >Supported PostgreSQL Database Versions</a> in the <i>Amazon RDS
     *         User Guide.</i>
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
     * For a list of valid engine versions, use the
     * <code>DescribeDBEngineVersions</code> action.
     * </p>
     * <p>
     * The following are the database engines and links to information about the
     * major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by
     * the DB instance is managed by the DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     * >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     * >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     * >Supported PostgreSQL Database Versions</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     *
     * @param engineVersion <p>
     *            The version number of the database engine to use.
     *            </p>
     *            <p>
     *            For a list of valid engine versions, use the
     *            <code>DescribeDBEngineVersions</code> action.
     *            </p>
     *            <p>
     *            The following are the database engines and links to
     *            information about the major and minor versions that are
     *            available with Amazon RDS. Not every database engine is
     *            available for every AWS Region.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The version number of the database engine to
     *            be used by the DB instance is managed by the DB cluster.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     *            >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            <b>Microsoft SQL Server</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     *            >Version and Feature Support on Amazon RDS</a> in the
     *            <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *            >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     *            >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS
     *            User Guide.</i>
     *            </p>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     *            >Supported PostgreSQL Database Versions</a> in the <i>Amazon
     *            RDS User Guide.</i>
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
     * For a list of valid engine versions, use the
     * <code>DescribeDBEngineVersions</code> action.
     * </p>
     * <p>
     * The following are the database engines and links to information about the
     * major and minor versions that are available with Amazon RDS. Not every
     * database engine is available for every AWS Region.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The version number of the database engine to be used by
     * the DB instance is managed by the DB cluster.
     * </p>
     * <p>
     * <b>MariaDB</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     * >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Microsoft SQL Server</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     * >Version and Feature Support on Amazon RDS</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>MySQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     * >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User Guide.</i>
     * </p>
     * <p>
     * <b>Oracle</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     * >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <p>
     * See <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     * >Supported PostgreSQL Database Versions</a> in the <i>Amazon RDS User
     * Guide.</i>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version number of the database engine to use.
     *            </p>
     *            <p>
     *            For a list of valid engine versions, use the
     *            <code>DescribeDBEngineVersions</code> action.
     *            </p>
     *            <p>
     *            The following are the database engines and links to
     *            information about the major and minor versions that are
     *            available with Amazon RDS. Not every database engine is
     *            available for every AWS Region.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The version number of the database engine to
     *            be used by the DB instance is managed by the DB cluster.
     *            </p>
     *            <p>
     *            <b>MariaDB</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MariaDB.html#MariaDB.Concepts.VersionMgmt"
     *            >MariaDB on Amazon RDS Versions</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            <b>Microsoft SQL Server</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.FeatureSupport"
     *            >Version and Feature Support on Amazon RDS</a> in the
     *            <i>Amazon RDS User Guide.</i>
     *            </p>
     *            <p>
     *            <b>MySQL</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_MySQL.html#MySQL.Concepts.VersionMgmt"
     *            >MySQL on Amazon RDS Versions</a> in the <i>Amazon RDS User
     *            Guide.</i>
     *            </p>
     *            <p>
     *            <b>Oracle</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Appendix.Oracle.PatchComposition.html"
     *            >Oracle Database Engine Release Notes</a> in the <i>Amazon RDS
     *            User Guide.</i>
     *            </p>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <p>
     *            See <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_PostgreSQL.html#PostgreSQL.Concepts.General.DBVersions"
     *            >Supported PostgreSQL Database Versions</a> in the <i>Amazon
     *            RDS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are applied automatically.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor engine upgrades are applied
     *         automatically to the DB instance during the maintenance window.
     *         By default, minor engine upgrades are applied automatically.
     *         </p>
     */
    public Boolean isAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are applied automatically.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether minor engine upgrades are applied
     *         automatically to the DB instance during the maintenance window.
     *         By default, minor engine upgrades are applied automatically.
     *         </p>
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * <p>
     * A value that indicates whether minor engine upgrades are applied
     * automatically to the DB instance during the maintenance window. By
     * default, minor engine upgrades are applied automatically.
     * </p>
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor engine upgrades are
     *            applied automatically to the DB instance during the
     *            maintenance window. By default, minor engine upgrades are
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
     * default, minor engine upgrades are applied automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param autoMinorVersionUpgrade <p>
     *            A value that indicates whether minor engine upgrades are
     *            applied automatically to the DB instance during the
     *            maintenance window. By default, minor engine upgrades are
     *            applied automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     *
     * @return <p>
     *         License model information for this DB instance.
     *         </p>
     *         <p>
     *         Valid values: <code>license-included</code> |
     *         <code>bring-your-own-license</code> |
     *         <code>general-public-license</code>
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * License model information for this DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     *
     * @param licenseModel <p>
     *            License model information for this DB instance.
     *            </p>
     *            <p>
     *            Valid values: <code>license-included</code> |
     *            <code>bring-your-own-license</code> |
     *            <code>general-public-license</code>
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
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            License model information for this DB instance.
     *            </p>
     *            <p>
     *            Valid values: <code>license-included</code> |
     *            <code>bring-your-own-license</code> |
     *            <code>general-public-license</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances,
     * must be a multiple between .5 and 50 of the storage amount for the DB
     * instance. For SQL Server DB instances, must be a multiple between 1 and
     * 50 of the storage amount for the DB instance.
     * </p>
     *
     * @return <p>
     *         The amount of Provisioned IOPS (input/output operations per
     *         second) to be initially allocated for the DB instance. For
     *         information about valid Iops values, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     *         >Amazon RDS Provisioned IOPS Storage to Improve Performance</a>
     *         in the <i>Amazon RDS User Guide</i>.
     *         </p>
     *         <p>
     *         Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB
     *         instances, must be a multiple between .5 and 50 of the storage
     *         amount for the DB instance. For SQL Server DB instances, must be
     *         a multiple between 1 and 50 of the storage amount for the DB
     *         instance.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances,
     * must be a multiple between .5 and 50 of the storage amount for the DB
     * instance. For SQL Server DB instances, must be a multiple between 1 and
     * 50 of the storage amount for the DB instance.
     * </p>
     *
     * @param iops <p>
     *            The amount of Provisioned IOPS (input/output operations per
     *            second) to be initially allocated for the DB instance. For
     *            information about valid Iops values, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     *            >Amazon RDS Provisioned IOPS Storage to Improve
     *            Performance</a> in the <i>Amazon RDS User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB
     *            instances, must be a multiple between .5 and 50 of the storage
     *            amount for the DB instance. For SQL Server DB instances, must
     *            be a multiple between 1 and 50 of the storage amount for the
     *            DB instance.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The amount of Provisioned IOPS (input/output operations per second) to be
     * initially allocated for the DB instance. For information about valid Iops
     * values, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     * >Amazon RDS Provisioned IOPS Storage to Improve Performance</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB instances,
     * must be a multiple between .5 and 50 of the storage amount for the DB
     * instance. For SQL Server DB instances, must be a multiple between 1 and
     * 50 of the storage amount for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The amount of Provisioned IOPS (input/output operations per
     *            second) to be initially allocated for the DB instance. For
     *            information about valid Iops values, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_Storage.html#USER_PIOPS"
     *            >Amazon RDS Provisioned IOPS Storage to Improve
     *            Performance</a> in the <i>Amazon RDS User Guide</i>.
     *            </p>
     *            <p>
     *            Constraints: For MariaDB, MySQL, Oracle, and PostgreSQL DB
     *            instances, must be a multiple between .5 and 50 of the storage
     *            amount for the DB instance. For SQL Server DB instances, must
     *            be a multiple between 1 and 50 of the storage amount for the
     *            DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified
     * option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group. Also, that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     *
     * @return <p>
     *         Indicates that the DB instance should be associated with the
     *         specified option group.
     *         </p>
     *         <p>
     *         Permanent options, such as the TDE option for Oracle Advanced
     *         Security TDE, can't be removed from an option group. Also, that
     *         option group can't be removed from a DB instance once it is
     *         associated with a DB instance
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified
     * option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group. Also, that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     *
     * @param optionGroupName <p>
     *            Indicates that the DB instance should be associated with the
     *            specified option group.
     *            </p>
     *            <p>
     *            Permanent options, such as the TDE option for Oracle Advanced
     *            Security TDE, can't be removed from an option group. Also,
     *            that option group can't be removed from a DB instance once it
     *            is associated with a DB instance
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Indicates that the DB instance should be associated with the specified
     * option group.
     * </p>
     * <p>
     * Permanent options, such as the TDE option for Oracle Advanced Security
     * TDE, can't be removed from an option group. Also, that option group can't
     * be removed from a DB instance once it is associated with a DB instance
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            Indicates that the DB instance should be associated with the
     *            specified option group.
     *            </p>
     *            <p>
     *            Permanent options, such as the TDE option for Oracle Advanced
     *            Security TDE, can't be removed from an option group. Also,
     *            that option group can't be removed from a DB instance once it
     *            is associated with a DB instance
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more
     * information, see <code>CreateDBCluster</code>.
     * </p>
     *
     * @return <p>
     *         For supported engines, indicates that the DB instance should be
     *         associated with the specified CharacterSet.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The character set is managed by the DB cluster.
     *         For more information, see <code>CreateDBCluster</code>.
     *         </p>
     */
    public String getCharacterSetName() {
        return characterSetName;
    }

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more
     * information, see <code>CreateDBCluster</code>.
     * </p>
     *
     * @param characterSetName <p>
     *            For supported engines, indicates that the DB instance should
     *            be associated with the specified CharacterSet.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The character set is managed by the DB
     *            cluster. For more information, see
     *            <code>CreateDBCluster</code>.
     *            </p>
     */
    public void setCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
    }

    /**
     * <p>
     * For supported engines, indicates that the DB instance should be
     * associated with the specified CharacterSet.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The character set is managed by the DB cluster. For more
     * information, see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param characterSetName <p>
     *            For supported engines, indicates that the DB instance should
     *            be associated with the specified CharacterSet.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The character set is managed by the DB
     *            cluster. For more information, see
     *            <code>CreateDBCluster</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withCharacterSetName(String characterSetName) {
        this.characterSetName = characterSetName;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether
     * <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target region doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target region has an Internet gateway attached
     * to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an Internet gateway attached to
     * it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is publicly
     *         accessible.
     *         </p>
     *         <p>
     *         When the DB instance is publicly accessible, its DNS endpoint
     *         resolves to the private IP address from within the DB instance's
     *         VPC, and to the public IP address from outside of the DB
     *         instance's VPC. Access to the DB instance is ultimately
     *         controlled by the security group it uses, and that public access
     *         is not permitted if the security group assigned to the DB
     *         instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal
     *         DB instance with a DNS name that resolves to a private IP
     *         address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether
     *         <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and
     *         <code>PubliclyAccessible</code> isn't specified, the following
     *         applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target region doesn’t have an Internet
     *         gateway attached to it, the DB instance is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target region has an Internet gateway
     *         attached to it, the DB instance is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and
     *         <code>PubliclyAccessible</code> isn't specified, the following
     *         applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an Internet
     *         gateway attached to it, the DB instance is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an Internet gateway
     *         attached to it, the DB instance is public.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean isPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether
     * <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target region doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target region has an Internet gateway attached
     * to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an Internet gateway attached to
     * it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is publicly
     *         accessible.
     *         </p>
     *         <p>
     *         When the DB instance is publicly accessible, its DNS endpoint
     *         resolves to the private IP address from within the DB instance's
     *         VPC, and to the public IP address from outside of the DB
     *         instance's VPC. Access to the DB instance is ultimately
     *         controlled by the security group it uses, and that public access
     *         is not permitted if the security group assigned to the DB
     *         instance doesn't permit it.
     *         </p>
     *         <p>
     *         When the DB instance isn't publicly accessible, it is an internal
     *         DB instance with a DNS name that resolves to a private IP
     *         address.
     *         </p>
     *         <p>
     *         Default: The default behavior varies depending on whether
     *         <code>DBSubnetGroupName</code> is specified.
     *         </p>
     *         <p>
     *         If <code>DBSubnetGroupName</code> isn't specified, and
     *         <code>PubliclyAccessible</code> isn't specified, the following
     *         applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the default VPC in the target region doesn’t have an Internet
     *         gateway attached to it, the DB instance is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the default VPC in the target region has an Internet gateway
     *         attached to it, the DB instance is public.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If <code>DBSubnetGroupName</code> is specified, and
     *         <code>PubliclyAccessible</code> isn't specified, the following
     *         applies:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that doesn’t have an Internet
     *         gateway attached to it, the DB instance is private.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If the subnets are part of a VPC that has an Internet gateway
     *         attached to it, the DB instance is public.
     *         </p>
     *         </li>
     *         </ul>
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether
     * <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target region doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target region has an Internet gateway attached
     * to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an Internet gateway attached to
     * it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     *
     * @param publiclyAccessible <p>
     *            A value that indicates whether the DB instance is publicly
     *            accessible.
     *            </p>
     *            <p>
     *            When the DB instance is publicly accessible, its DNS endpoint
     *            resolves to the private IP address from within the DB
     *            instance's VPC, and to the public IP address from outside of
     *            the DB instance's VPC. Access to the DB instance is ultimately
     *            controlled by the security group it uses, and that public
     *            access is not permitted if the security group assigned to the
     *            DB instance doesn't permit it.
     *            </p>
     *            <p>
     *            When the DB instance isn't publicly accessible, it is an
     *            internal DB instance with a DNS name that resolves to a
     *            private IP address.
     *            </p>
     *            <p>
     *            Default: The default behavior varies depending on whether
     *            <code>DBSubnetGroupName</code> is specified.
     *            </p>
     *            <p>
     *            If <code>DBSubnetGroupName</code> isn't specified, and
     *            <code>PubliclyAccessible</code> isn't specified, the following
     *            applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the default VPC in the target region doesn’t have an
     *            Internet gateway attached to it, the DB instance is private.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the default VPC in the target region has an Internet
     *            gateway attached to it, the DB instance is public.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>DBSubnetGroupName</code> is specified, and
     *            <code>PubliclyAccessible</code> isn't specified, the following
     *            applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the subnets are part of a VPC that doesn’t have an Internet
     *            gateway attached to it, the DB instance is private.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the subnets are part of a VPC that has an Internet gateway
     *            attached to it, the DB instance is public.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is publicly accessible.
     * </p>
     * <p>
     * When the DB instance is publicly accessible, its DNS endpoint resolves to
     * the private IP address from within the DB instance's VPC, and to the
     * public IP address from outside of the DB instance's VPC. Access to the DB
     * instance is ultimately controlled by the security group it uses, and that
     * public access is not permitted if the security group assigned to the DB
     * instance doesn't permit it.
     * </p>
     * <p>
     * When the DB instance isn't publicly accessible, it is an internal DB
     * instance with a DNS name that resolves to a private IP address.
     * </p>
     * <p>
     * Default: The default behavior varies depending on whether
     * <code>DBSubnetGroupName</code> is specified.
     * </p>
     * <p>
     * If <code>DBSubnetGroupName</code> isn't specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the default VPC in the target region doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the default VPC in the target region has an Internet gateway attached
     * to it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If <code>DBSubnetGroupName</code> is specified, and
     * <code>PubliclyAccessible</code> isn't specified, the following applies:
     * </p>
     * <ul>
     * <li>
     * <p>
     * If the subnets are part of a VPC that doesn’t have an Internet gateway
     * attached to it, the DB instance is private.
     * </p>
     * </li>
     * <li>
     * <p>
     * If the subnets are part of a VPC that has an Internet gateway attached to
     * it, the DB instance is public.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publiclyAccessible <p>
     *            A value that indicates whether the DB instance is publicly
     *            accessible.
     *            </p>
     *            <p>
     *            When the DB instance is publicly accessible, its DNS endpoint
     *            resolves to the private IP address from within the DB
     *            instance's VPC, and to the public IP address from outside of
     *            the DB instance's VPC. Access to the DB instance is ultimately
     *            controlled by the security group it uses, and that public
     *            access is not permitted if the security group assigned to the
     *            DB instance doesn't permit it.
     *            </p>
     *            <p>
     *            When the DB instance isn't publicly accessible, it is an
     *            internal DB instance with a DNS name that resolves to a
     *            private IP address.
     *            </p>
     *            <p>
     *            Default: The default behavior varies depending on whether
     *            <code>DBSubnetGroupName</code> is specified.
     *            </p>
     *            <p>
     *            If <code>DBSubnetGroupName</code> isn't specified, and
     *            <code>PubliclyAccessible</code> isn't specified, the following
     *            applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the default VPC in the target region doesn’t have an
     *            Internet gateway attached to it, the DB instance is private.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the default VPC in the target region has an Internet
     *            gateway attached to it, the DB instance is public.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            If <code>DBSubnetGroupName</code> is specified, and
     *            <code>PubliclyAccessible</code> isn't specified, the following
     *            applies:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            If the subnets are part of a VPC that doesn’t have an Internet
     *            gateway attached to it, the DB instance is private.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            If the subnets are part of a VPC that has an Internet gateway
     *            attached to it, the DB instance is public.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     *
     * @return <p>
     *         Tags to assign to the DB instance.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags to assign to the DB instance.
     * </p>
     *
     * @param tags <p>
     *            Tags to assign to the DB instance.
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
     * Tags to assign to the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withTags(Tag... tags) {
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
     * Tags to assign to the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            Tags to assign to the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     *
     * @return <p>
     *         The identifier of the DB cluster that the instance will belong
     *         to.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            The identifier of the DB cluster that the instance will belong
     *            to.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster that the instance will belong to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            The identifier of the DB cluster that the instance will belong
     *            to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     * <p>
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     *
     * @return <p>
     *         Specifies the storage type to be associated with the DB instance.
     *         </p>
     *         <p>
     *         Valid values: <code>standard | gp2 | io1</code>
     *         </p>
     *         <p>
     *         If you specify <code>io1</code>, you must also include a value
     *         for the <code>Iops</code> parameter.
     *         </p>
     *         <p>
     *         Default: <code>io1</code> if the <code>Iops</code> parameter is
     *         specified, otherwise <code>gp2</code>
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
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
     *            </p>
     *            <p>
     *            Valid values: <code>standard | gp2 | io1</code>
     *            </p>
     *            <p>
     *            If you specify <code>io1</code>, you must also include a value
     *            for the <code>Iops</code> parameter.
     *            </p>
     *            <p>
     *            Default: <code>io1</code> if the <code>Iops</code> parameter
     *            is specified, otherwise <code>gp2</code>
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
     * Valid values: <code>standard | gp2 | io1</code>
     * </p>
     * <p>
     * If you specify <code>io1</code>, you must also include a value for the
     * <code>Iops</code> parameter.
     * </p>
     * <p>
     * Default: <code>io1</code> if the <code>Iops</code> parameter is
     * specified, otherwise <code>gp2</code>
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
     *            Valid values: <code>standard | gp2 | io1</code>
     *            </p>
     *            <p>
     *            If you specify <code>io1</code>, you must also include a value
     *            for the <code>Iops</code> parameter.
     *            </p>
     *            <p>
     *            Default: <code>io1</code> if the <code>Iops</code> parameter
     *            is specified, otherwise <code>gp2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     *
     * @return <p>
     *         The ARN from the key store with which to associate the instance
     *         for TDE encryption.
     *         </p>
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which to associate the
     *            instance for TDE encryption.
     *            </p>
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which to associate the instance for TDE
     * encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which to associate the
     *            instance for TDE encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     *
     * @return <p>
     *         The password for the given ARN from the key store in order to
     *         access the device.
     *         </p>
     */
    public String getTdeCredentialPassword() {
        return tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     *
     * @param tdeCredentialPassword <p>
     *            The password for the given ARN from the key store in order to
     *            access the device.
     *            </p>
     */
    public void setTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
    }

    /**
     * <p>
     * The password for the given ARN from the key store in order to access the
     * device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tdeCredentialPassword <p>
     *            The password for the given ARN from the key store in order to
     *            access the device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withTdeCredentialPassword(String tdeCredentialPassword) {
        this.tdeCredentialPassword = tdeCredentialPassword;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default,
     * it isn't encrypted.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is encrypted. By
     *         default, it isn't encrypted.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The encryption for DB instances is managed by the
     *         DB cluster.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default,
     * it isn't encrypted.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB
     * cluster.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether the DB instance is encrypted. By
     *         default, it isn't encrypted.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The encryption for DB instances is managed by the
     *         DB cluster.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default,
     * it isn't encrypted.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB
     * cluster.
     * </p>
     *
     * @param storageEncrypted <p>
     *            A value that indicates whether the DB instance is encrypted.
     *            By default, it isn't encrypted.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The encryption for DB instances is managed by
     *            the DB cluster.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * A value that indicates whether the DB instance is encrypted. By default,
     * it isn't encrypted.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The encryption for DB instances is managed by the DB
     * cluster.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            A value that indicates whether the DB instance is encrypted.
     *            By default, it isn't encrypted.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The encryption for DB instances is managed by
     *            the DB cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withStorageEncrypted(Boolean storageEncrypted) {
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The KMS key identifier is managed by the DB cluster. For
     * more information, see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a
     * value for the <code>KmsKeyId</code> parameter, then Amazon RDS will use
     * your default encryption key. AWS KMS creates the default encryption key
     * for your AWS account. Your AWS account has a different default encryption
     * key for each AWS Region.
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
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. The KMS key identifier is managed by the DB
     *         cluster. For more information, see <code>CreateDBCluster</code>.
     *         </p>
     *         <p>
     *         If <code>StorageEncrypted</code> is enabled, and you do not
     *         specify a value for the <code>KmsKeyId</code> parameter, then
     *         Amazon RDS will use your default encryption key. AWS KMS creates
     *         the default encryption key for your AWS account. Your AWS account
     *         has a different default encryption key for each AWS Region.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The KMS key identifier is managed by the DB cluster. For
     * more information, see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a
     * value for the <code>KmsKeyId</code> parameter, then Amazon RDS will use
     * your default encryption key. AWS KMS creates the default encryption key
     * for your AWS account. Your AWS account has a different default encryption
     * key for each AWS Region.
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
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The KMS key identifier is managed by the DB
     *            cluster. For more information, see
     *            <code>CreateDBCluster</code>.
     *            </p>
     *            <p>
     *            If <code>StorageEncrypted</code> is enabled, and you do not
     *            specify a value for the <code>KmsKeyId</code> parameter, then
     *            Amazon RDS will use your default encryption key. AWS KMS
     *            creates the default encryption key for your AWS account. Your
     *            AWS account has a different default encryption key for each
     *            AWS Region.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. The KMS key identifier is managed by the DB cluster. For
     * more information, see <code>CreateDBCluster</code>.
     * </p>
     * <p>
     * If <code>StorageEncrypted</code> is enabled, and you do not specify a
     * value for the <code>KmsKeyId</code> parameter, then Amazon RDS will use
     * your default encryption key. AWS KMS creates the default encryption key
     * for your AWS account. Your AWS account has a different default encryption
     * key for each AWS Region.
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
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. The KMS key identifier is managed by the DB
     *            cluster. For more information, see
     *            <code>CreateDBCluster</code>.
     *            </p>
     *            <p>
     *            If <code>StorageEncrypted</code> is enabled, and you do not
     *            specify a value for the <code>KmsKeyId</code> parameter, then
     *            Amazon RDS will use your default encryption key. AWS KMS
     *            creates the default encryption key for your AWS account. Your
     *            AWS account has a different default encryption key for each
     *            AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in.
     * Currently, only Microsoft SQL Server and Oracle DB instances can be
     * created in an Active Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The Active Directory directory ID to create the DB instance in.
     *         Currently, only Microsoft SQL Server and Oracle DB instances can
     *         be created in an Active Directory Domain.
     *         </p>
     *         <p>
     *         For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     *         Authentication to authenticate users that connect to the DB
     *         instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     *         > Using Windows Authentication with an Amazon RDS DB Instance
     *         Running Microsoft SQL Server</a> in the <i>Amazon RDS User
     *         Guide</i>.
     *         </p>
     *         <p>
     *         For Oracle DB instances, Amazon RDS can use Kerberos
     *         Authentication to authenticate users that connect to the DB
     *         instance. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     *         > Using Kerberos Authentication with Amazon RDS for Oracle</a> in
     *         the <i>Amazon RDS User Guide</i>.
     *         </p>
     */
    public String getDomain() {
        return domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in.
     * Currently, only Microsoft SQL Server and Oracle DB instances can be
     * created in an Active Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     *
     * @param domain <p>
     *            The Active Directory directory ID to create the DB instance
     *            in. Currently, only Microsoft SQL Server and Oracle DB
     *            instances can be created in an Active Directory Domain.
     *            </p>
     *            <p>
     *            For Microsoft SQL Server DB instances, Amazon RDS can use
     *            Windows Authentication to authenticate users that connect to
     *            the DB instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     *            > Using Windows Authentication with an Amazon RDS DB Instance
     *            Running Microsoft SQL Server</a> in the <i>Amazon RDS User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For Oracle DB instances, Amazon RDS can use Kerberos
     *            Authentication to authenticate users that connect to the DB
     *            instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     *            > Using Kerberos Authentication with Amazon RDS for Oracle</a>
     *            in the <i>Amazon RDS User Guide</i>.
     *            </p>
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The Active Directory directory ID to create the DB instance in.
     * Currently, only Microsoft SQL Server and Oracle DB instances can be
     * created in an Active Directory Domain.
     * </p>
     * <p>
     * For Microsoft SQL Server DB instances, Amazon RDS can use Windows
     * Authentication to authenticate users that connect to the DB instance. For
     * more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     * > Using Windows Authentication with an Amazon RDS DB Instance Running
     * Microsoft SQL Server</a> in the <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * For Oracle DB instances, Amazon RDS can use Kerberos Authentication to
     * authenticate users that connect to the DB instance. For more information,
     * see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     * > Using Kerberos Authentication with Amazon RDS for Oracle</a> in the
     * <i>Amazon RDS User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param domain <p>
     *            The Active Directory directory ID to create the DB instance
     *            in. Currently, only Microsoft SQL Server and Oracle DB
     *            instances can be created in an Active Directory Domain.
     *            </p>
     *            <p>
     *            For Microsoft SQL Server DB instances, Amazon RDS can use
     *            Windows Authentication to authenticate users that connect to
     *            the DB instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_SQLServerWinAuth.html"
     *            > Using Windows Authentication with an Amazon RDS DB Instance
     *            Running Microsoft SQL Server</a> in the <i>Amazon RDS User
     *            Guide</i>.
     *            </p>
     *            <p>
     *            For Oracle DB instances, Amazon RDS can use Kerberos
     *            Authentication to authenticate users that connect to the DB
     *            instance. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/oracle-kerberos.html"
     *            > Using Kerberos Authentication with Amazon RDS for Oracle</a>
     *            in the <i>Amazon RDS User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy tags from the DB instance
     *         to snapshots of the DB instance. By default, tags are not copied.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB
     *         cluster. Setting this value for an Aurora DB instance has no
     *         effect on the DB cluster setting.
     *         </p>
     */
    public Boolean isCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to copy tags from the DB instance
     *         to snapshots of the DB instance. By default, tags are not copied.
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Copying tags to snapshots is managed by the DB
     *         cluster. Setting this value for an Aurora DB instance has no
     *         effect on the DB cluster setting.
     *         </p>
     */
    public Boolean getCopyTagsToSnapshot() {
        return copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     * </p>
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy tags from the DB
     *            instance to snapshots of the DB instance. By default, tags are
     *            not copied.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Copying tags to snapshots is managed by the DB
     *            cluster. Setting this value for an Aurora DB instance has no
     *            effect on the DB cluster setting.
     *            </p>
     */
    public void setCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
    }

    /**
     * <p>
     * A value that indicates whether to copy tags from the DB instance to
     * snapshots of the DB instance. By default, tags are not copied.
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Copying tags to snapshots is managed by the DB cluster.
     * Setting this value for an Aurora DB instance has no effect on the DB
     * cluster setting.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param copyTagsToSnapshot <p>
     *            A value that indicates whether to copy tags from the DB
     *            instance to snapshots of the DB instance. By default, tags are
     *            not copied.
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Copying tags to snapshots is managed by the DB
     *            cluster. Setting this value for an Aurora DB instance has no
     *            effect on the DB cluster setting.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withCopyTagsToSnapshot(Boolean copyTagsToSnapshot) {
        this.copyTagsToSnapshot = copyTagsToSnapshot;
        return this;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     *
     * @return <p>
     *         The interval, in seconds, between points when Enhanced Monitoring
     *         metrics are collected for the DB instance. To disable collecting
     *         Enhanced Monitoring metrics, specify 0. The default is 0.
     *         </p>
     *         <p>
     *         If <code>MonitoringRoleArn</code> is specified, then you must
     *         also set <code>MonitoringInterval</code> to a value other than 0.
     *         </p>
     *         <p>
     *         Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *         </p>
     */
    public Integer getMonitoringInterval() {
        return monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     *
     * @param monitoringInterval <p>
     *            The interval, in seconds, between points when Enhanced
     *            Monitoring metrics are collected for the DB instance. To
     *            disable collecting Enhanced Monitoring metrics, specify 0. The
     *            default is 0.
     *            </p>
     *            <p>
     *            If <code>MonitoringRoleArn</code> is specified, then you must
     *            also set <code>MonitoringInterval</code> to a value other than
     *            0.
     *            </p>
     *            <p>
     *            Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *            </p>
     */
    public void setMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
    }

    /**
     * <p>
     * The interval, in seconds, between points when Enhanced Monitoring metrics
     * are collected for the DB instance. To disable collecting Enhanced
     * Monitoring metrics, specify 0. The default is 0.
     * </p>
     * <p>
     * If <code>MonitoringRoleArn</code> is specified, then you must also set
     * <code>MonitoringInterval</code> to a value other than 0.
     * </p>
     * <p>
     * Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param monitoringInterval <p>
     *            The interval, in seconds, between points when Enhanced
     *            Monitoring metrics are collected for the DB instance. To
     *            disable collecting Enhanced Monitoring metrics, specify 0. The
     *            default is 0.
     *            </p>
     *            <p>
     *            If <code>MonitoringRoleArn</code> is specified, then you must
     *            also set <code>MonitoringInterval</code> to a value other than
     *            0.
     *            </p>
     *            <p>
     *            Valid Values: <code>0, 1, 5, 10, 15, 30, 60</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withMonitoringInterval(Integer monitoringInterval) {
        this.monitoringInterval = monitoringInterval;
        return this;
    }

    /**
     * <p>
     * The ARN for the IAM role that permits RDS to send enhanced monitoring
     * metrics to Amazon CloudWatch Logs. For example,
     * <code>arn:aws:iam:123456789012:role/emaccess</code>. For information on
     * creating a monitoring role, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide</i>.
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
     *         information on creating a monitoring role, go to <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *         >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon
     *         RDS User Guide</i>.
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
     * creating a monitoring role, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide</i>.
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
     *            information on creating a monitoring role, go to <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *            >Setting Up and Enabling Enhanced Monitoring</a> in the
     *            <i>Amazon RDS User Guide</i>.
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
     * creating a monitoring role, go to <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     * >Setting Up and Enabling Enhanced Monitoring</a> in the <i>Amazon RDS
     * User Guide</i>.
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
     *            information on creating a monitoring role, go to <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_Monitoring.OS.html#USER_Monitoring.OS.Enabling"
     *            >Setting Up and Enabling Enhanced Monitoring</a> in the
     *            <i>Amazon RDS User Guide</i>.
     *            </p>
     *            <p>
     *            If <code>MonitoringInterval</code> is set to a value other
     *            than 0, then you must supply a <code>MonitoringRoleArn</code>
     *            value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withMonitoringRoleArn(String monitoringRoleArn) {
        this.monitoringRoleArn = monitoringRoleArn;
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
    public CreateDBInstanceRequest withDomainIAMRoleName(String domainIAMRoleName) {
        this.domainIAMRoleName = domainIAMRoleName;
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
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
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
     *         <p>
     *         Default: 1
     *         </p>
     *         <p>
     *         Valid Values: 0 - 15
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
     * <p>
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
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
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Valid Values: 0 - 15
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
     * Default: 1
     * </p>
     * <p>
     * Valid Values: 0 - 15
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
     *            <p>
     *            Default: 1
     *            </p>
     *            <p>
     *            Valid Values: 0 - 15
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withPromotionTier(Integer promotionTier) {
        this.promotionTier = promotionTier;
        return this;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently
     * supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     *
     * @return <p>
     *         The time zone of the DB instance. The time zone parameter is
     *         currently supported only by <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *         >Microsoft SQL Server</a>.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently
     * supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     *
     * @param timezone <p>
     *            The time zone of the DB instance. The time zone parameter is
     *            currently supported only by <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *            >Microsoft SQL Server</a>.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB instance. The time zone parameter is currently
     * supported only by <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     * >Microsoft SQL Server</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The time zone of the DB instance. The time zone parameter is
     *            currently supported only by <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/CHAP_SQLServer.html#SQLServer.Concepts.General.TimeZone"
     *            >Microsoft SQL Server</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * A value that indicates whether to enable mapping of AWS Identity and
     * Access Management (IAM) accounts to database accounts. By default,
     * mapping is disabled.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database
     * engines:
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed
     * by the DB cluster.
     * </p>
     * <p>
     * <b>MySQL</b>
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
     * For MySQL 8.0, minor version 8.0.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For PostgreSQL 9.5, minor version 9.5.15 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For PostgreSQL 9.6, minor version 9.6.11 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * PostgreSQL 10.6, 10.7, and 10.9
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled.
     *         </p>
     *         <p>
     *         You can enable IAM database authentication for the following
     *         database engines:
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Mapping AWS IAM accounts to database accounts is
     *         managed by the DB cluster.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
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
     *         For MySQL 8.0, minor version 8.0.16 or higher
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PostgreSQL 9.5, minor version 9.5.15 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PostgreSQL 9.6, minor version 9.6.11 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PostgreSQL 10.6, 10.7, and 10.9
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
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
     * mapping is disabled.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database
     * engines:
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed
     * by the DB cluster.
     * </p>
     * <p>
     * <b>MySQL</b>
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
     * For MySQL 8.0, minor version 8.0.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For PostgreSQL 9.5, minor version 9.5.15 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For PostgreSQL 9.6, minor version 9.6.11 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * PostgreSQL 10.6, 10.7, and 10.9
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @return <p>
     *         A value that indicates whether to enable mapping of AWS Identity
     *         and Access Management (IAM) accounts to database accounts. By
     *         default, mapping is disabled.
     *         </p>
     *         <p>
     *         You can enable IAM database authentication for the following
     *         database engines:
     *         </p>
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. Mapping AWS IAM accounts to database accounts is
     *         managed by the DB cluster.
     *         </p>
     *         <p>
     *         <b>MySQL</b>
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
     *         For MySQL 8.0, minor version 8.0.16 or higher
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         <b>PostgreSQL</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For PostgreSQL 9.5, minor version 9.5.15 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For PostgreSQL 9.6, minor version 9.6.11 or higher
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         PostgreSQL 10.6, 10.7, and 10.9
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a href=
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
     * mapping is disabled.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database
     * engines:
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed
     * by the DB cluster.
     * </p>
     * <p>
     * <b>MySQL</b>
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
     * For MySQL 8.0, minor version 8.0.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For PostgreSQL 9.5, minor version 9.5.15 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For PostgreSQL 9.6, minor version 9.6.11 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * PostgreSQL 10.6, 10.7, and 10.9
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     * > IAM Database Authentication for MySQL and PostgreSQL</a> in the
     * <i>Amazon RDS User Guide.</i>
     * </p>
     *
     * @param enableIAMDatabaseAuthentication <p>
     *            A value that indicates whether to enable mapping of AWS
     *            Identity and Access Management (IAM) accounts to database
     *            accounts. By default, mapping is disabled.
     *            </p>
     *            <p>
     *            You can enable IAM database authentication for the following
     *            database engines:
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Mapping AWS IAM accounts to database accounts
     *            is managed by the DB cluster.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
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
     *            For MySQL 8.0, minor version 8.0.16 or higher
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For PostgreSQL 9.5, minor version 9.5.15 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For PostgreSQL 9.6, minor version 9.6.11 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PostgreSQL 10.6, 10.7, and 10.9
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
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
     * mapping is disabled.
     * </p>
     * <p>
     * You can enable IAM database authentication for the following database
     * engines:
     * </p>
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. Mapping AWS IAM accounts to database accounts is managed
     * by the DB cluster.
     * </p>
     * <p>
     * <b>MySQL</b>
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
     * For MySQL 8.0, minor version 8.0.16 or higher
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>PostgreSQL</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * For PostgreSQL 9.5, minor version 9.5.15 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * For PostgreSQL 9.6, minor version 9.6.11 or higher
     * </p>
     * </li>
     * <li>
     * <p>
     * PostgreSQL 10.6, 10.7, and 10.9
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a href=
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
     *            accounts. By default, mapping is disabled.
     *            </p>
     *            <p>
     *            You can enable IAM database authentication for the following
     *            database engines:
     *            </p>
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. Mapping AWS IAM accounts to database accounts
     *            is managed by the DB cluster.
     *            </p>
     *            <p>
     *            <b>MySQL</b>
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
     *            For MySQL 8.0, minor version 8.0.16 or higher
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            <b>PostgreSQL</b>
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            For PostgreSQL 9.5, minor version 9.5.15 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            For PostgreSQL 9.6, minor version 9.6.11 or higher
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            PostgreSQL 10.6, 10.7, and 10.9
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/UsingWithRDS.IAMDBAuth.html"
     *            > IAM Database Authentication for MySQL and PostgreSQL</a> in
     *            the <i>Amazon RDS User Guide.</i>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withEnableIAMDatabaseAuthentication(
            Boolean enableIAMDatabaseAuthentication) {
        this.enableIAMDatabaseAuthentication = enableIAMDatabaseAuthentication;
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
    public CreateDBInstanceRequest withEnablePerformanceInsights(Boolean enablePerformanceInsights) {
        this.enablePerformanceInsights = enablePerformanceInsights;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key identifier for encryption of Performance Insights data.
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
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
     *         data. The KMS key ID is the Amazon Resource Name (ARN), KMS key
     *         identifier, or the KMS key alias for the KMS encryption key.
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
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
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
     *            (ARN), KMS key identifier, or the KMS key alias for the KMS
     *            encryption key.
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
     * The KMS key ID is the Amazon Resource Name (ARN), KMS key identifier, or
     * the KMS key alias for the KMS encryption key.
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
     *            (ARN), KMS key identifier, or the KMS key alias for the KMS
     *            encryption key.
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
    public CreateDBInstanceRequest withPerformanceInsightsKMSKeyId(
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
    public CreateDBInstanceRequest withPerformanceInsightsRetentionPeriod(
            Integer performanceInsightsRetentionPeriod) {
        this.performanceInsightsRetentionPeriod = performanceInsightsRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * The list of log types that need to be enabled for exporting to CloudWatch
     * Logs. The values in the list depend on the DB engine being used. For more
     * information, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Relational Database Service User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The list of log types that need to be enabled for exporting to
     *         CloudWatch Logs. The values in the list depend on the DB engine
     *         being used. For more information, see <a href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *         >Publishing Database Logs to Amazon CloudWatch Logs </a> in the
     *         <i>Amazon Relational Database Service User Guide</i>.
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
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Relational Database Service User Guide</i>.
     * </p>
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of log types that need to be enabled for exporting to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs </a> in
     *            the <i>Amazon Relational Database Service User Guide</i>.
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
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Relational Database Service User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of log types that need to be enabled for exporting to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs </a> in
     *            the <i>Amazon Relational Database Service User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withEnableCloudwatchLogsExports(
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
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     * >Publishing Database Logs to Amazon CloudWatch Logs </a> in the <i>Amazon
     * Relational Database Service User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enableCloudwatchLogsExports <p>
     *            The list of log types that need to be enabled for exporting to
     *            CloudWatch Logs. The values in the list depend on the DB
     *            engine being used. For more information, see <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_LogAccess.html#USER_LogAccess.Procedural.UploadtoCloudWatch"
     *            >Publishing Database Logs to Amazon CloudWatch Logs </a> in
     *            the <i>Amazon Relational Database Service User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withEnableCloudwatchLogsExports(
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
    public CreateDBInstanceRequest withProcessorFeatures(ProcessorFeature... processorFeatures) {
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
    public CreateDBInstanceRequest withProcessorFeatures(
            java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
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
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB
     * cluster. For more information, see <code>CreateDBCluster</code>. DB
     * instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
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
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. You can enable or disable deletion protection for
     *         the DB cluster. For more information, see
     *         <code>CreateDBCluster</code>. DB instances in a DB cluster can be
     *         deleted even when deletion protection is enabled for the DB
     *         cluster.
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
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB
     * cluster. For more information, see <code>CreateDBCluster</code>. DB
     * instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
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
     *         <p>
     *         <b>Amazon Aurora</b>
     *         </p>
     *         <p>
     *         Not applicable. You can enable or disable deletion protection for
     *         the DB cluster. For more information, see
     *         <code>CreateDBCluster</code>. DB instances in a DB cluster can be
     *         deleted even when deletion protection is enabled for the DB
     *         cluster.
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
     * <p>
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB
     * cluster. For more information, see <code>CreateDBCluster</code>. DB
     * instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
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
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. You can enable or disable deletion protection
     *            for the DB cluster. For more information, see
     *            <code>CreateDBCluster</code>. DB instances in a DB cluster can
     *            be deleted even when deletion protection is enabled for the DB
     *            cluster.
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
     * <b>Amazon Aurora</b>
     * </p>
     * <p>
     * Not applicable. You can enable or disable deletion protection for the DB
     * cluster. For more information, see <code>CreateDBCluster</code>. DB
     * instances in a DB cluster can be deleted even when deletion protection is
     * enabled for the DB cluster.
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
     *            <p>
     *            <b>Amazon Aurora</b>
     *            </p>
     *            <p>
     *            Not applicable. You can enable or disable deletion protection
     *            for the DB cluster. For more information, see
     *            <code>CreateDBCluster</code>. DB instances in a DB cluster can
     *            be deleted even when deletion protection is enabled for the DB
     *            cluster.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateDBInstanceRequest withDeletionProtection(Boolean deletionProtection) {
        this.deletionProtection = deletionProtection;
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
    public CreateDBInstanceRequest withMaxAllocatedStorage(Integer maxAllocatedStorage) {
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
        if (getCharacterSetName() != null)
            sb.append("CharacterSetName: " + getCharacterSetName() + ",");
        if (getPubliclyAccessible() != null)
            sb.append("PubliclyAccessible: " + getPubliclyAccessible() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getTdeCredentialPassword() != null)
            sb.append("TdeCredentialPassword: " + getTdeCredentialPassword() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDomain() != null)
            sb.append("Domain: " + getDomain() + ",");
        if (getCopyTagsToSnapshot() != null)
            sb.append("CopyTagsToSnapshot: " + getCopyTagsToSnapshot() + ",");
        if (getMonitoringInterval() != null)
            sb.append("MonitoringInterval: " + getMonitoringInterval() + ",");
        if (getMonitoringRoleArn() != null)
            sb.append("MonitoringRoleArn: " + getMonitoringRoleArn() + ",");
        if (getDomainIAMRoleName() != null)
            sb.append("DomainIAMRoleName: " + getDomainIAMRoleName() + ",");
        if (getPromotionTier() != null)
            sb.append("PromotionTier: " + getPromotionTier() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getEnableIAMDatabaseAuthentication() != null)
            sb.append("EnableIAMDatabaseAuthentication: " + getEnableIAMDatabaseAuthentication()
                    + ",");
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
        if (getDeletionProtection() != null)
            sb.append("DeletionProtection: " + getDeletionProtection() + ",");
        if (getMaxAllocatedStorage() != null)
            sb.append("MaxAllocatedStorage: " + getMaxAllocatedStorage());
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
                + ((getCharacterSetName() == null) ? 0 : getCharacterSetName().hashCode());
        hashCode = prime * hashCode
                + ((getPubliclyAccessible() == null) ? 0 : getPubliclyAccessible().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getTdeCredentialPassword() == null) ? 0 : getTdeCredentialPassword().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode
                + ((getCopyTagsToSnapshot() == null) ? 0 : getCopyTagsToSnapshot().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringInterval() == null) ? 0 : getMonitoringInterval().hashCode());
        hashCode = prime * hashCode
                + ((getMonitoringRoleArn() == null) ? 0 : getMonitoringRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getDomainIAMRoleName() == null) ? 0 : getDomainIAMRoleName().hashCode());
        hashCode = prime * hashCode
                + ((getPromotionTier() == null) ? 0 : getPromotionTier().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime
                * hashCode
                + ((getEnableIAMDatabaseAuthentication() == null) ? 0
                        : getEnableIAMDatabaseAuthentication().hashCode());
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
        hashCode = prime * hashCode
                + ((getDeletionProtection() == null) ? 0 : getDeletionProtection().hashCode());
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

        if (obj instanceof CreateDBInstanceRequest == false)
            return false;
        CreateDBInstanceRequest other = (CreateDBInstanceRequest) obj;

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
        if (other.getCharacterSetName() == null ^ this.getCharacterSetName() == null)
            return false;
        if (other.getCharacterSetName() != null
                && other.getCharacterSetName().equals(this.getCharacterSetName()) == false)
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
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
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
        if (other.getTdeCredentialPassword() == null ^ this.getTdeCredentialPassword() == null)
            return false;
        if (other.getTdeCredentialPassword() != null
                && other.getTdeCredentialPassword().equals(this.getTdeCredentialPassword()) == false)
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
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
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
        if (other.getDomainIAMRoleName() == null ^ this.getDomainIAMRoleName() == null)
            return false;
        if (other.getDomainIAMRoleName() != null
                && other.getDomainIAMRoleName().equals(this.getDomainIAMRoleName()) == false)
            return false;
        if (other.getPromotionTier() == null ^ this.getPromotionTier() == null)
            return false;
        if (other.getPromotionTier() != null
                && other.getPromotionTier().equals(this.getPromotionTier()) == false)
            return false;
        if (other.getTimezone() == null ^ this.getTimezone() == null)
            return false;
        if (other.getTimezone() != null && other.getTimezone().equals(this.getTimezone()) == false)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() == null
                ^ this.getEnableIAMDatabaseAuthentication() == null)
            return false;
        if (other.getEnableIAMDatabaseAuthentication() != null
                && other.getEnableIAMDatabaseAuthentication().equals(
                        this.getEnableIAMDatabaseAuthentication()) == false)
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
        if (other.getDeletionProtection() == null ^ this.getDeletionProtection() == null)
            return false;
        if (other.getDeletionProtection() != null
                && other.getDeletionProtection().equals(this.getDeletionProtection()) == false)
            return false;
        if (other.getMaxAllocatedStorage() == null ^ this.getMaxAllocatedStorage() == null)
            return false;
        if (other.getMaxAllocatedStorage() != null
                && other.getMaxAllocatedStorage().equals(this.getMaxAllocatedStorage()) == false)
            return false;
        return true;
    }
}
