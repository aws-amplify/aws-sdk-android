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
 * Contains the details for an Amazon RDS DB cluster snapshot
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeDBClusterSnapshots</code> action.
 * </p>
 */
public class DBClusterSnapshot implements Serializable {
    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster snapshot can be restored.
     * </p>
     */
    private java.util.List<String> availabilityZones;

    /**
     * <p>
     * Specifies the identifier for the DB cluster snapshot.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     * </p>
     */
    private String dBClusterIdentifier;

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
     * Specifies the status of this DB cluster snapshot.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     */
    private String vpcId;

    /**
     * <p>
     * Specifies the time when the DB cluster was created, in Universal
     * Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date clusterCreateTime;

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     */
    private String masterUsername;

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     */
    private String snapshotType;

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     */
    private Integer percentProgress;

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     */
    private Boolean storageEncrypted;

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB cluster snapshot.
     * </p>
     */
    private String kmsKeyId;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     */
    private String dBClusterSnapshotArn;

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot,
     * the Amazon Resource Name (ARN) for the source DB cluster snapshot,
     * otherwise, a null value.
     * </p>
     */
    private String sourceDBClusterSnapshotArn;

    /**
     * <p>
     * True if mapping of AWS Identity and Access Management (IAM) accounts to
     * database accounts is enabled, and otherwise false.
     * </p>
     */
    private Boolean iAMDatabaseAuthenticationEnabled;

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster snapshot can be restored.
     * </p>
     *
     * @return <p>
     *         Provides the list of Availability Zones (AZs) where instances in
     *         the DB cluster snapshot can be restored.
     *         </p>
     */
    public java.util.List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * Provides the list of Availability Zones (AZs) where instances in the DB
     * cluster snapshot can be restored.
     * </p>
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the DB cluster snapshot can be restored.
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
     * cluster snapshot can be restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the DB cluster snapshot can be restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withAvailabilityZones(String... availabilityZones) {
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
     * cluster snapshot can be restored.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            Provides the list of Availability Zones (AZs) where instances
     *            in the DB cluster snapshot can be restored.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withAvailabilityZones(java.util.Collection<String> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Specifies the identifier for the DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the identifier for the DB cluster snapshot.
     *         </p>
     */
    public String getDBClusterSnapshotIdentifier() {
        return dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for the DB cluster snapshot.
     * </p>
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            Specifies the identifier for the DB cluster snapshot.
     *            </p>
     */
    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier for the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotIdentifier <p>
     *            Specifies the identifier for the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     * </p>
     *
     * @return <p>
     *         Specifies the DB cluster identifier of the DB cluster that this
     *         DB cluster snapshot was created from.
     *         </p>
     */
    public String getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     * </p>
     *
     * @param dBClusterIdentifier <p>
     *            Specifies the DB cluster identifier of the DB cluster that
     *            this DB cluster snapshot was created from.
     *            </p>
     */
    public void setDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    /**
     * <p>
     * Specifies the DB cluster identifier of the DB cluster that this DB
     * cluster snapshot was created from.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterIdentifier <p>
     *            Specifies the DB cluster identifier of the DB cluster that
     *            this DB cluster snapshot was created from.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withDBClusterIdentifier(String dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
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
    public DBClusterSnapshot withSnapshotCreateTime(java.util.Date snapshotCreateTime) {
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
    public DBClusterSnapshot withEngine(String engine) {
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
    public DBClusterSnapshot withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the status of this DB cluster snapshot.
     *         </p>
     */
    public String getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     *
     * @param status <p>
     *            Specifies the status of this DB cluster snapshot.
     *            </p>
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of this DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the status of this DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     * </p>
     *
     * @return <p>
     *         Specifies the port that the DB cluster was listening on at the
     *         time of the snapshot.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     * </p>
     *
     * @param port <p>
     *            Specifies the port that the DB cluster was listening on at the
     *            time of the snapshot.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the DB cluster was listening on at the time of
     * the snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            Specifies the port that the DB cluster was listening on at the
     *            time of the snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the VPC ID associated with the DB cluster snapshot.
     *         </p>
     */
    public String getVpcId() {
        return vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     *
     * @param vpcId <p>
     *            Provides the VPC ID associated with the DB cluster snapshot.
     *            </p>
     */
    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * Provides the VPC ID associated with the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpcId <p>
     *            Provides the VPC ID associated with the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withVpcId(String vpcId) {
        this.vpcId = vpcId;
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
    public DBClusterSnapshot withClusterCreateTime(java.util.Date clusterCreateTime) {
        this.clusterCreateTime = clusterCreateTime;
        return this;
    }

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the master username for the DB cluster snapshot.
     *         </p>
     */
    public String getMasterUsername() {
        return masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     *
     * @param masterUsername <p>
     *            Provides the master username for the DB cluster snapshot.
     *            </p>
     */
    public void setMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
    }

    /**
     * <p>
     * Provides the master username for the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUsername <p>
     *            Provides the master username for the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withMasterUsername(String masterUsername) {
        this.masterUsername = masterUsername;
        return this;
    }

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the version of the database engine for this DB cluster
     *         snapshot.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     *
     * @param engineVersion <p>
     *            Provides the version of the database engine for this DB
     *            cluster snapshot.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * Provides the version of the database engine for this DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            Provides the version of the database engine for this DB
     *            cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the license model information for this DB cluster
     *         snapshot.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     *
     * @param licenseModel <p>
     *            Provides the license model information for this DB cluster
     *            snapshot.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * Provides the license model information for this DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            Provides the license model information for this DB cluster
     *            snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         Provides the type of the DB cluster snapshot.
     *         </p>
     */
    public String getSnapshotType() {
        return snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     *
     * @param snapshotType <p>
     *            Provides the type of the DB cluster snapshot.
     *            </p>
     */
    public void setSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
    }

    /**
     * <p>
     * Provides the type of the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snapshotType <p>
     *            Provides the type of the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withSnapshotType(String snapshotType) {
        this.snapshotType = snapshotType;
        return this;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     *
     * @return <p>
     *         Specifies the percentage of the estimated data that has been
     *         transferred.
     *         </p>
     */
    public Integer getPercentProgress() {
        return percentProgress;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     *
     * @param percentProgress <p>
     *            Specifies the percentage of the estimated data that has been
     *            transferred.
     *            </p>
     */
    public void setPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
    }

    /**
     * <p>
     * Specifies the percentage of the estimated data that has been transferred.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param percentProgress <p>
     *            Specifies the percentage of the estimated data that has been
     *            transferred.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withPercentProgress(Integer percentProgress) {
        this.percentProgress = percentProgress;
        return this;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster snapshot is encrypted.
     *         </p>
     */
    public Boolean isStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     *
     * @return <p>
     *         Specifies whether the DB cluster snapshot is encrypted.
     *         </p>
     */
    public Boolean getStorageEncrypted() {
        return storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB cluster snapshot is encrypted.
     *            </p>
     */
    public void setStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
    }

    /**
     * <p>
     * Specifies whether the DB cluster snapshot is encrypted.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageEncrypted <p>
     *            Specifies whether the DB cluster snapshot is encrypted.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withStorageEncrypted(Boolean storageEncrypted) {
        this.storageEncrypted = storageEncrypted;
        return this;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         If <code>StorageEncrypted</code> is true, the AWS KMS key
     *         identifier for the encrypted DB cluster snapshot.
     *         </p>
     */
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB cluster snapshot.
     * </p>
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is true, the AWS KMS key
     *            identifier for the encrypted DB cluster snapshot.
     *            </p>
     */
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    /**
     * <p>
     * If <code>StorageEncrypted</code> is true, the AWS KMS key identifier for
     * the encrypted DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param kmsKeyId <p>
     *            If <code>StorageEncrypted</code> is true, the AWS KMS key
     *            identifier for the encrypted DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) for the DB cluster snapshot.
     *         </p>
     */
    public String getDBClusterSnapshotArn() {
        return dBClusterSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     *
     * @param dBClusterSnapshotArn <p>
     *            The Amazon Resource Name (ARN) for the DB cluster snapshot.
     *            </p>
     */
    public void setDBClusterSnapshotArn(String dBClusterSnapshotArn) {
        this.dBClusterSnapshotArn = dBClusterSnapshotArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the DB cluster snapshot.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBClusterSnapshotArn <p>
     *            The Amazon Resource Name (ARN) for the DB cluster snapshot.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withDBClusterSnapshotArn(String dBClusterSnapshotArn) {
        this.dBClusterSnapshotArn = dBClusterSnapshotArn;
        return this;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot,
     * the Amazon Resource Name (ARN) for the source DB cluster snapshot,
     * otherwise, a null value.
     * </p>
     *
     * @return <p>
     *         If the DB cluster snapshot was copied from a source DB cluster
     *         snapshot, the Amazon Resource Name (ARN) for the source DB
     *         cluster snapshot, otherwise, a null value.
     *         </p>
     */
    public String getSourceDBClusterSnapshotArn() {
        return sourceDBClusterSnapshotArn;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot,
     * the Amazon Resource Name (ARN) for the source DB cluster snapshot,
     * otherwise, a null value.
     * </p>
     *
     * @param sourceDBClusterSnapshotArn <p>
     *            If the DB cluster snapshot was copied from a source DB cluster
     *            snapshot, the Amazon Resource Name (ARN) for the source DB
     *            cluster snapshot, otherwise, a null value.
     *            </p>
     */
    public void setSourceDBClusterSnapshotArn(String sourceDBClusterSnapshotArn) {
        this.sourceDBClusterSnapshotArn = sourceDBClusterSnapshotArn;
    }

    /**
     * <p>
     * If the DB cluster snapshot was copied from a source DB cluster snapshot,
     * the Amazon Resource Name (ARN) for the source DB cluster snapshot,
     * otherwise, a null value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDBClusterSnapshotArn <p>
     *            If the DB cluster snapshot was copied from a source DB cluster
     *            snapshot, the Amazon Resource Name (ARN) for the source DB
     *            cluster snapshot, otherwise, a null value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DBClusterSnapshot withSourceDBClusterSnapshotArn(String sourceDBClusterSnapshotArn) {
        this.sourceDBClusterSnapshotArn = sourceDBClusterSnapshotArn;
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
    public DBClusterSnapshot withIAMDatabaseAuthenticationEnabled(
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
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: " + getDBClusterSnapshotIdentifier() + ",");
        if (getDBClusterIdentifier() != null)
            sb.append("DBClusterIdentifier: " + getDBClusterIdentifier() + ",");
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
        if (getVpcId() != null)
            sb.append("VpcId: " + getVpcId() + ",");
        if (getClusterCreateTime() != null)
            sb.append("ClusterCreateTime: " + getClusterCreateTime() + ",");
        if (getMasterUsername() != null)
            sb.append("MasterUsername: " + getMasterUsername() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getSnapshotType() != null)
            sb.append("SnapshotType: " + getSnapshotType() + ",");
        if (getPercentProgress() != null)
            sb.append("PercentProgress: " + getPercentProgress() + ",");
        if (getStorageEncrypted() != null)
            sb.append("StorageEncrypted: " + getStorageEncrypted() + ",");
        if (getKmsKeyId() != null)
            sb.append("KmsKeyId: " + getKmsKeyId() + ",");
        if (getDBClusterSnapshotArn() != null)
            sb.append("DBClusterSnapshotArn: " + getDBClusterSnapshotArn() + ",");
        if (getSourceDBClusterSnapshotArn() != null)
            sb.append("SourceDBClusterSnapshotArn: " + getSourceDBClusterSnapshotArn() + ",");
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
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime
                * hashCode
                + ((getDBClusterSnapshotIdentifier() == null) ? 0
                        : getDBClusterSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterIdentifier() == null) ? 0 : getDBClusterIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotCreateTime() == null) ? 0 : getSnapshotCreateTime().hashCode());
        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode
                + ((getClusterCreateTime() == null) ? 0 : getClusterCreateTime().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUsername() == null) ? 0 : getMasterUsername().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode
                + ((getSnapshotType() == null) ? 0 : getSnapshotType().hashCode());
        hashCode = prime * hashCode
                + ((getPercentProgress() == null) ? 0 : getPercentProgress().hashCode());
        hashCode = prime * hashCode
                + ((getStorageEncrypted() == null) ? 0 : getStorageEncrypted().hashCode());
        hashCode = prime * hashCode + ((getKmsKeyId() == null) ? 0 : getKmsKeyId().hashCode());
        hashCode = prime * hashCode
                + ((getDBClusterSnapshotArn() == null) ? 0 : getDBClusterSnapshotArn().hashCode());
        hashCode = prime
                * hashCode
                + ((getSourceDBClusterSnapshotArn() == null) ? 0 : getSourceDBClusterSnapshotArn()
                        .hashCode());
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

        if (obj instanceof DBClusterSnapshot == false)
            return false;
        DBClusterSnapshot other = (DBClusterSnapshot) obj;

        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getDBClusterSnapshotIdentifier() == null
                ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null
                && other.getDBClusterSnapshotIdentifier().equals(
                        this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        if (other.getDBClusterIdentifier() == null ^ this.getDBClusterIdentifier() == null)
            return false;
        if (other.getDBClusterIdentifier() != null
                && other.getDBClusterIdentifier().equals(this.getDBClusterIdentifier()) == false)
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
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getClusterCreateTime() == null ^ this.getClusterCreateTime() == null)
            return false;
        if (other.getClusterCreateTime() != null
                && other.getClusterCreateTime().equals(this.getClusterCreateTime()) == false)
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
        if (other.getPercentProgress() == null ^ this.getPercentProgress() == null)
            return false;
        if (other.getPercentProgress() != null
                && other.getPercentProgress().equals(this.getPercentProgress()) == false)
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
        if (other.getDBClusterSnapshotArn() == null ^ this.getDBClusterSnapshotArn() == null)
            return false;
        if (other.getDBClusterSnapshotArn() != null
                && other.getDBClusterSnapshotArn().equals(this.getDBClusterSnapshotArn()) == false)
            return false;
        if (other.getSourceDBClusterSnapshotArn() == null
                ^ this.getSourceDBClusterSnapshotArn() == null)
            return false;
        if (other.getSourceDBClusterSnapshotArn() != null
                && other.getSourceDBClusterSnapshotArn().equals(
                        this.getSourceDBClusterSnapshotArn()) == false)
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
