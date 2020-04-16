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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO PendingModifiedValues
 */
class PendingModifiedValuesStaxMarshaller {

    public void marshall(PendingModifiedValues _pendingModifiedValues, Request<?> request,
            String _prefix) {
        String prefix;
        if (_pendingModifiedValues.getDBInstanceClass() != null) {
            prefix = _prefix + "DBInstanceClass";
            String dBInstanceClass = _pendingModifiedValues.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (_pendingModifiedValues.getAllocatedStorage() != null) {
            prefix = _prefix + "AllocatedStorage";
            Integer allocatedStorage = _pendingModifiedValues.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (_pendingModifiedValues.getMasterUserPassword() != null) {
            prefix = _prefix + "MasterUserPassword";
            String masterUserPassword = _pendingModifiedValues.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (_pendingModifiedValues.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _pendingModifiedValues.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_pendingModifiedValues.getBackupRetentionPeriod() != null) {
            prefix = _prefix + "BackupRetentionPeriod";
            Integer backupRetentionPeriod = _pendingModifiedValues.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (_pendingModifiedValues.getMultiAZ() != null) {
            prefix = _prefix + "MultiAZ";
            Boolean multiAZ = _pendingModifiedValues.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (_pendingModifiedValues.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _pendingModifiedValues.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_pendingModifiedValues.getLicenseModel() != null) {
            prefix = _prefix + "LicenseModel";
            String licenseModel = _pendingModifiedValues.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (_pendingModifiedValues.getIops() != null) {
            prefix = _prefix + "Iops";
            Integer iops = _pendingModifiedValues.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (_pendingModifiedValues.getDBInstanceIdentifier() != null) {
            prefix = _prefix + "DBInstanceIdentifier";
            String dBInstanceIdentifier = _pendingModifiedValues.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (_pendingModifiedValues.getStorageType() != null) {
            prefix = _prefix + "StorageType";
            String storageType = _pendingModifiedValues.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (_pendingModifiedValues.getCACertificateIdentifier() != null) {
            prefix = _prefix + "CACertificateIdentifier";
            String cACertificateIdentifier = _pendingModifiedValues.getCACertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(cACertificateIdentifier));
        }
        if (_pendingModifiedValues.getDBSubnetGroupName() != null) {
            prefix = _prefix + "DBSubnetGroupName";
            String dBSubnetGroupName = _pendingModifiedValues.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (_pendingModifiedValues.getPendingCloudwatchLogsExports() != null) {
            prefix = _prefix + "PendingCloudwatchLogsExports";
            PendingCloudwatchLogsExports pendingCloudwatchLogsExports = _pendingModifiedValues
                    .getPendingCloudwatchLogsExports();
            PendingCloudwatchLogsExportsStaxMarshaller.getInstance().marshall(
                    pendingCloudwatchLogsExports, request, prefix + ".");
        }
        if (_pendingModifiedValues.getProcessorFeatures() != null) {
            prefix = _prefix + "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = _pendingModifiedValues
                    .getProcessorFeatures();
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
    }

    private static PendingModifiedValuesStaxMarshaller instance;

    public static PendingModifiedValuesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PendingModifiedValuesStaxMarshaller();
        return instance;
    }
}
