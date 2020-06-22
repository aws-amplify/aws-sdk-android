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
 * StAX marshaller for POJO DBSnapshot
 */
class DBSnapshotStaxMarshaller {

    public void marshall(DBSnapshot _dBSnapshot, Request<?> request, String _prefix) {
        String prefix;
        if (_dBSnapshot.getDBSnapshotIdentifier() != null) {
            prefix = _prefix + "DBSnapshotIdentifier";
            String dBSnapshotIdentifier = _dBSnapshot.getDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotIdentifier));
        }
        if (_dBSnapshot.getDBInstanceIdentifier() != null) {
            prefix = _prefix + "DBInstanceIdentifier";
            String dBInstanceIdentifier = _dBSnapshot.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (_dBSnapshot.getSnapshotCreateTime() != null) {
            prefix = _prefix + "SnapshotCreateTime";
            java.util.Date snapshotCreateTime = _dBSnapshot.getSnapshotCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(snapshotCreateTime));
        }
        if (_dBSnapshot.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _dBSnapshot.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_dBSnapshot.getAllocatedStorage() != null) {
            prefix = _prefix + "AllocatedStorage";
            Integer allocatedStorage = _dBSnapshot.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (_dBSnapshot.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBSnapshot.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBSnapshot.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _dBSnapshot.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_dBSnapshot.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _dBSnapshot.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_dBSnapshot.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _dBSnapshot.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_dBSnapshot.getInstanceCreateTime() != null) {
            prefix = _prefix + "InstanceCreateTime";
            java.util.Date instanceCreateTime = _dBSnapshot.getInstanceCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(instanceCreateTime));
        }
        if (_dBSnapshot.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _dBSnapshot.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_dBSnapshot.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _dBSnapshot.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_dBSnapshot.getLicenseModel() != null) {
            prefix = _prefix + "LicenseModel";
            String licenseModel = _dBSnapshot.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (_dBSnapshot.getSnapshotType() != null) {
            prefix = _prefix + "SnapshotType";
            String snapshotType = _dBSnapshot.getSnapshotType();
            request.addParameter(prefix, StringUtils.fromString(snapshotType));
        }
        if (_dBSnapshot.getIops() != null) {
            prefix = _prefix + "Iops";
            Integer iops = _dBSnapshot.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (_dBSnapshot.getOptionGroupName() != null) {
            prefix = _prefix + "OptionGroupName";
            String optionGroupName = _dBSnapshot.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (_dBSnapshot.getPercentProgress() != null) {
            prefix = _prefix + "PercentProgress";
            Integer percentProgress = _dBSnapshot.getPercentProgress();
            request.addParameter(prefix, StringUtils.fromInteger(percentProgress));
        }
        if (_dBSnapshot.getSourceRegion() != null) {
            prefix = _prefix + "SourceRegion";
            String sourceRegion = _dBSnapshot.getSourceRegion();
            request.addParameter(prefix, StringUtils.fromString(sourceRegion));
        }
        if (_dBSnapshot.getSourceDBSnapshotIdentifier() != null) {
            prefix = _prefix + "SourceDBSnapshotIdentifier";
            String sourceDBSnapshotIdentifier = _dBSnapshot.getSourceDBSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(sourceDBSnapshotIdentifier));
        }
        if (_dBSnapshot.getStorageType() != null) {
            prefix = _prefix + "StorageType";
            String storageType = _dBSnapshot.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (_dBSnapshot.getTdeCredentialArn() != null) {
            prefix = _prefix + "TdeCredentialArn";
            String tdeCredentialArn = _dBSnapshot.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (_dBSnapshot.getEncrypted() != null) {
            prefix = _prefix + "Encrypted";
            Boolean encrypted = _dBSnapshot.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
        if (_dBSnapshot.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _dBSnapshot.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_dBSnapshot.getDBSnapshotArn() != null) {
            prefix = _prefix + "DBSnapshotArn";
            String dBSnapshotArn = _dBSnapshot.getDBSnapshotArn();
            request.addParameter(prefix, StringUtils.fromString(dBSnapshotArn));
        }
        if (_dBSnapshot.getTimezone() != null) {
            prefix = _prefix + "Timezone";
            String timezone = _dBSnapshot.getTimezone();
            request.addParameter(prefix, StringUtils.fromString(timezone));
        }
        if (_dBSnapshot.getIAMDatabaseAuthenticationEnabled() != null) {
            prefix = _prefix + "IAMDatabaseAuthenticationEnabled";
            Boolean iAMDatabaseAuthenticationEnabled = _dBSnapshot
                    .getIAMDatabaseAuthenticationEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(iAMDatabaseAuthenticationEnabled));
        }
        if (_dBSnapshot.getProcessorFeatures() != null) {
            prefix = _prefix + "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = _dBSnapshot.getProcessorFeatures();
            int processorFeaturesIndex = 1;
            String processorFeaturesPrefix = prefix;
            for (ProcessorFeature processorFeaturesItem : processorFeatures) {
                prefix = processorFeaturesPrefix + "." + processorFeaturesIndex;
                if (processorFeaturesItem != null) {
                    ProcessorFeatureStaxMarshaller.getInstance().marshall(processorFeaturesItem,
                            request, prefix + ".");
                }
                processorFeaturesIndex++;
            }
            prefix = processorFeaturesPrefix;
        }
        if (_dBSnapshot.getDbiResourceId() != null) {
            prefix = _prefix + "DbiResourceId";
            String dbiResourceId = _dBSnapshot.getDbiResourceId();
            request.addParameter(prefix, StringUtils.fromString(dbiResourceId));
        }
    }

    private static DBSnapshotStaxMarshaller instance;

    public static DBSnapshotStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBSnapshotStaxMarshaller();
        return instance;
    }
}
