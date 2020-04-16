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
 * This data type is used as a response element in the
 * <code>ModifyDBInstance</code> action.
 * </p>
 */
public class PendingModifiedValues implements Serializable {
    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is currently being applied.
     * </p>
     */
    private String dBInstanceClass;

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     */
    private Integer allocatedStorage;

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master
     * credentials for the DB instance.
     * </p>
     */
    private String masterUserPassword;

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are
     * retained.
     * </p>
     */
    private Integer backupRetentionPeriod;

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     * </p>
     */
    private Boolean multiAZ;

    /**
     * <p>
     * Indicates the database engine version.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     */
    private String licenseModel;

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be
     * applied or is currently being applied.
     * </p>
     */
    private Integer iops;

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     */
    private String dBInstanceIdentifier;

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     */
    private String storageType;

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     */
    private String cACertificateIdentifier;

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     */
    private String dBSubnetGroupName;

    /**
     * <p>
     * A list of the log types whose configuration is still pending. In other
     * words, these log types are in the process of being activated or
     * deactivated.
     * </p>
     */
    private PendingCloudwatchLogsExports pendingCloudwatchLogsExports;

    /**
     * <p>
     * The number of CPU cores and the number of threads per core for the DB
     * instance class of the DB instance.
     * </p>
     */
    private java.util.List<ProcessorFeature> processorFeatures;

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is currently being applied.
     * </p>
     *
     * @return <p>
     *         Contains the new <code>DBInstanceClass</code> for the DB instance
     *         that will be applied or is currently being applied.
     *         </p>
     */
    public String getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is currently being applied.
     * </p>
     *
     * @param dBInstanceClass <p>
     *            Contains the new <code>DBInstanceClass</code> for the DB
     *            instance that will be applied or is currently being applied.
     *            </p>
     */
    public void setDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceClass</code> for the DB instance that
     * will be applied or is currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceClass <p>
     *            Contains the new <code>DBInstanceClass</code> for the DB
     *            instance that will be applied or is currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withDBInstanceClass(String dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     *
     * @return <p>
     *         Contains the new <code>AllocatedStorage</code> size for the DB
     *         instance that will be applied or is currently being applied.
     *         </p>
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     *
     * @param allocatedStorage <p>
     *            Contains the new <code>AllocatedStorage</code> size for the DB
     *            instance that will be applied or is currently being applied.
     *            </p>
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    /**
     * <p>
     * Contains the new <code>AllocatedStorage</code> size for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param allocatedStorage <p>
     *            Contains the new <code>AllocatedStorage</code> size for the DB
     *            instance that will be applied or is currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master
     * credentials for the DB instance.
     * </p>
     *
     * @return <p>
     *         Contains the pending or currently-in-progress change of the
     *         master credentials for the DB instance.
     *         </p>
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master
     * credentials for the DB instance.
     * </p>
     *
     * @param masterUserPassword <p>
     *            Contains the pending or currently-in-progress change of the
     *            master credentials for the DB instance.
     *            </p>
     */
    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * Contains the pending or currently-in-progress change of the master
     * credentials for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param masterUserPassword <p>
     *            Contains the pending or currently-in-progress change of the
     *            master credentials for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
        return this;
    }

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     *
     * @return <p>
     *         Specifies the pending port for the DB instance.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     *
     * @param port <p>
     *            Specifies the pending port for the DB instance.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the pending port for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            Specifies the pending port for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are
     * retained.
     * </p>
     *
     * @return <p>
     *         Specifies the pending number of days for which automated backups
     *         are retained.
     *         </p>
     */
    public Integer getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are
     * retained.
     * </p>
     *
     * @param backupRetentionPeriod <p>
     *            Specifies the pending number of days for which automated
     *            backups are retained.
     *            </p>
     */
    public void setBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
    }

    /**
     * <p>
     * Specifies the pending number of days for which automated backups are
     * retained.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backupRetentionPeriod <p>
     *            Specifies the pending number of days for which automated
     *            backups are retained.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withBackupRetentionPeriod(Integer backupRetentionPeriod) {
        this.backupRetentionPeriod = backupRetentionPeriod;
        return this;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     * </p>
     *
     * @return <p>
     *         Indicates that the Single-AZ DB instance is to change to a
     *         Multi-AZ deployment.
     *         </p>
     */
    public Boolean isMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     * </p>
     *
     * @return <p>
     *         Indicates that the Single-AZ DB instance is to change to a
     *         Multi-AZ deployment.
     *         </p>
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     * </p>
     *
     * @param multiAZ <p>
     *            Indicates that the Single-AZ DB instance is to change to a
     *            Multi-AZ deployment.
     *            </p>
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    /**
     * <p>
     * Indicates that the Single-AZ DB instance is to change to a Multi-AZ
     * deployment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param multiAZ <p>
     *            Indicates that the Single-AZ DB instance is to change to a
     *            Multi-AZ deployment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
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
    public PendingModifiedValues withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * <p>
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     *
     * @return <p>
     *         The license model for the DB instance.
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
     * The license model for the DB instance.
     * </p>
     * <p>
     * Valid values: <code>license-included</code> |
     * <code>bring-your-own-license</code> | <code>general-public-license</code>
     * </p>
     *
     * @param licenseModel <p>
     *            The license model for the DB instance.
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
     * The license model for the DB instance.
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
     *            The license model for the DB instance.
     *            </p>
     *            <p>
     *            Valid values: <code>license-included</code> |
     *            <code>bring-your-own-license</code> |
     *            <code>general-public-license</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withLicenseModel(String licenseModel) {
        this.licenseModel = licenseModel;
        return this;
    }

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be
     * applied or is currently being applied.
     * </p>
     *
     * @return <p>
     *         Specifies the new Provisioned IOPS value for the DB instance that
     *         will be applied or is currently being applied.
     *         </p>
     */
    public Integer getIops() {
        return iops;
    }

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be
     * applied or is currently being applied.
     * </p>
     *
     * @param iops <p>
     *            Specifies the new Provisioned IOPS value for the DB instance
     *            that will be applied or is currently being applied.
     *            </p>
     */
    public void setIops(Integer iops) {
        this.iops = iops;
    }

    /**
     * <p>
     * Specifies the new Provisioned IOPS value for the DB instance that will be
     * applied or is currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iops <p>
     *            Specifies the new Provisioned IOPS value for the DB instance
     *            that will be applied or is currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withIops(Integer iops) {
        this.iops = iops;
        return this;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     *
     * @return <p>
     *         Contains the new <code>DBInstanceIdentifier</code> for the DB
     *         instance that will be applied or is currently being applied.
     *         </p>
     */
    public String getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     *
     * @param dBInstanceIdentifier <p>
     *            Contains the new <code>DBInstanceIdentifier</code> for the DB
     *            instance that will be applied or is currently being applied.
     *            </p>
     */
    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * Contains the new <code>DBInstanceIdentifier</code> for the DB instance
     * that will be applied or is currently being applied.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBInstanceIdentifier <p>
     *            Contains the new <code>DBInstanceIdentifier</code> for the DB
     *            instance that will be applied or is currently being applied.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     *
     * @return <p>
     *         Specifies the storage type to be associated with the DB instance.
     *         </p>
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * <p>
     * Specifies the storage type to be associated with the DB instance.
     * </p>
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
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
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param storageType <p>
     *            Specifies the storage type to be associated with the DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withStorageType(String storageType) {
        this.storageType = storageType;
        return this;
    }

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     *
     * @return <p>
     *         Specifies the identifier of the CA certificate for the DB
     *         instance.
     *         </p>
     */
    public String getCACertificateIdentifier() {
        return cACertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     *
     * @param cACertificateIdentifier <p>
     *            Specifies the identifier of the CA certificate for the DB
     *            instance.
     *            </p>
     */
    public void setCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
    }

    /**
     * <p>
     * Specifies the identifier of the CA certificate for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cACertificateIdentifier <p>
     *            Specifies the identifier of the CA certificate for the DB
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withCACertificateIdentifier(String cACertificateIdentifier) {
        this.cACertificateIdentifier = cACertificateIdentifier;
        return this;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     *
     * @return <p>
     *         The new DB subnet group for the DB instance.
     *         </p>
     */
    public String getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     *
     * @param dBSubnetGroupName <p>
     *            The new DB subnet group for the DB instance.
     *            </p>
     */
    public void setDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    /**
     * <p>
     * The new DB subnet group for the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dBSubnetGroupName <p>
     *            The new DB subnet group for the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withDBSubnetGroupName(String dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * <p>
     * A list of the log types whose configuration is still pending. In other
     * words, these log types are in the process of being activated or
     * deactivated.
     * </p>
     *
     * @return <p>
     *         A list of the log types whose configuration is still pending. In
     *         other words, these log types are in the process of being
     *         activated or deactivated.
     *         </p>
     */
    public PendingCloudwatchLogsExports getPendingCloudwatchLogsExports() {
        return pendingCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of the log types whose configuration is still pending. In other
     * words, these log types are in the process of being activated or
     * deactivated.
     * </p>
     *
     * @param pendingCloudwatchLogsExports <p>
     *            A list of the log types whose configuration is still pending.
     *            In other words, these log types are in the process of being
     *            activated or deactivated.
     *            </p>
     */
    public void setPendingCloudwatchLogsExports(
            PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
        this.pendingCloudwatchLogsExports = pendingCloudwatchLogsExports;
    }

    /**
     * <p>
     * A list of the log types whose configuration is still pending. In other
     * words, these log types are in the process of being activated or
     * deactivated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pendingCloudwatchLogsExports <p>
     *            A list of the log types whose configuration is still pending.
     *            In other words, these log types are in the process of being
     *            activated or deactivated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PendingModifiedValues withPendingCloudwatchLogsExports(
            PendingCloudwatchLogsExports pendingCloudwatchLogsExports) {
        this.pendingCloudwatchLogsExports = pendingCloudwatchLogsExports;
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
    public PendingModifiedValues withProcessorFeatures(ProcessorFeature... processorFeatures) {
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
    public PendingModifiedValues withProcessorFeatures(
            java.util.Collection<ProcessorFeature> processorFeatures) {
        setProcessorFeatures(processorFeatures);
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
        if (getDBInstanceClass() != null)
            sb.append("DBInstanceClass: " + getDBInstanceClass() + ",");
        if (getAllocatedStorage() != null)
            sb.append("AllocatedStorage: " + getAllocatedStorage() + ",");
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: " + getMasterUserPassword() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getBackupRetentionPeriod() != null)
            sb.append("BackupRetentionPeriod: " + getBackupRetentionPeriod() + ",");
        if (getMultiAZ() != null)
            sb.append("MultiAZ: " + getMultiAZ() + ",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: " + getEngineVersion() + ",");
        if (getLicenseModel() != null)
            sb.append("LicenseModel: " + getLicenseModel() + ",");
        if (getIops() != null)
            sb.append("Iops: " + getIops() + ",");
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: " + getDBInstanceIdentifier() + ",");
        if (getStorageType() != null)
            sb.append("StorageType: " + getStorageType() + ",");
        if (getCACertificateIdentifier() != null)
            sb.append("CACertificateIdentifier: " + getCACertificateIdentifier() + ",");
        if (getDBSubnetGroupName() != null)
            sb.append("DBSubnetGroupName: " + getDBSubnetGroupName() + ",");
        if (getPendingCloudwatchLogsExports() != null)
            sb.append("PendingCloudwatchLogsExports: " + getPendingCloudwatchLogsExports() + ",");
        if (getProcessorFeatures() != null)
            sb.append("ProcessorFeatures: " + getProcessorFeatures());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getDBInstanceClass() == null) ? 0 : getDBInstanceClass().hashCode());
        hashCode = prime * hashCode
                + ((getAllocatedStorage() == null) ? 0 : getAllocatedStorage().hashCode());
        hashCode = prime * hashCode
                + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime
                * hashCode
                + ((getBackupRetentionPeriod() == null) ? 0 : getBackupRetentionPeriod().hashCode());
        hashCode = prime * hashCode + ((getMultiAZ() == null) ? 0 : getMultiAZ().hashCode());
        hashCode = prime * hashCode
                + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode
                + ((getLicenseModel() == null) ? 0 : getLicenseModel().hashCode());
        hashCode = prime * hashCode + ((getIops() == null) ? 0 : getIops().hashCode());
        hashCode = prime * hashCode
                + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime
                * hashCode
                + ((getCACertificateIdentifier() == null) ? 0 : getCACertificateIdentifier()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getDBSubnetGroupName() == null) ? 0 : getDBSubnetGroupName().hashCode());
        hashCode = prime
                * hashCode
                + ((getPendingCloudwatchLogsExports() == null) ? 0
                        : getPendingCloudwatchLogsExports().hashCode());
        hashCode = prime * hashCode
                + ((getProcessorFeatures() == null) ? 0 : getProcessorFeatures().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedValues == false)
            return false;
        PendingModifiedValues other = (PendingModifiedValues) obj;

        if (other.getDBInstanceClass() == null ^ this.getDBInstanceClass() == null)
            return false;
        if (other.getDBInstanceClass() != null
                && other.getDBInstanceClass().equals(this.getDBInstanceClass()) == false)
            return false;
        if (other.getAllocatedStorage() == null ^ this.getAllocatedStorage() == null)
            return false;
        if (other.getAllocatedStorage() != null
                && other.getAllocatedStorage().equals(this.getAllocatedStorage()) == false)
            return false;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null
                && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getBackupRetentionPeriod() == null ^ this.getBackupRetentionPeriod() == null)
            return false;
        if (other.getBackupRetentionPeriod() != null
                && other.getBackupRetentionPeriod().equals(this.getBackupRetentionPeriod()) == false)
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
        if (other.getLicenseModel() == null ^ this.getLicenseModel() == null)
            return false;
        if (other.getLicenseModel() != null
                && other.getLicenseModel().equals(this.getLicenseModel()) == false)
            return false;
        if (other.getIops() == null ^ this.getIops() == null)
            return false;
        if (other.getIops() != null && other.getIops().equals(this.getIops()) == false)
            return false;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null
                && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null
                && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getCACertificateIdentifier() == null ^ this.getCACertificateIdentifier() == null)
            return false;
        if (other.getCACertificateIdentifier() != null
                && other.getCACertificateIdentifier().equals(this.getCACertificateIdentifier()) == false)
            return false;
        if (other.getDBSubnetGroupName() == null ^ this.getDBSubnetGroupName() == null)
            return false;
        if (other.getDBSubnetGroupName() != null
                && other.getDBSubnetGroupName().equals(this.getDBSubnetGroupName()) == false)
            return false;
        if (other.getPendingCloudwatchLogsExports() == null
                ^ this.getPendingCloudwatchLogsExports() == null)
            return false;
        if (other.getPendingCloudwatchLogsExports() != null
                && other.getPendingCloudwatchLogsExports().equals(
                        this.getPendingCloudwatchLogsExports()) == false)
            return false;
        if (other.getProcessorFeatures() == null ^ this.getProcessorFeatures() == null)
            return false;
        if (other.getProcessorFeatures() != null
                && other.getProcessorFeatures().equals(this.getProcessorFeatures()) == false)
            return false;
        return true;
    }
}
