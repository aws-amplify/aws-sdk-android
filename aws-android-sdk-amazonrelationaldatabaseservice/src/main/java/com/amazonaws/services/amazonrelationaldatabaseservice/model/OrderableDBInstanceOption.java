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
 * Contains a list of available options for a DB instance.
 * </p>
 * <p>
 * This data type is used as a response element in the
 * <code>DescribeOrderableDBInstanceOptions</code> action.
 * </p>
 */
public class OrderableDBInstanceOption implements Serializable {
    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     */
    private String engine;

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     */
    private java.util.List<AvailabilityZone> availabilityZones;

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     */
    private Boolean multiAZCapable;

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     */
    private Boolean readReplicaCapable;

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     */
    private Boolean vpc;

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     */
    private Boolean supportsStorageEncryption;

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     */
    private Boolean supportsIops;

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals
     * from 1 to 60 seconds.
     * </p>
     */
    private Boolean supportsEnhancedMonitoring;

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     */
    private Boolean supportsIAMDatabaseAuthentication;

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     */
    private Boolean supportsPerformanceInsights;

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     */
    private Integer minStorageSize;

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     */
    private Integer maxStorageSize;

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     */
    private Integer minIopsPerDbInstance;

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     */
    private Integer maxIopsPerDbInstance;

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     */
    private Double minIopsPerGib;

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     */
    private Double maxIopsPerGib;

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a
     * DB instance.
     * </p>
     */
    private java.util.List<AvailableProcessorFeature> availableProcessorFeatures;

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     */
    private java.util.List<String> supportedEngineModes;

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the specified instance class.
     * </p>
     */
    private Boolean supportsStorageAutoscaling;

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     */
    private Boolean supportsKerberosAuthentication;

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     *
     * @return <p>
     *         The engine type of a DB instance.
     *         </p>
     */
    public String getEngine() {
        return engine;
    }

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     *
     * @param engine <p>
     *            The engine type of a DB instance.
     *            </p>
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * <p>
     * The engine type of a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engine <p>
     *            The engine type of a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withEngine(String engine) {
        this.engine = engine;
        return this;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     *
     * @return <p>
     *         The engine version of a DB instance.
     *         </p>
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     *
     * @param engineVersion <p>
     *            The engine version of a DB instance.
     *            </p>
     */
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version of a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param engineVersion <p>
     *            The engine version of a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     *
     * @return <p>
     *         The DB instance class for a DB instance.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            The DB instance class for a DB instance.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * The DB instance class for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            The DB instance class for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     *
     * @return <p>
     *         The license model for a DB instance.
     *         </p>
     */
    public String getLicenseModel() {
        return licenseModel;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     *
     * @param licenseModel <p>
     *            The license model for a DB instance.
     *            </p>
     */
    public void setLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
    }

    /**
     * <p>
     * The license model for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param licenseModel <p>
     *            The license model for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     *
     * @return <p>
     *         A list of Availability Zones for a DB instance.
     *         </p>
     */
    public java.util.List<AvailabilityZone> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     *
     * @param availabilityZones <p>
     *            A list of Availability Zones for a DB instance.
     *            </p>
     */
    public void setAvailabilityZones(java.util.Collection<AvailabilityZone> availabilityZones) {
        if (availabilityZones == null) {
            this.availabilityZones = null;
            return;
        }

        this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(availabilityZones);
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of Availability Zones for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withAvailabilityZones(AvailabilityZone... availabilityZones) {
        if (getAvailabilityZones() == null) {
            this.availabilityZones = new java.util.ArrayList<AvailabilityZone>(
                    availabilityZones.length);
        }
        for (AvailabilityZone value : availabilityZones) {
            this.availabilityZones.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Availability Zones for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availabilityZones <p>
     *            A list of Availability Zones for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withAvailabilityZones(
            java.util.Collection<AvailabilityZone> availabilityZones) {
        setAvailabilityZones(availabilityZones);
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance is Multi-AZ capable.
     *         </p>
     */
    public Boolean isMultiAZCapable() {
        return multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance is Multi-AZ capable.
     *         </p>
     */
    public Boolean getMultiAZCapable() {
        return multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     *
     * @param multiAZCapable <p>
     *            Indicates whether a DB instance is Multi-AZ capable.
     *            </p>
     */
    public void setMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance is Multi-AZ capable.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZCapable <p>
     *            Indicates whether a DB instance is Multi-AZ capable.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMultiAZCapable(Boolean multiAZCapable) {
        this.multiAZCapable = multiAZCapable;
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance can have a read replica.
     *         </p>
     */
    public Boolean isReadReplicaCapable() {
        return readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance can have a read replica.
     *         </p>
     */
    public Boolean getReadReplicaCapable() {
        return readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     *
     * @param readReplicaCapable <p>
     *            Indicates whether a DB instance can have a read replica.
     *            </p>
     */
    public void setReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
    }

    /**
     * <p>
     * Indicates whether a DB instance can have a read replica.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param readReplicaCapable <p>
     *            Indicates whether a DB instance can have a read replica.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withReadReplicaCapable(Boolean readReplicaCapable) {
        this.readReplicaCapable = readReplicaCapable;
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance is in a VPC.
     *         </p>
     */
    public Boolean isVpc() {
        return vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance is in a VPC.
     *         </p>
     */
    public Boolean getVpc() {
        return vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     *
     * @param vpc <p>
     *            Indicates whether a DB instance is in a VPC.
     *            </p>
     */
    public void setVpc(Boolean vpc) {
        this.vpc = vpc;
    }

    /**
     * <p>
     * Indicates whether a DB instance is in a VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param vpc <p>
     *            Indicates whether a DB instance is in a VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withVpc(Boolean vpc) {
        this.vpc = vpc;
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports encrypted storage.
     *         </p>
     */
    public Boolean isSupportsStorageEncryption() {
        return supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports encrypted storage.
     *         </p>
     */
    public Boolean getSupportsStorageEncryption() {
        return supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     *
     * @param supportsStorageEncryption <p>
     *            Indicates whether a DB instance supports encrypted storage.
     *            </p>
     */
    public void setSupportsStorageEncryption(Boolean supportsStorageEncryption) {
        this.supportsStorageEncryption = supportsStorageEncryption;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports encrypted storage.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsStorageEncryption <p>
     *            Indicates whether a DB instance supports encrypted storage.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsStorageEncryption(Boolean supportsStorageEncryption) {
        this.supportsStorageEncryption = supportsStorageEncryption;
        return this;
    }

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     *
     * @return <p>
     *         Indicates the storage type for a DB instance.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     *
     * @param storageType <p>
     *            Indicates the storage type for a DB instance.
     *            </p>
     */
    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * Indicates the storage type for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Indicates the storage type for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports provisioned IOPS.
     *         </p>
     */
    public Boolean isSupportsIops() {
        return supportsIops;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports provisioned IOPS.
     *         </p>
     */
    public Boolean getSupportsIops() {
        return supportsIops;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     *
     * @param supportsIops <p>
     *            Indicates whether a DB instance supports provisioned IOPS.
     *            </p>
     */
    public void setSupportsIops(Boolean supportsIops) {
        this.supportsIops = supportsIops;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports provisioned IOPS.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsIops <p>
     *            Indicates whether a DB instance supports provisioned IOPS.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsIops(Boolean supportsIops) {
        this.supportsIops = supportsIops;
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals
     * from 1 to 60 seconds.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports Enhanced Monitoring at
     *         intervals from 1 to 60 seconds.
     *         </p>
     */
    public Boolean isSupportsEnhancedMonitoring() {
        return supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals
     * from 1 to 60 seconds.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports Enhanced Monitoring at
     *         intervals from 1 to 60 seconds.
     *         </p>
     */
    public Boolean getSupportsEnhancedMonitoring() {
        return supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals
     * from 1 to 60 seconds.
     * </p>
     *
     * @param supportsEnhancedMonitoring <p>
     *            Indicates whether a DB instance supports Enhanced Monitoring
     *            at intervals from 1 to 60 seconds.
     *            </p>
     */
    public void setSupportsEnhancedMonitoring(Boolean supportsEnhancedMonitoring) {
        this.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports Enhanced Monitoring at intervals
     * from 1 to 60 seconds.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsEnhancedMonitoring <p>
     *            Indicates whether a DB instance supports Enhanced Monitoring
     *            at intervals from 1 to 60 seconds.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsEnhancedMonitoring(
            Boolean supportsEnhancedMonitoring) {
        this.supportsEnhancedMonitoring = supportsEnhancedMonitoring;
        return this;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports IAM database
     *         authentication.
     *         </p>
     */
    public Boolean isSupportsIAMDatabaseAuthentication() {
        return supportsIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     *
     * @return <p>
     *         Indicates whether a DB instance supports IAM database
     *         authentication.
     *         </p>
     */
    public Boolean getSupportsIAMDatabaseAuthentication() {
        return supportsIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     *
     * @param supportsIAMDatabaseAuthentication <p>
     *            Indicates whether a DB instance supports IAM database
     *            authentication.
     *            </p>
     */
    public void setSupportsIAMDatabaseAuthentication(Boolean supportsIAMDatabaseAuthentication) {
        this.supportsIAMDatabaseAuthentication = supportsIAMDatabaseAuthentication;
    }

    /**
     * <p>
     * Indicates whether a DB instance supports IAM database authentication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsIAMDatabaseAuthentication <p>
     *            Indicates whether a DB instance supports IAM database
     *            authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsIAMDatabaseAuthentication(
            Boolean supportsIAMDatabaseAuthentication) {
        this.supportsIAMDatabaseAuthentication = supportsIAMDatabaseAuthentication;
        return this;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if a DB instance supports Performance Insights, otherwise
     *         false.
     *         </p>
     */
    public Boolean isSupportsPerformanceInsights() {
        return supportsPerformanceInsights;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     *
     * @return <p>
     *         True if a DB instance supports Performance Insights, otherwise
     *         false.
     *         </p>
     */
    public Boolean getSupportsPerformanceInsights() {
        return supportsPerformanceInsights;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     *
     * @param supportsPerformanceInsights <p>
     *            True if a DB instance supports Performance Insights, otherwise
     *            false.
     *            </p>
     */
    public void setSupportsPerformanceInsights(Boolean supportsPerformanceInsights) {
        this.supportsPerformanceInsights = supportsPerformanceInsights;
    }

    /**
     * <p>
     * True if a DB instance supports Performance Insights, otherwise false.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsPerformanceInsights <p>
     *            True if a DB instance supports Performance Insights, otherwise
     *            false.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsPerformanceInsights(
            Boolean supportsPerformanceInsights) {
        this.supportsPerformanceInsights = supportsPerformanceInsights;
        return this;
    }

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     *
     * @return <p>
     *         Minimum storage size for a DB instance.
     *         </p>
     */
    public Integer getMinStorageSize() {
        return minStorageSize;
    }

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     *
     * @param minStorageSize <p>
     *            Minimum storage size for a DB instance.
     *            </p>
     */
    public void setMinStorageSize(Integer minStorageSize) {
        this.minStorageSize = minStorageSize;
    }

    /**
     * <p>
     * Minimum storage size for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minStorageSize <p>
     *            Minimum storage size for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMinStorageSize(Integer minStorageSize) {
        this.minStorageSize = minStorageSize;
        return this;
    }

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     *
     * @return <p>
     *         Maximum storage size for a DB instance.
     *         </p>
     */
    public Integer getMaxStorageSize() {
        return maxStorageSize;
    }

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     *
     * @param maxStorageSize <p>
     *            Maximum storage size for a DB instance.
     *            </p>
     */
    public void setMaxStorageSize(Integer maxStorageSize) {
        this.maxStorageSize = maxStorageSize;
    }

    /**
     * <p>
     * Maximum storage size for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxStorageSize <p>
     *            Maximum storage size for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMaxStorageSize(Integer maxStorageSize) {
        this.maxStorageSize = maxStorageSize;
        return this;
    }

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     *
     * @return <p>
     *         Minimum total provisioned IOPS for a DB instance.
     *         </p>
     */
    public Integer getMinIopsPerDbInstance() {
        return minIopsPerDbInstance;
    }

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     *
     * @param minIopsPerDbInstance <p>
     *            Minimum total provisioned IOPS for a DB instance.
     *            </p>
     */
    public void setMinIopsPerDbInstance(Integer minIopsPerDbInstance) {
        this.minIopsPerDbInstance = minIopsPerDbInstance;
    }

    /**
     * <p>
     * Minimum total provisioned IOPS for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minIopsPerDbInstance <p>
     *            Minimum total provisioned IOPS for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMinIopsPerDbInstance(Integer minIopsPerDbInstance) {
        this.minIopsPerDbInstance = minIopsPerDbInstance;
        return this;
    }

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     *
     * @return <p>
     *         Maximum total provisioned IOPS for a DB instance.
     *         </p>
     */
    public Integer getMaxIopsPerDbInstance() {
        return maxIopsPerDbInstance;
    }

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     *
     * @param maxIopsPerDbInstance <p>
     *            Maximum total provisioned IOPS for a DB instance.
     *            </p>
     */
    public void setMaxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
        this.maxIopsPerDbInstance = maxIopsPerDbInstance;
    }

    /**
     * <p>
     * Maximum total provisioned IOPS for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxIopsPerDbInstance <p>
     *            Maximum total provisioned IOPS for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMaxIopsPerDbInstance(Integer maxIopsPerDbInstance) {
        this.maxIopsPerDbInstance = maxIopsPerDbInstance;
        return this;
    }

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     *
     * @return <p>
     *         Minimum provisioned IOPS per GiB for a DB instance.
     *         </p>
     */
    public Double getMinIopsPerGib() {
        return minIopsPerGib;
    }

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     *
     * @param minIopsPerGib <p>
     *            Minimum provisioned IOPS per GiB for a DB instance.
     *            </p>
     */
    public void setMinIopsPerGib(Double minIopsPerGib) {
        this.minIopsPerGib = minIopsPerGib;
    }

    /**
     * <p>
     * Minimum provisioned IOPS per GiB for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param minIopsPerGib <p>
     *            Minimum provisioned IOPS per GiB for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMinIopsPerGib(Double minIopsPerGib) {
        this.minIopsPerGib = minIopsPerGib;
        return this;
    }

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     *
     * @return <p>
     *         Maximum provisioned IOPS per GiB for a DB instance.
     *         </p>
     */
    public Double getMaxIopsPerGib() {
        return maxIopsPerGib;
    }

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     *
     * @param maxIopsPerGib <p>
     *            Maximum provisioned IOPS per GiB for a DB instance.
     *            </p>
     */
    public void setMaxIopsPerGib(Double maxIopsPerGib) {
        this.maxIopsPerGib = maxIopsPerGib;
    }

    /**
     * <p>
     * Maximum provisioned IOPS per GiB for a DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxIopsPerGib <p>
     *            Maximum provisioned IOPS per GiB for a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withMaxIopsPerGib(Double maxIopsPerGib) {
        this.maxIopsPerGib = maxIopsPerGib;
        return this;
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a
     * DB instance.
     * </p>
     *
     * @return <p>
     *         A list of the available processor features for the DB instance
     *         class of a DB instance.
     *         </p>
     */
    public java.util.List<AvailableProcessorFeature> getAvailableProcessorFeatures() {
        return availableProcessorFeatures;
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a
     * DB instance.
     * </p>
     *
     * @param availableProcessorFeatures <p>
     *            A list of the available processor features for the DB instance
     *            class of a DB instance.
     *            </p>
     */
    public void setAvailableProcessorFeatures(
            java.util.Collection<AvailableProcessorFeature> availableProcessorFeatures) {
        if (availableProcessorFeatures == null) {
            this.availableProcessorFeatures = null;
            return;
        }

        this.availableProcessorFeatures = new java.util.ArrayList<AvailableProcessorFeature>(
                availableProcessorFeatures);
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a
     * DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableProcessorFeatures <p>
     *            A list of the available processor features for the DB instance
     *            class of a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withAvailableProcessorFeatures(
            AvailableProcessorFeature... availableProcessorFeatures) {
        if (getAvailableProcessorFeatures() == null) {
            this.availableProcessorFeatures = new java.util.ArrayList<AvailableProcessorFeature>(
                    availableProcessorFeatures.length);
        }
        for (AvailableProcessorFeature value : availableProcessorFeatures) {
            this.availableProcessorFeatures.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the available processor features for the DB instance class of a
     * DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableProcessorFeatures <p>
     *            A list of the available processor features for the DB instance
     *            class of a DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withAvailableProcessorFeatures(
            java.util.Collection<AvailableProcessorFeature> availableProcessorFeatures) {
        setAvailableProcessorFeatures(availableProcessorFeatures);
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     *
     * @return <p>
     *         A list of the supported DB engine modes.
     *         </p>
     *         <note>
     *         <p>
     *         <code>global</code> engine mode only applies for global database
     *         clusters created with Aurora MySQL version 5.6.10a. For higher
     *         Aurora MySQL versions, the clusters in a global database use
     *         <code>provisioned</code> engine mode.
     *         </p>
     *         </note>
     */
    public java.util.List<String> getSupportedEngineModes() {
        return supportedEngineModes;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
     * </p>
     * <note>
     * <p>
     * <code>global</code> engine mode only applies for global database clusters
     * created with Aurora MySQL version 5.6.10a. For higher Aurora MySQL
     * versions, the clusters in a global database use <code>provisioned</code>
     * engine mode.
     * </p>
     * </note>
     *
     * @param supportedEngineModes <p>
     *            A list of the supported DB engine modes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     */
    public void setSupportedEngineModes(java.util.Collection<String> supportedEngineModes) {
        if (supportedEngineModes == null) {
            this.supportedEngineModes = null;
            return;
        }

        this.supportedEngineModes = new java.util.ArrayList<String>(supportedEngineModes);
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEngineModes <p>
     *            A list of the supported DB engine modes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportedEngineModes(String... supportedEngineModes) {
        if (getSupportedEngineModes() == null) {
            this.supportedEngineModes = new java.util.ArrayList<String>(supportedEngineModes.length);
        }
        for (String value : supportedEngineModes) {
            this.supportedEngineModes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the supported DB engine modes.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportedEngineModes <p>
     *            A list of the supported DB engine modes.
     *            </p>
     *            <note>
     *            <p>
     *            <code>global</code> engine mode only applies for global
     *            database clusters created with Aurora MySQL version 5.6.10a.
     *            For higher Aurora MySQL versions, the clusters in a global
     *            database use <code>provisioned</code> engine mode.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportedEngineModes(
            java.util.Collection<String> supportedEngineModes) {
        setSupportedEngineModes(supportedEngineModes);
        return this;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the specified instance class.
     * </p>
     *
     * @return <p>
     *         Whether or not Amazon RDS can automatically scale storage for DB
     *         instances that use the specified instance class.
     *         </p>
     */
    public Boolean isSupportsStorageAutoscaling() {
        return supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the specified instance class.
     * </p>
     *
     * @return <p>
     *         Whether or not Amazon RDS can automatically scale storage for DB
     *         instances that use the specified instance class.
     *         </p>
     */
    public Boolean getSupportsStorageAutoscaling() {
        return supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the specified instance class.
     * </p>
     *
     * @param supportsStorageAutoscaling <p>
     *            Whether or not Amazon RDS can automatically scale storage for
     *            DB instances that use the specified instance class.
     *            </p>
     */
    public void setSupportsStorageAutoscaling(Boolean supportsStorageAutoscaling) {
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
    }

    /**
     * <p>
     * Whether or not Amazon RDS can automatically scale storage for DB
     * instances that use the specified instance class.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsStorageAutoscaling <p>
     *            Whether or not Amazon RDS can automatically scale storage for
     *            DB instances that use the specified instance class.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsStorageAutoscaling(
            Boolean supportsStorageAutoscaling) {
        this.supportsStorageAutoscaling = supportsStorageAutoscaling;
        return this;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     *
     * @return <p>
     *         Whether a DB instance supports Kerberos Authentication.
     *         </p>
     */
    public Boolean isSupportsKerberosAuthentication() {
        return supportsKerberosAuthentication;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     *
     * @return <p>
     *         Whether a DB instance supports Kerberos Authentication.
     *         </p>
     */
    public Boolean getSupportsKerberosAuthentication() {
        return supportsKerberosAuthentication;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     *
     * @param supportsKerberosAuthentication <p>
     *            Whether a DB instance supports Kerberos Authentication.
     *            </p>
     */
    public void setSupportsKerberosAuthentication(Boolean supportsKerberosAuthentication) {
        this.supportsKerberosAuthentication = supportsKerberosAuthentication;
    }

    /**
     * <p>
     * Whether a DB instance supports Kerberos Authentication.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param supportsKerberosAuthentication <p>
     *            Whether a DB instance supports Kerberos Authentication.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OrderableDBInstanceOption withSupportsKerberosAuthentication(
            Boolean supportsKerberosAuthentication) {
        this.supportsKerberosAuthentication = supportsKerberosAuthentication;
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
        if (getEngine() != null)
            sb.append("Engine: " + getEngine() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getAvailabilityZones() != null)
            sb.append("AvailabilityZones: " + getAvailabilityZones() + ",");
        if (getMultiAZCapable() != null)
            sb.append("MultiAZCapable: " + getMultiAZCapable() + ",");
        if (getReadReplicaCapable() != null)
            sb.append("ReadReplicaCapable: " + getReadReplicaCapable() + ",");
        if (getVpc() != null)
            sb.append("Vpc: " + getVpc() + ",");
        if (getSupportsStorageEncryption() != null)
            sb.append("SupportsStorageEncryption: " + getSupportsStorageEncryption() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getSupportsIops() != null)
            sb.append("SupportsIops: " + getSupportsIops() + ",");
        if (getSupportsEnhancedMonitoring() != null)
            sb.append("SupportsEnhancedMonitoring: " + getSupportsEnhancedMonitoring() + ",");
        if (getSupportsIAMDatabaseAuthentication() != null)
            sb.append("SupportsIAMDatabaseAuthentication: "
                    + getSupportsIAMDatabaseAuthentication() + ",");
        if (getSupportsPerformanceInsights() != null)
            sb.append("SupportsPerformanceInsights: " + getSupportsPerformanceInsights() + ",");
        if (getMinStorageSize() != null)
            sb.append("MinStorageSize: " + getMinStorageSize() + ",");
        if (getMaxStorageSize() != null)
            sb.append("MaxStorageSize: " + getMaxStorageSize() + ",");
        if (getMinIopsPerDbInstance() != null)
            sb.append("MinIopsPerDbInstance: " + getMinIopsPerDbInstance() + ",");
        if (getMaxIopsPerDbInstance() != null)
            sb.append("MaxIopsPerDbInstance: " + getMaxIopsPerDbInstance() + ",");
        if (getMinIopsPerGib() != null)
            sb.append("MinIopsPerGib: " + getMinIopsPerGib() + ",");
        if (getMaxIopsPerGib() != null)
            sb.append("MaxIopsPerGib: " + getMaxIopsPerGib() + ",");
        if (getAvailableProcessorFeatures() != null)
            sb.append("AvailableProcessorFeatures: " + getAvailableProcessorFeatures() + ",");
        if (getSupportedEngineModes() != null)
            sb.append("SupportedEngineModes: " + getSupportedEngineModes() + ",");
        if (getSupportsStorageAutoscaling() != null)
            sb.append("SupportsStorageAutoscaling: " + getSupportsStorageAutoscaling() + ",");
        if (getSupportsKerberosAuthentication() != null)
            sb.append("SupportsKerberosAuthentication: " + getSupportsKerberosAuthentication());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngine() == null) ? 0 : getEngine().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode
                + ((getAvailabilityZones() == null) ? 0 : getAvailabilityZones().hashCode());
        hashCode = prime * hashCode
                + ((getMultiAZCapable() == null) ? 0 : getMultiAZCapable().hashCode());
        hashCode = prime * hashCode
                + ((getReadReplicaCapable() == null) ? 0 : getReadReplicaCapable().hashCode());
        hashCode = prime * hashCode + ((getVpc() == null) ? 0 : getVpc().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsStorageEncryption() == null) ? 0 : getSupportsStorageEncryption()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode
                + ((getSupportsIops() == null) ? 0 : getSupportsIops().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsEnhancedMonitoring() == null) ? 0 : getSupportsEnhancedMonitoring()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsIAMDatabaseAuthentication() == null) ? 0
                        : getSupportsIAMDatabaseAuthentication().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsPerformanceInsights() == null) ? 0
                        : getSupportsPerformanceInsights().hashCode());
        hashCode = prime * hashCode
                + ((getMinStorageSize() == null) ? 0 : getMinStorageSize().hashCode());
        hashCode = prime * hashCode
                + ((getMaxStorageSize() == null) ? 0 : getMaxStorageSize().hashCode());
        hashCode = prime * hashCode
                + ((getMinIopsPerDbInstance() == null) ? 0 : getMinIopsPerDbInstance().hashCode());
        hashCode = prime * hashCode
                + ((getMaxIopsPerDbInstance() == null) ? 0 : getMaxIopsPerDbInstance().hashCode());
        hashCode = prime * hashCode
                + ((getMinIopsPerGib() == null) ? 0 : getMinIopsPerGib().hashCode());
        hashCode = prime * hashCode
                + ((getMaxIopsPerGib() == null) ? 0 : getMaxIopsPerGib().hashCode());
        hashCode = prime
                * hashCode
                + ((getAvailableProcessorFeatures() == null) ? 0 : getAvailableProcessorFeatures()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSupportedEngineModes() == null) ? 0 : getSupportedEngineModes().hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsStorageAutoscaling() == null) ? 0 : getSupportsStorageAutoscaling()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSupportsKerberosAuthentication() == null) ? 0
                        : getSupportsKerberosAuthentication().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OrderableDBInstanceOption == false)
            return false;
        OrderableDBInstanceOption other = (OrderableDBInstanceOption) obj;

        if (other.getEngine() == null ^ this.getEngine() == null)
            return false;
        if (other.getEngine() != null && other.getEngine().equals(this.getEngine()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null
                && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null
                && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getAvailabilityZones() == null ^ this.getAvailabilityZones() == null)
            return false;
        if (other.getAvailabilityZones() != null
                && other.getAvailabilityZones().equals(this.getAvailabilityZones()) == false)
            return false;
        if (other.getMultiAZCapable() == null ^ this.getMultiAZCapable() == null)
            return false;
        if (other.getMultiAZCapable() != null
                && other.getMultiAZCapable().equals(this.getMultiAZCapable()) == false)
            return false;
        if (other.getReadReplicaCapable() == null ^ this.getReadReplicaCapable() == null)
            return false;
        if (other.getReadReplicaCapable() != null
                && other.getReadReplicaCapable().equals(this.getReadReplicaCapable()) == false)
            return false;
        if (other.getVpc() == null ^ this.getVpc() == null)
            return false;
        if (other.getVpc() != null && other.getVpc().equals(this.getVpc()) == false)
            return false;
        if (other.getSupportsStorageEncryption() == null
                ^ this.getSupportsStorageEncryption() == null)
            return false;
        if (other.getSupportsStorageEncryption() != null
                && other.getSupportsStorageEncryption().equals(this.getSupportsStorageEncryption()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getSupportsIops() == null ^ this.getSupportsIops() == null)
            return false;
        if (other.getSupportsIops() != null
                && other.getSupportsIops().equals(this.getSupportsIops()) == false)
            return false;
        if (other.getSupportsEnhancedMonitoring() == null
                ^ this.getSupportsEnhancedMonitoring() == null)
            return false;
        if (other.getSupportsEnhancedMonitoring() != null
                && other.getSupportsEnhancedMonitoring().equals(
                        this.getSupportsEnhancedMonitoring()) == false)
            return false;
        if (other.getSupportsIAMDatabaseAuthentication() == null
                ^ this.getSupportsIAMDatabaseAuthentication() == null)
            return false;
        if (other.getSupportsIAMDatabaseAuthentication() != null
                && other.getSupportsIAMDatabaseAuthentication().equals(
                        this.getSupportsIAMDatabaseAuthentication()) == false)
            return false;
        if (other.getSupportsPerformanceInsights() == null
                ^ this.getSupportsPerformanceInsights() == null)
            return false;
        if (other.getSupportsPerformanceInsights() != null
                && other.getSupportsPerformanceInsights().equals(
                        this.getSupportsPerformanceInsights()) == false)
            return false;
        if (other.getMinStorageSize() == null ^ this.getMinStorageSize() == null)
            return false;
        if (other.getMinStorageSize() != null
                && other.getMinStorageSize().equals(this.getMinStorageSize()) == false)
            return false;
        if (other.getMaxStorageSize() == null ^ this.getMaxStorageSize() == null)
            return false;
        if (other.getMaxStorageSize() != null
                && other.getMaxStorageSize().equals(this.getMaxStorageSize()) == false)
            return false;
        if (other.getMinIopsPerDbInstance() == null ^ this.getMinIopsPerDbInstance() == null)
            return false;
        if (other.getMinIopsPerDbInstance() != null
                && other.getMinIopsPerDbInstance().equals(this.getMinIopsPerDbInstance()) == false)
            return false;
        if (other.getMaxIopsPerDbInstance() == null ^ this.getMaxIopsPerDbInstance() == null)
            return false;
        if (other.getMaxIopsPerDbInstance() != null
                && other.getMaxIopsPerDbInstance().equals(this.getMaxIopsPerDbInstance()) == false)
            return false;
        if (other.getMinIopsPerGib() == null ^ this.getMinIopsPerGib() == null)
            return false;
        if (other.getMinIopsPerGib() != null
                && other.getMinIopsPerGib().equals(this.getMinIopsPerGib()) == false)
            return false;
        if (other.getMaxIopsPerGib() == null ^ this.getMaxIopsPerGib() == null)
            return false;
        if (other.getMaxIopsPerGib() != null
                && other.getMaxIopsPerGib().equals(this.getMaxIopsPerGib()) == false)
            return false;
        if (other.getAvailableProcessorFeatures() == null
                ^ this.getAvailableProcessorFeatures() == null)
            return false;
        if (other.getAvailableProcessorFeatures() != null
                && other.getAvailableProcessorFeatures().equals(
                        this.getAvailableProcessorFeatures()) == false)
            return false;
        if (other.getSupportedEngineModes() == null ^ this.getSupportedEngineModes() == null)
            return false;
        if (other.getSupportedEngineModes() != null
                && other.getSupportedEngineModes().equals(this.getSupportedEngineModes()) == false)
            return false;
        if (other.getSupportsStorageAutoscaling() == null
                ^ this.getSupportsStorageAutoscaling() == null)
            return false;
        if (other.getSupportsStorageAutoscaling() != null
                && other.getSupportsStorageAutoscaling().equals(
                        this.getSupportsStorageAutoscaling()) == false)
            return false;
        if (other.getSupportsKerberosAuthentication() == null
                ^ this.getSupportsKerberosAuthentication() == null)
            return false;
        if (other.getSupportsKerberosAuthentication() != null
                && other.getSupportsKerberosAuthentication().equals(
                        this.getSupportsKerberosAuthentication()) == false)
            return false;
        return true;
    }
}
