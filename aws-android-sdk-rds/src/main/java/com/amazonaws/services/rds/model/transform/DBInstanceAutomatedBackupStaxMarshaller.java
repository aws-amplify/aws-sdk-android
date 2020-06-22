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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO DBInstanceAutomatedBackup
 */
class DBInstanceAutomatedBackupStaxMarshaller {

    public void marshall(DBInstanceAutomatedBackup _dBInstanceAutomatedBackup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_dBInstanceAutomatedBackup.getDBInstanceArn() != null) {
            prefix = _prefix + "DBInstanceArn";
            String dBInstanceArn = _dBInstanceAutomatedBackup.getDBInstanceArn();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceArn));
        }
        if (_dBInstanceAutomatedBackup.getDbiResourceId() != null) {
            prefix = _prefix + "DbiResourceId";
            String dbiResourceId = _dBInstanceAutomatedBackup.getDbiResourceId();
            request.addParameter(prefix, StringUtils.fromString(dbiResourceId));
        }
        if (_dBInstanceAutomatedBackup.getRegion() != null) {
            prefix = _prefix + "Region";
            String region = _dBInstanceAutomatedBackup.getRegion();
            request.addParameter(prefix, StringUtils.fromString(region));
        }
        if (_dBInstanceAutomatedBackup.getDBInstanceIdentifier() != null) {
            prefix = _prefix + "DBInstanceIdentifier";
            String dBInstanceIdentifier = _dBInstanceAutomatedBackup.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (_dBInstanceAutomatedBackup.getRestoreWindow() != null) {
            prefix = _prefix + "RestoreWindow";
            RestoreWindow restoreWindow = _dBInstanceAutomatedBackup.getRestoreWindow();
            RestoreWindowStaxMarshaller.getInstance()
                    .marshall(restoreWindow, request, prefix + ".");
        }
        if (_dBInstanceAutomatedBackup.getAllocatedStorage() != null) {
            prefix = _prefix + "AllocatedStorage";
            Integer allocatedStorage = _dBInstanceAutomatedBackup.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (_dBInstanceAutomatedBackup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBInstanceAutomatedBackup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBInstanceAutomatedBackup.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _dBInstanceAutomatedBackup.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_dBInstanceAutomatedBackup.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _dBInstanceAutomatedBackup.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_dBInstanceAutomatedBackup.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _dBInstanceAutomatedBackup.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_dBInstanceAutomatedBackup.getInstanceCreateTime() != null) {
            prefix = _prefix + "InstanceCreateTime";
            java.util.Date instanceCreateTime = _dBInstanceAutomatedBackup.getInstanceCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(instanceCreateTime));
        }
        if (_dBInstanceAutomatedBackup.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _dBInstanceAutomatedBackup.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_dBInstanceAutomatedBackup.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _dBInstanceAutomatedBackup.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_dBInstanceAutomatedBackup.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _dBInstanceAutomatedBackup.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_dBInstanceAutomatedBackup.getLicenseModel() != null) {
            prefix = _prefix + "LicenseModel";
            String licenseModel = _dBInstanceAutomatedBackup.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (_dBInstanceAutomatedBackup.getIops() != null) {
            prefix = _prefix + "Iops";
            Integer iops = _dBInstanceAutomatedBackup.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (_dBInstanceAutomatedBackup.getOptionGroupName() != null) {
            prefix = _prefix + "OptionGroupName";
            String optionGroupName = _dBInstanceAutomatedBackup.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (_dBInstanceAutomatedBackup.getTdeCredentialArn() != null) {
            prefix = _prefix + "TdeCredentialArn";
            String tdeCredentialArn = _dBInstanceAutomatedBackup.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (_dBInstanceAutomatedBackup.getEncrypted() != null) {
            prefix = _prefix + "Encrypted";
            Boolean encrypted = _dBInstanceAutomatedBackup.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
        if (_dBInstanceAutomatedBackup.getStorageType() != null) {
            prefix = _prefix + "StorageType";
            String storageType = _dBInstanceAutomatedBackup.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (_dBInstanceAutomatedBackup.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _dBInstanceAutomatedBackup.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_dBInstanceAutomatedBackup.getTimezone() != null) {
            prefix = _prefix + "Timezone";
            String timezone = _dBInstanceAutomatedBackup.getTimezone();
            request.addParameter(prefix, StringUtils.fromString(timezone));
        }
        if (_dBInstanceAutomatedBackup.getIAMDatabaseAuthenticationEnabled() != null) {
            prefix = _prefix + "IAMDatabaseAuthenticationEnabled";
            Boolean iAMDatabaseAuthenticationEnabled = _dBInstanceAutomatedBackup
                    .getIAMDatabaseAuthenticationEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(iAMDatabaseAuthenticationEnabled));
        }
    }

    private static DBInstanceAutomatedBackupStaxMarshaller instance;

    public static DBInstanceAutomatedBackupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceAutomatedBackupStaxMarshaller();
        return instance;
    }
}
