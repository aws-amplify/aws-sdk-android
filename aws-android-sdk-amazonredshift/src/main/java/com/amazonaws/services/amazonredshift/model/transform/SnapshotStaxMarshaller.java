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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Snapshot
 */
class SnapshotStaxMarshaller {

    public void marshall(Snapshot _snapshot, Request<?> request, String _prefix) {
        String prefix;
        if (_snapshot.getSnapshotIdentifier() != null) {
            prefix = _prefix + "SnapshotIdentifier";
            String snapshotIdentifier = _snapshot.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (_snapshot.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _snapshot.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_snapshot.getSnapshotCreateTime() != null) {
            prefix = _prefix + "SnapshotCreateTime";
            java.util.Date snapshotCreateTime = _snapshot.getSnapshotCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(snapshotCreateTime));
        }
        if (_snapshot.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _snapshot.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_snapshot.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _snapshot.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_snapshot.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _snapshot.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_snapshot.getClusterCreateTime() != null) {
            prefix = _prefix + "ClusterCreateTime";
            java.util.Date clusterCreateTime = _snapshot.getClusterCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(clusterCreateTime));
        }
        if (_snapshot.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _snapshot.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_snapshot.getClusterVersion() != null) {
            prefix = _prefix + "ClusterVersion";
            String clusterVersion = _snapshot.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (_snapshot.getSnapshotType() != null) {
            prefix = _prefix + "SnapshotType";
            String snapshotType = _snapshot.getSnapshotType();
            request.addParameter(prefix, StringUtils.fromString(snapshotType));
        }
        if (_snapshot.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _snapshot.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_snapshot.getNumberOfNodes() != null) {
            prefix = _prefix + "NumberOfNodes";
            Integer numberOfNodes = _snapshot.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (_snapshot.getDBName() != null) {
            prefix = _prefix + "DBName";
            String dBName = _snapshot.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (_snapshot.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _snapshot.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_snapshot.getEncrypted() != null) {
            prefix = _prefix + "Encrypted";
            Boolean encrypted = _snapshot.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
        if (_snapshot.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _snapshot.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_snapshot.getEncryptedWithHSM() != null) {
            prefix = _prefix + "EncryptedWithHSM";
            Boolean encryptedWithHSM = _snapshot.getEncryptedWithHSM();
            request.addParameter(prefix, StringUtils.fromBoolean(encryptedWithHSM));
        }
        if (_snapshot.getAccountsWithRestoreAccess() != null) {
            prefix = _prefix + "AccountsWithRestoreAccess";
            java.util.List<AccountWithRestoreAccess> accountsWithRestoreAccess = _snapshot
                    .getAccountsWithRestoreAccess();
            int accountsWithRestoreAccessIndex = 1;
            String accountsWithRestoreAccessPrefix = prefix;
            for (AccountWithRestoreAccess accountsWithRestoreAccessItem : accountsWithRestoreAccess) {
                prefix = accountsWithRestoreAccessPrefix + "." + accountsWithRestoreAccessIndex;
                if (accountsWithRestoreAccessItem != null) {
                    AccountWithRestoreAccessStaxMarshaller.getInstance().marshall(
                            accountsWithRestoreAccessItem, request, prefix + ".");
                }
                accountsWithRestoreAccessIndex++;
            }
            prefix = accountsWithRestoreAccessPrefix;
        }
        if (_snapshot.getOwnerAccount() != null) {
            prefix = _prefix + "OwnerAccount";
            String ownerAccount = _snapshot.getOwnerAccount();
            request.addParameter(prefix, StringUtils.fromString(ownerAccount));
        }
        if (_snapshot.getTotalBackupSizeInMegaBytes() != null) {
            prefix = _prefix + "TotalBackupSizeInMegaBytes";
            Double totalBackupSizeInMegaBytes = _snapshot.getTotalBackupSizeInMegaBytes();
            request.addParameter(prefix, StringUtils.fromDouble(totalBackupSizeInMegaBytes));
        }
        if (_snapshot.getActualIncrementalBackupSizeInMegaBytes() != null) {
            prefix = _prefix + "ActualIncrementalBackupSizeInMegaBytes";
            Double actualIncrementalBackupSizeInMegaBytes = _snapshot
                    .getActualIncrementalBackupSizeInMegaBytes();
            request.addParameter(prefix,
                    StringUtils.fromDouble(actualIncrementalBackupSizeInMegaBytes));
        }
        if (_snapshot.getBackupProgressInMegaBytes() != null) {
            prefix = _prefix + "BackupProgressInMegaBytes";
            Double backupProgressInMegaBytes = _snapshot.getBackupProgressInMegaBytes();
            request.addParameter(prefix, StringUtils.fromDouble(backupProgressInMegaBytes));
        }
        if (_snapshot.getCurrentBackupRateInMegaBytesPerSecond() != null) {
            prefix = _prefix + "CurrentBackupRateInMegaBytesPerSecond";
            Double currentBackupRateInMegaBytesPerSecond = _snapshot
                    .getCurrentBackupRateInMegaBytesPerSecond();
            request.addParameter(prefix,
                    StringUtils.fromDouble(currentBackupRateInMegaBytesPerSecond));
        }
        if (_snapshot.getEstimatedSecondsToCompletion() != null) {
            prefix = _prefix + "EstimatedSecondsToCompletion";
            Long estimatedSecondsToCompletion = _snapshot.getEstimatedSecondsToCompletion();
            request.addParameter(prefix, StringUtils.fromLong(estimatedSecondsToCompletion));
        }
        if (_snapshot.getElapsedTimeInSeconds() != null) {
            prefix = _prefix + "ElapsedTimeInSeconds";
            Long elapsedTimeInSeconds = _snapshot.getElapsedTimeInSeconds();
            request.addParameter(prefix, StringUtils.fromLong(elapsedTimeInSeconds));
        }
        if (_snapshot.getSourceRegion() != null) {
            prefix = _prefix + "SourceRegion";
            String sourceRegion = _snapshot.getSourceRegion();
            request.addParameter(prefix, StringUtils.fromString(sourceRegion));
        }
        if (_snapshot.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _snapshot.getTags();
            int tagsIndex = 1;
            String tagsPrefix = prefix;
            for (Tag tagsItem : tags) {
                prefix = tagsPrefix + "." + tagsIndex;
                if (tagsItem != null) {
                    TagStaxMarshaller.getInstance().marshall(tagsItem, request, prefix + ".");
                }
                tagsIndex++;
            }
            prefix = tagsPrefix;
        }
        if (_snapshot.getRestorableNodeTypes() != null) {
            prefix = _prefix + "RestorableNodeTypes";
            java.util.List<String> restorableNodeTypes = _snapshot.getRestorableNodeTypes();
            int restorableNodeTypesIndex = 1;
            String restorableNodeTypesPrefix = prefix;
            for (String restorableNodeTypesItem : restorableNodeTypes) {
                prefix = restorableNodeTypesPrefix + "." + restorableNodeTypesIndex;
                if (restorableNodeTypesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(restorableNodeTypesItem));
                }
                restorableNodeTypesIndex++;
            }
            prefix = restorableNodeTypesPrefix;
        }
        if (_snapshot.getEnhancedVpcRouting() != null) {
            prefix = _prefix + "EnhancedVpcRouting";
            Boolean enhancedVpcRouting = _snapshot.getEnhancedVpcRouting();
            request.addParameter(prefix, StringUtils.fromBoolean(enhancedVpcRouting));
        }
        if (_snapshot.getMaintenanceTrackName() != null) {
            prefix = _prefix + "MaintenanceTrackName";
            String maintenanceTrackName = _snapshot.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (_snapshot.getManualSnapshotRetentionPeriod() != null) {
            prefix = _prefix + "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = _snapshot.getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (_snapshot.getManualSnapshotRemainingDays() != null) {
            prefix = _prefix + "ManualSnapshotRemainingDays";
            Integer manualSnapshotRemainingDays = _snapshot.getManualSnapshotRemainingDays();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRemainingDays));
        }
        if (_snapshot.getSnapshotRetentionStartTime() != null) {
            prefix = _prefix + "SnapshotRetentionStartTime";
            java.util.Date snapshotRetentionStartTime = _snapshot.getSnapshotRetentionStartTime();
            request.addParameter(prefix, StringUtils.fromDate(snapshotRetentionStartTime));
        }
    }

    private static SnapshotStaxMarshaller instance;

    public static SnapshotStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotStaxMarshaller();
        return instance;
    }
}
