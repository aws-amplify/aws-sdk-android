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
 * An automated backup of a DB instance. It it consists of system backups,
 * transaction logs, and the database instance properties that existed at the
 * time you deleted the source instance.
 * </p>
 */
public class DBInstanceAutomatedBackup implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     */
    private String dBInstanceArn;

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated
     * backup.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     */
    private RestoreWindow restoreWindow;

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     */
    private String status;

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     */
    private java.util.Date instanceCreateTime;

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the
     * default option group for the engine specified is used.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated
     * for TDE encryption.
     * </p>
     */
    private String tdeCredentialArn;

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon
     * Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS
     * encryption key.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The time zone of the automated backup. In most cases, the
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
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the automated backup.
     *         </p>
     */
    public String getDBInstanceArn() {
        return dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     *
     * @param dBInstanceArn <p>
     *            The Amazon Resource Name (ARN) for the automated backup.
     *            </p>
     */
    public void setDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceArn <p>
     *            The Amazon Resource Name (ARN) for the automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withDBInstanceArn(String dBInstanceArn) {
        this.dBInstanceArn = dBInstanceArn;
        return this;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     *
     * @return <p>
     *         The identifier for the source DB instance, which can't be changed
     *         and which is unique to an AWS Region.
     *         </p>
     */
    public String getDbiResourceId() {
        return dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     *
     * @param dbiResourceId <p>
     *            The identifier for the source DB instance, which can't be
     *            changed and which is unique to an AWS Region.
     *            </p>
     */
    public void setDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
    }

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dbiResourceId <p>
     *            The identifier for the source DB instance, which can't be
     *            changed and which is unique to an AWS Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
        return this;
    }

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     *
     * @return <p>
     *         The AWS Region associated with the automated backup.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     *
     * @param region <p>
     *            The AWS Region associated with the automated backup.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region associated with the automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region associated with the automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated
     * backup.
     * </p>
     *
     * @return <p>
     *         The customer id of the instance that is/was associated with the
     *         automated backup.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated
     * backup.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            The customer id of the instance that is/was associated with
     *            the automated backup.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The customer id of the instance that is/was associated with the automated
     * backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            The customer id of the instance that is/was associated with
     *            the automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     *
     * @return <p>
     *         Earliest and latest time an instance can be restored to.
     *         </p>
     */
    public RestoreWindow getRestoreWindow() {
        return restoreWindow;
    }

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     *
     * @param restoreWindow <p>
     *            Earliest and latest time an instance can be restored to.
     *            </p>
     */
    public void setRestoreWindow(RestoreWindow restoreWindow) {
        this.restoreWindow = restoreWindow;
    }

    /**
     * <p>
     * Earliest and latest time an instance can be restored to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param restoreWindow <p>
     *            Earliest and latest time an instance can be restored to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withRestoreWindow(RestoreWindow restoreWindow) {
        this.restoreWindow = restoreWindow;
        return this;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     *
     * @return <p>
     *         Specifies the allocated storage size in gibibytes (GiB).
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     *
     * @param allocatedStorage <p>
     *            Specifies the allocated storage size in gibibytes (GiB).
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            Specifies the allocated storage size in gibibytes (GiB).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     *
     * @return <p>
     *         Provides a list of status information for an automated backup:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>active</code> - automated backups for current instances
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>retained</code> - automated backups for deleted instances
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>creating</code> - automated backups that are waiting for
     *         the first automated snapshot to be available.
     *         </p>
     *         </li>
     *         </ul>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     *
     * @param status <p>
     *            Provides a list of status information for an automated backup:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - automated backups for current instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>retained</code> - automated backups for deleted
     *            instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code> - automated backups that are waiting for
     *            the first automated snapshot to be available.
     *            </p>
     *            </li>
     *            </ul>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Provides a list of status information for an automated backup:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>active</code> - automated backups for current instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>retained</code> - automated backups for deleted instances
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>creating</code> - automated backups that are waiting for the first
     * automated snapshot to be available.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Provides a list of status information for an automated backup:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>active</code> - automated backups for current instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>retained</code> - automated backups for deleted
     *            instances
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>creating</code> - automated backups that are waiting for
     *            the first automated snapshot to be available.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     *
     * @return <p>
     *         The port number that the automated backup used for connections.
     *         </p>
     *         <p>
     *         Default: Inherits from the source DB instance
     *         </p>
     *         <p>
     *         Valid Values: <code>1150-65535</code>
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     *
     * @param port <p>
     *            The port number that the automated backup used for
     *            connections.
     *            </p>
     *            <p>
     *            Default: Inherits from the source DB instance
     *            </p>
     *            <p>
     *            Valid Values: <code>1150-65535</code>
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * The port number that the automated backup used for connections.
     * </p>
     * <p>
     * Default: Inherits from the source DB instance
     * </p>
     * <p>
     * Valid Values: <code>1150-65535</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            The port number that the automated backup used for
     *            connections.
     *            </p>
     *            <p>
     *            Default: Inherits from the source DB instance
     *            </p>
     *            <p>
     *            Valid Values: <code>1150-65535</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     *
     * @return <p>
     *         The Availability Zone that the automated backup was created in.
     *         For information on AWS Regions and Availability Zones, see <a
     *         href=
     *         "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *         >Regions and Availability Zones</a>.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     *
     * @param availabilityZone <p>
     *            The Availability Zone that the automated backup was created
     *            in. For information on AWS Regions and Availability Zones, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Regions and Availability Zones</a>.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The Availability Zone that the automated backup was created in. For
     * information on AWS Regions and Availability Zones, see <a href=
     * "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     * >Regions and Availability Zones</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            The Availability Zone that the automated backup was created
     *            in. For information on AWS Regions and Availability Zones, see
     *            <a href=
     *            "https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/Concepts.RegionsAndAvailabilityZones.html"
     *            >Regions and Availability Zones</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     *
     * @return <p>
     *         Provides the VPC ID associated with the DB instance
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     *
     * @param vpcId <p>
     *            Provides the VPC ID associated with the DB instance
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB instance
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            Provides the VPC ID associated with the DB instance
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     *
     * @return <p>
     *         Provides the date and time that the DB instance was created.
     *         </p>
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     *
     * @param instanceCreateTime <p>
     *            Provides the date and time that the DB instance was created.
     *            </p>
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Provides the date and time that the DB instance was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCreateTime <p>
     *            Provides the date and time that the DB instance was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     *
     * @return <p>
     *         The license model of an automated backup.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     *
     * @param masterUsername <p>
     *            The license model of an automated backup.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * The license model of an automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            The license model of an automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     *
     * @return <p>
     *         The name of the database engine for this automated backup.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     *
     * @param engine <p>
     *            The name of the database engine for this automated backup.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The name of the database engine for this automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The name of the database engine for this automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     *
     * @return <p>
     *         The version of the database engine for the automated backup.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     *
     * @param engineVersion <p>
     *            The version of the database engine for the automated backup.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The version of the database engine for the automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The version of the database engine for the automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     *
     * @return <p>
     *         License model information for the automated backup.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     *
     * @param licenseModel <p>
     *            License model information for the automated backup.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for the automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            License model information for the automated backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     *
     * @return <p>
     *         The IOPS (I/O operations per second) value for the automated
     *         backup.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     *
     * @param iops <p>
     *            The IOPS (I/O operations per second) value for the automated
     *            backup.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * The IOPS (I/O operations per second) value for the automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            The IOPS (I/O operations per second) value for the automated
     *            backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the
     * default option group for the engine specified is used.
     * </p>
     *
     * @return <p>
     *         The option group the automated backup is associated with. If
     *         omitted, the default option group for the engine specified is
     *         used.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the
     * default option group for the engine specified is used.
     * </p>
     *
     * @param optionGroupName <p>
     *            The option group the automated backup is associated with. If
     *            omitted, the default option group for the engine specified is
     *            used.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * The option group the automated backup is associated with. If omitted, the
     * default option group for the engine specified is used.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            The option group the automated backup is associated with. If
     *            omitted, the default option group for the engine specified is
     *            used.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated
     * for TDE encryption.
     * </p>
     *
     * @return <p>
     *         The ARN from the key store with which the automated backup is
     *         associated for TDE encryption.
     *         </p>
     */
    public String getTdeCredentialArn() {
        return tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated
     * for TDE encryption.
     * </p>
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which the automated backup is
     *            associated for TDE encryption.
     *            </p>
     */
    public void setTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
    }

    /**
     * <p>
     * The ARN from the key store with which the automated backup is associated
     * for TDE encryption.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tdeCredentialArn <p>
     *            The ARN from the key store with which the automated backup is
     *            associated for TDE encryption.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the automated backup is encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the automated backup is encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the automated backup is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the automated backup is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Specifies whether the automated backup is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     *
     * @return <p>
     *         Specifies the storage type associated with the automated backup.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type associated with the automated
     *            backup.
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with the automated backup.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Specifies the storage type associated with the automated
     *            backup.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon
     * Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS
     * encryption key.
     * </p>
     *
     * @return <p>
     *         The AWS KMS key ID for an automated backup. The KMS key ID is the
     *         Amazon Resource Name (ARN), KMS key identifier, or the KMS key
     *         alias for the KMS encryption key.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon
     * Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS
     * encryption key.
     * </p>
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID for an automated backup. The KMS key ID is
     *            the Amazon Resource Name (ARN), KMS key identifier, or the KMS
     *            key alias for the KMS encryption key.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * The AWS KMS key ID for an automated backup. The KMS key ID is the Amazon
     * Resource Name (ARN), KMS key identifier, or the KMS key alias for the KMS
     * encryption key.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            The AWS KMS key ID for an automated backup. The KMS key ID is
     *            the Amazon Resource Name (ARN), KMS key identifier, or the KMS
     *            key alias for the KMS encryption key.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The time zone of the automated backup. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     *
     * @return <p>
     *         The time zone of the automated backup. In most cases, the
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
     * The time zone of the automated backup. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     *
     * @param timezone <p>
     *            The time zone of the automated backup. In most cases, the
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
     * The time zone of the automated backup. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for Microsoft SQL Server DB instances that were created with
     * a time zone specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The time zone of the automated backup. In most cases, the
     *            <code>Timezone</code> element is empty. <code>Timezone</code>
     *            content appears only for Microsoft SQL Server DB instances
     *            that were created with a time zone specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     *
     * @return <p>
     *         True if mapping of AWS Identity and Access Management (IAM)
     *         accounts to database accounts is enabled, and otherwise false.
     *         </p>
     */
    public Boolean isIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     *
     * @return <p>
     *         True if mapping of AWS Identity and Access Management (IAM)
     *         accounts to database accounts is enabled, and otherwise false.
     *         </p>
     */
    public Boolean getIAMDatabaseAuthenticationEnabled() {
        return iAMDatabaseAuthenticationEnabled;
    }

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            True if mapping of AWS Identity and Access Management (IAM)
     *            accounts to database accounts is enabled, and otherwise false.
     *            </p>
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iAMDatabaseAuthenticationEnabled <p>
     *            True if mapping of AWS Identity and Access Management (IAM)
     *            accounts to database accounts is enabled, and otherwise false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBInstanceAutomatedBackup withIAMDatabaseAuthenticationEnabled(
            Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
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
        if (getDBInstanceArn() != null)
            sb.append("DBInstanceArn: " + getDBInstanceArn() + ",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId() + ",");
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getRestoreWindow() != null)
            sb.append("RestoreWindow: " + getRestoreWindow() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: " + getAvailabilityZone() + ",");
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getInstanceCreateTime() != null)
            sb.append("InstanceCreateTime: " + getInstanceCreateTime() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: " + getIAMDatabaseAuthenticationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceArn() == null) ? 0 : getDBInstanceArn().hashCode());
        hashCode = prime * hashCode
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getRestoreWindow() == null) ? 0 : getRestoreWindow().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceCreateTime() == null) ? 0 : getInstanceCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0
                        : getIAMDatabaseAuthenticationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBInstanceAutomatedBackup == false)
            return false;
        DBInstanceAutomatedBackup other = (DBInstanceAutomatedBackup) obj;

        if (other.getDBInstanceArn() == null ^ this.getDBInstanceArn() == null)
            return false;
        if (other.getDBInstanceArn() != null
                && other.getDBInstanceArn().equals(this.getDBInstanceArn()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getRestoreWindow() == null ^ this.getRestoreWindow() == null)
            return false;
        if (other.getRestoreWindow() != null
                && other.getRestoreWindow().equals(this.getRestoreWindow()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null
                && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getInstanceCreateTime() == null ^ this.getInstanceCreateTime() == null)
            return false;
        if (other.getInstanceCreateTime() != null
                && other.getInstanceCreateTime().equals(this.getInstanceCreateTime()) == false)
            return false;
        if (other.getMasterUsername() == null ^ this.getMasterUsername() == null)
            return false;
        if (other.getMasterUsername() != null
                && other.getMasterUsername().equals(this.getMasterUsername()) == false)
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
        if (other.getTdeCredentialArn() == null ^ this.getTdeCredentialArn() == null)
            return false;
        if (other.getTdeCredentialArn() != null
                && other.getTdeCredentialArn().equals(this.getTdeCredentialArn()) == false)
            return false;
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
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
        return true;
    }
}
