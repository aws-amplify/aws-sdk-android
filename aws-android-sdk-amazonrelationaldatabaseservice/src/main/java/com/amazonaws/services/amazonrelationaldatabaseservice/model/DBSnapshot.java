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
 * Contains the details of an Amazon RDS DB snapshot.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBSnapshots</code> action.
 * </p>
 */
public class DBSnapshot implements Serializable {
    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot
     * was created from.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     */
    private java.util.Date snapshotCreateTime;

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * Specifies the allocated storage size in gibibytes (GiB).
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time
     * of the snapshot.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located
     * in at the time of the DB snapshot.
     * </p>
     */
    private String availabilityZone;

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     */
    private java.util.Date instanceCreateTime;

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     */
    private String snapshotType;

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the
     * DB instance at the time of the snapshot.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     */
    private String optionGroupName;

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     */
    private Integer percentProgress;

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     */
    private String sourceRegion;

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was
     * copied from. It only has value in case of cross-customer or cross-region
     * copy.
     * </p>
     */
    private String sourceDBSnapshotIdentifier;

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
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
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     */
    private Boolean encrypted;

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the
     * encrypted DB snapshot.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     */
    private String dBSnapshotArn;

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for snapshots taken from Microsoft SQL Server DB instances
     * that were created with a time zone specified.
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
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance when the DB snapshot was created.
     * </p>
     */
    private java.util.List<ProcessorFeature> processorFeatures;

    /**
     * <p>
     * The identifier for the source DB instance, which can't be changed and
     * which is unique to an AWS Region.
     * </p>
     */
    private String dbiResourceId;

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the identifier for the DB snapshot.
     *         </p>
     */
    public String getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     *
     * @param dBSnapshotIdentifier <p>
     *            Specifies the identifier for the DB snapshot.
     *            </p>
     */
    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotIdentifier <p>
     *            Specifies the identifier for the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot
     * was created from.
     * </p>
     *
     * @return <p>
     *         Specifies the DB instance identifier of the DB instance this DB
     *         snapshot was created from.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot
     * was created from.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            Specifies the DB instance identifier of the DB instance this
     *            DB snapshot was created from.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Specifies the DB instance identifier of the DB instance this DB snapshot
     * was created from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            Specifies the DB instance identifier of the DB instance this
     *            DB snapshot was created from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     *
     * @return <p>
     *         Provides the time when the snapshot was taken, in Universal
     *         Coordinated Time (UTC).
     *         </p>
     */
    public java.util.Date getSnapshotCreateTime() {
        return snapshotCreateTime;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     *
     * @param snapshotCreateTime <p>
     *            Provides the time when the snapshot was taken, in Universal
     *            Coordinated Time (UTC).
     *            </p>
     */
    public void setSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
    }

    /**
     * <p>
     * Provides the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotCreateTime <p>
     *            Provides the time when the snapshot was taken, in Universal
     *            Coordinated Time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
        this.snapshotCreateTime = snapshotCreateTime;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the database engine.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     *
     * @param engine <p>
     *            Specifies the name of the database engine.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * Specifies the name of the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            Specifies the name of the database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withEngine(String engine) {
        this.engine = engine;
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
    public DBSnapshot withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the status of this DB snapshot.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     *
     * @param status <p>
     *            Specifies the status of this DB snapshot.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of this DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the status of this DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time
     * of the snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the port that the database engine was listening on at
     *         the time of the snapshot.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time
     * of the snapshot.
     * </p>
     *
     * @param port <p>
     *            Specifies the port that the database engine was listening on
     *            at the time of the snapshot.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database engine was listening on at the time
     * of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            Specifies the port that the database engine was listening on
     *            at the time of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located
     * in at the time of the DB snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the name of the Availability Zone the DB instance was
     *         located in at the time of the DB snapshot.
     *         </p>
     */
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located
     * in at the time of the DB snapshot.
     * </p>
     *
     * @param availabilityZone <p>
     *            Specifies the name of the Availability Zone the DB instance
     *            was located in at the time of the DB snapshot.
     *            </p>
     */
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * Specifies the name of the Availability Zone the DB instance was located
     * in at the time of the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZone <p>
     *            Specifies the name of the Availability Zone the DB instance
     *            was located in at the time of the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the VPC ID associated with the DB snapshot.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     *
     * @param vpcId <p>
     *            Provides the VPC ID associated with the DB snapshot.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            Provides the VPC ID associated with the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     *
     * @return <p>
     *         Specifies the time when the snapshot was taken, in Universal
     *         Coordinated Time (UTC).
     *         </p>
     */
    public java.util.Date getInstanceCreateTime() {
        return instanceCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     *
     * @param instanceCreateTime <p>
     *            Specifies the time when the snapshot was taken, in Universal
     *            Coordinated Time (UTC).
     *            </p>
     */
    public void setInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
    }

    /**
     * <p>
     * Specifies the time when the snapshot was taken, in Universal Coordinated
     * Time (UTC).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceCreateTime <p>
     *            Specifies the time when the snapshot was taken, in Universal
     *            Coordinated Time (UTC).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withInstanceCreateTime(java.util.Date instanceCreateTime) {
        this.instanceCreateTime = instanceCreateTime;
        return this;
    }

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the master username for the DB snapshot.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     *
     * @param masterUsername <p>
     *            Provides the master username for the DB snapshot.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            Provides the master username for the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     *
     * @return <p>
     *         Specifies the version of the database engine.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     *
     * @param engineVersion <p>
     *            Specifies the version of the database engine.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Specifies the version of the database engine.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            Specifies the version of the database engine.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     *
     * @return <p>
     *         License model information for the restored DB instance.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     *
     * @param licenseModel <p>
     *            License model information for the restored DB instance.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * License model information for the restored DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            License model information for the restored DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the type of the DB snapshot.
     *         </p>
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     *
     * @param snapshotType <p>
     *            Provides the type of the DB snapshot.
     *            </p>
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotType <p>
     *            Provides the type of the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the
     * DB instance at the time of the snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the Provisioned IOPS (I/O operations per second) value
     *         of the DB instance at the time of the snapshot.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the
     * DB instance at the time of the snapshot.
     * </p>
     *
     * @param iops <p>
     *            Specifies the Provisioned IOPS (I/O operations per second)
     *            value of the DB instance at the time of the snapshot.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the Provisioned IOPS (I/O operations per second) value of the
     * DB instance at the time of the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            Specifies the Provisioned IOPS (I/O operations per second)
     *            value of the DB instance at the time of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the option group name for the DB snapshot.
     *         </p>
     */
    public String getOptionGroupName() {
        return optionGroupName;
    }

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     *
     * @param optionGroupName <p>
     *            Provides the option group name for the DB snapshot.
     *            </p>
     */
    public void setOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
    }

    /**
     * <p>
     * Provides the option group name for the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optionGroupName <p>
     *            Provides the option group name for the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withOptionGroupName(String optionGroupName) {
        this.optionGroupName = optionGroupName;
        return this;
    }

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     *
     * @return <p>
     *         The percentage of the estimated data that has been transferred.
     *         </p>
     */
    public Integer getPercentProgress() {
        return percentProgress;
    }

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     *
     * @param percentProgress <p>
     *            The percentage of the estimated data that has been
     *            transferred.
     *            </p>
     */
    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * The percentage of the estimated data that has been transferred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentProgress <p>
     *            The percentage of the estimated data that has been
     *            transferred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     *
     * @return <p>
     *         The AWS Region that the DB snapshot was created in or copied
     *         from.
     *         </p>
     */
    public String getSourceRegion() {
        return sourceRegion;
    }

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     *
     * @param sourceRegion <p>
     *            The AWS Region that the DB snapshot was created in or copied
     *            from.
     *            </p>
     */
    public void setSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
    }

    /**
     * <p>
     * The AWS Region that the DB snapshot was created in or copied from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceRegion <p>
     *            The AWS Region that the DB snapshot was created in or copied
     *            from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withSourceRegion(String sourceRegion) {
        this.sourceRegion = sourceRegion;
        return this;
    }

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was
     * copied from. It only has value in case of cross-customer or cross-region
     * copy.
     * </p>
     *
     * @return <p>
     *         The DB snapshot Amazon Resource Name (ARN) that the DB snapshot
     *         was copied from. It only has value in case of cross-customer or
     *         cross-region copy.
     *         </p>
     */
    public String getSourceDBSnapshotIdentifier() {
        return sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was
     * copied from. It only has value in case of cross-customer or cross-region
     * copy.
     * </p>
     *
     * @param sourceDBSnapshotIdentifier <p>
     *            The DB snapshot Amazon Resource Name (ARN) that the DB
     *            snapshot was copied from. It only has value in case of
     *            cross-customer or cross-region copy.
     *            </p>
     */
    public void setSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot Amazon Resource Name (ARN) that the DB snapshot was
     * copied from. It only has value in case of cross-customer or cross-region
     * copy.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBSnapshotIdentifier <p>
     *            The DB snapshot Amazon Resource Name (ARN) that the DB
     *            snapshot was copied from. It only has value in case of
     *            cross-customer or cross-region copy.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withSourceDBSnapshotIdentifier(String sourceDBSnapshotIdentifier) {
        this.sourceDBSnapshotIdentifier = sourceDBSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the storage type associated with DB snapshot.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type associated with DB snapshot.
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Specifies the storage type associated with DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Specifies the storage type associated with DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withStorageType(String storageType) {
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
    public DBSnapshot withTdeCredentialArn(String tdeCredentialArn) {
        this.tdeCredentialArn = tdeCredentialArn;
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB snapshot is encrypted.
     *         </p>
     */
    public Boolean isEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB snapshot is encrypted.
     *         </p>
     */
    public Boolean getEncrypted() {
        return encrypted;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     *
     * @param encrypted <p>
     *            Specifies whether the DB snapshot is encrypted.
     *            </p>
     */
    public void setEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
    }

    /**
     * <p>
     * Specifies whether the DB snapshot is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param encrypted <p>
     *            Specifies whether the DB snapshot is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withEncrypted(Boolean encrypted) {
        this.encrypted = encrypted;
        return this;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the
     * encrypted DB snapshot.
     * </p>
     *
     * @return <p>
     *         If <code>Encrypted</code> is true, the AWS KMS key identifier for
     *         the encrypted DB snapshot.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the
     * encrypted DB snapshot.
     * </p>
     *
     * @param kmsKeyId <p>
     *            If <code>Encrypted</code> is true, the AWS KMS key identifier
     *            for the encrypted DB snapshot.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>Encrypted</code> is true, the AWS KMS key identifier for the
     * encrypted DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            If <code>Encrypted</code> is true, the AWS KMS key identifier
     *            for the encrypted DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB snapshot.
     *         </p>
     */
    public String getDBSnapshotArn() {
        return dBSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     *
     * @param dBSnapshotArn <p>
     *            The Amazon Resource Name (ARN) for the DB snapshot.
     *            </p>
     */
    public void setDBSnapshotArn(String dBSnapshotArn) {
        this.dBSnapshotArn = dBSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSnapshotArn <p>
     *            The Amazon Resource Name (ARN) for the DB snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withDBSnapshotArn(String dBSnapshotArn) {
        this.dBSnapshotArn = dBSnapshotArn;
        return this;
    }

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for snapshots taken from Microsoft SQL Server DB instances
     * that were created with a time zone specified.
     * </p>
     *
     * @return <p>
     *         The time zone of the DB snapshot. In most cases, the
     *         <code>Timezone</code> element is empty. <code>Timezone</code>
     *         content appears only for snapshots taken from Microsoft SQL
     *         Server DB instances that were created with a time zone specified.
     *         </p>
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for snapshots taken from Microsoft SQL Server DB instances
     * that were created with a time zone specified.
     * </p>
     *
     * @param timezone <p>
     *            The time zone of the DB snapshot. In most cases, the
     *            <code>Timezone</code> element is empty. <code>Timezone</code>
     *            content appears only for snapshots taken from Microsoft SQL
     *            Server DB instances that were created with a time zone
     *            specified.
     *            </p>
     */
    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    /**
     * <p>
     * The time zone of the DB snapshot. In most cases, the
     * <code>Timezone</code> element is empty. <code>Timezone</code> content
     * appears only for snapshots taken from Microsoft SQL Server DB instances
     * that were created with a time zone specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param timezone <p>
     *            The time zone of the DB snapshot. In most cases, the
     *            <code>Timezone</code> element is empty. <code>Timezone</code>
     *            content appears only for snapshots taken from Microsoft SQL
     *            Server DB instances that were created with a time zone
     *            specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withTimezone(String timezone) {
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
    public DBSnapshot withIAMDatabaseAuthenticationEnabled(Boolean iAMDatabaseAuthenticationEnabled) {
        this.iAMDatabaseAuthenticationEnabled = iAMDatabaseAuthenticationEnabled;
        return this;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance when the DB snapshot was created.
     * </p>
     *
     * @return <p>
     *         The number of CPU cores and the number of threads per core for
     *         the DB instance class of the DB instance when the DB snapshot was
     *         created.
     *         </p>
     */
    public java.util.List<ProcessorFeature> getProcessorFeatures() {
        return processorFeatures;
    }

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance when the DB snapshot was created.
     * </p>
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance when the DB snapshot
     *            was created.
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
     * instance class of the DB instance when the DB snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance when the DB snapshot
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withProcessorFeatures(ProcessorFeature... processorFeatures) {
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
     * instance class of the DB instance when the DB snapshot was created.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param processorFeatures <p>
     *            The number of CPU cores and the number of threads per core for
     *            the DB instance class of the DB instance when the DB snapshot
     *            was created.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBSnapshot withProcessorFeatures(java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
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
    public DBSnapshot withDbiResourceId(String dbiResourceId) {
        this.dbiResourceId = dbiResourceId;
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
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: " + getDBSnapshotIdentifier() + ",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getSnapshotCreateTime() != null)
            sb.append("SnapshotCreateTime: " + getSnapshotCreateTime() + ",");
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
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
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getOptionGroupName() != null)
            sb.append("OptionGroupName: " + getOptionGroupName() + ",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getSourceRegion() != null)
            sb.append("SourceRegion: " + getSourceRegion() + ",");
        if (getSourceDBSnapshotIdentifier() != null)
            sb.append("SourceDBSnapshotIdentifier: " + getSourceDBSnapshotIdentifier() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getTdeCredentialArn() != null)
            sb.append("TdeCredentialArn: " + getTdeCredentialArn() + ",");
        if (getEncrypted() != null)
            sb.append("Encrypted: " + getEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDBSnapshotArn() != null)
            sb.append("DBSnapshotArn: " + getDBSnapshotArn() + ",");
        if (getTimezone() != null)
            sb.append("Timezone: " + getTimezone() + ",");
        if (getIAMDatabaseAuthenticationEnabled() != null)
            sb.append("IAMDatabaseAuthenticationEnabled: " + getIAMDatabaseAuthenticationEnabled()
                    + ",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: " + getProcessorFeatures() + ",");
        if (getDbiResourceId() != null)
            sb.append("DbiResourceId: " + getDbiResourceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
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
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode
                + ((getOptionGroupName() == null) ? 0 : getOptionGroupName().hashCode());
        hashCode = prime * hashCode
                + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode
                + ((getSourceRegion() == null) ? 0 : getSourceRegion().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceDBSnapshotIdentifier() == null) ? 0 : getSourceDBSnapshotIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getTdeCredentialArn() == null) ? 0 : getTdeCredentialArn().hashCode());
        hashCode = prime * hashCode + ((getEncrypted() == null) ? 0 : getEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDBSnapshotArn() == null) ? 0 : getDBSnapshotArn().hashCode());
        hashCode = prime * hashCode + ((getTimezone() == null) ? 0 : getTimezone().hashCode());
        hashCode = prime
                * hashCode
                + ((getIAMDatabaseAuthenticationEnabled() == null) ? 0
                        : getIAMDatabaseAuthenticationEnabled().hashCode());
        hashCode = prime * hashCode
                + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        hashCode = prime * hashCode
                + ((getDbiResourceId() == null) ? 0 : getDbiResourceId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DBSnapshot == false)
            return false;
        DBSnapshot other = (DBSnapshot) obj;

        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null
                && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getSnapshotCreateTime() == null ^ this.getSnapshotCreateTime() == null)
            return false;
        if (other.getSnapshotCreateTime() != null
                && other.getSnapshotCreateTime().equals(this.getSnapshotCreateTime()) == false)
            return false;
        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
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
        if (other.getSnapshotType() == null ^ this.getSnapshotType() == null)
            return false;
        if (other.getSnapshotType() != null
                && other.getSnapshotType().equals(this.getSnapshotType()) == false)
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
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null
                && other.getPercentProgress().equals(this.getPercentProgress()) == false)
            return false;
        if (other.getSourceRegion() == null ^ this.getSourceRegion() == null)
            return false;
        if (other.getSourceRegion() != null
                && other.getSourceRegion().equals(this.getSourceRegion()) == false)
            return false;
        if (other.getSourceDBSnapshotIdentifier() == null
                ^ this.getSourceDBSnapshotIdentifier() == null)
            return false;
        if (other.getSourceDBSnapshotIdentifier() != null
                && other.getSourceDBSnapshotIdentifier().equals(
                        this.getSourceDBSnapshotIdentifier()) == false)
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
        if (other.getEncrypted() == null ^ this.getEncrypted() == null)
            return false;
        if (other.getEncrypted() != null
                && other.getEncrypted().equals(this.getEncrypted()) == false)
            return false;
        if (other.getKmsKeyId() == null ^ this.getKmsKeyId() == null)
            return false;
        if (other.getKmsKeyId() != null && other.getKmsKeyId().equals(this.getKmsKeyId()) == false)
            return false;
        if (other.getDBSnapshotArn() == null ^ this.getDBSnapshotArn() == null)
            return false;
        if (other.getDBSnapshotArn() != null
                && other.getDBSnapshotArn().equals(this.getDBSnapshotArn()) == false)
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
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null
                && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        if (other.getDbiResourceId() == null ^ this.getDbiResourceId() == null)
            return false;
        if (other.getDbiResourceId() != null
                && other.getDbiResourceId().equals(this.getDbiResourceId()) == false)
            return false;
        return true;
    }
}
