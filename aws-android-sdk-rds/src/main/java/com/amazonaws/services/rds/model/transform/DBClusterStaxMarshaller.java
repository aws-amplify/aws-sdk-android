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
 * StAX marshaller for POJO DBCluster
 */
class DBClusterStaxMarshaller {

    public void marshall(DBCluster _dBCluster, Request<?> request, String _prefix) {
        String prefix;
        if (_dBCluster.getAllocatedStorage() != null) {
            prefix = _prefix + "AllocatedStorage";
            Integer allocatedStorage = _dBCluster.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (_dBCluster.getAvailabilityZones() != null) {
            prefix = _prefix + "AvailabilityZones";
            java.util.List<String> availabilityZones = _dBCluster.getAvailabilityZones();
            int availabilityZonesIndex = 1;
            String availabilityZonesPrefix = prefix;
            for (String availabilityZonesItem : availabilityZones) {
                prefix = availabilityZonesPrefix + "." + availabilityZonesIndex;
                if (availabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(availabilityZonesItem));
                }
                availabilityZonesIndex++;
            }
            prefix = availabilityZonesPrefix;
        }
        if (_dBCluster.getBackupRetentionPeriod() != null) {
            prefix = _prefix + "BackupRetentionPeriod";
            Integer backupRetentionPeriod = _dBCluster.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (_dBCluster.getCharacterSetName() != null) {
            prefix = _prefix + "CharacterSetName";
            String characterSetName = _dBCluster.getCharacterSetName();
            request.addParameter(prefix, StringUtils.fromString(characterSetName));
        }
        if (_dBCluster.getDatabaseName() != null) {
            prefix = _prefix + "DatabaseName";
            String databaseName = _dBCluster.getDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(databaseName));
        }
        if (_dBCluster.getDBClusterIdentifier() != null) {
            prefix = _prefix + "DBClusterIdentifier";
            String dBClusterIdentifier = _dBCluster.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (_dBCluster.getDBClusterParameterGroup() != null) {
            prefix = _prefix + "DBClusterParameterGroup";
            String dBClusterParameterGroup = _dBCluster.getDBClusterParameterGroup();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroup));
        }
        if (_dBCluster.getDBSubnetGroup() != null) {
            prefix = _prefix + "DBSubnetGroup";
            String dBSubnetGroup = _dBCluster.getDBSubnetGroup();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroup));
        }
        if (_dBCluster.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _dBCluster.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_dBCluster.getPercentProgress() != null) {
            prefix = _prefix + "PercentProgress";
            String percentProgress = _dBCluster.getPercentProgress();
            request.addParameter(prefix, StringUtils.fromString(percentProgress));
        }
        if (_dBCluster.getEarliestRestorableTime() != null) {
            prefix = _prefix + "EarliestRestorableTime";
            java.util.Date earliestRestorableTime = _dBCluster.getEarliestRestorableTime();
            request.addParameter(prefix, StringUtils.fromDate(earliestRestorableTime));
        }
        if (_dBCluster.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            String endpoint = _dBCluster.getEndpoint();
            request.addParameter(prefix, StringUtils.fromString(endpoint));
        }
        if (_dBCluster.getReaderEndpoint() != null) {
            prefix = _prefix + "ReaderEndpoint";
            String readerEndpoint = _dBCluster.getReaderEndpoint();
            request.addParameter(prefix, StringUtils.fromString(readerEndpoint));
        }
        if (_dBCluster.getCustomEndpoints() != null) {
            prefix = _prefix + "CustomEndpoints";
            java.util.List<String> customEndpoints = _dBCluster.getCustomEndpoints();
            int customEndpointsIndex = 1;
            String customEndpointsPrefix = prefix;
            for (String customEndpointsItem : customEndpoints) {
                prefix = customEndpointsPrefix + ".member." + customEndpointsIndex;
                if (customEndpointsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(customEndpointsItem));
                }
                customEndpointsIndex++;
            }
            prefix = customEndpointsPrefix;
        }
        if (_dBCluster.getMultiAZ() != null) {
            prefix = _prefix + "MultiAZ";
            Boolean multiAZ = _dBCluster.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (_dBCluster.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _dBCluster.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_dBCluster.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _dBCluster.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_dBCluster.getLatestRestorableTime() != null) {
            prefix = _prefix + "LatestRestorableTime";
            java.util.Date latestRestorableTime = _dBCluster.getLatestRestorableTime();
            request.addParameter(prefix, StringUtils.fromDate(latestRestorableTime));
        }
        if (_dBCluster.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _dBCluster.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_dBCluster.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _dBCluster.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_dBCluster.getDBClusterOptionGroupMemberships() != null) {
            prefix = _prefix + "DBClusterOptionGroupMemberships";
            java.util.List<DBClusterOptionGroupStatus> dBClusterOptionGroupMemberships = _dBCluster
                    .getDBClusterOptionGroupMemberships();
            int dBClusterOptionGroupMembershipsIndex = 1;
            String dBClusterOptionGroupMembershipsPrefix = prefix;
            for (DBClusterOptionGroupStatus dBClusterOptionGroupMembershipsItem : dBClusterOptionGroupMemberships) {
                prefix = dBClusterOptionGroupMembershipsPrefix + "."
                        + dBClusterOptionGroupMembershipsIndex;
                if (dBClusterOptionGroupMembershipsItem != null) {
                    DBClusterOptionGroupStatusStaxMarshaller.getInstance().marshall(
                            dBClusterOptionGroupMembershipsItem, request, prefix + ".");
                }
                dBClusterOptionGroupMembershipsIndex++;
            }
            prefix = dBClusterOptionGroupMembershipsPrefix;
        }
        if (_dBCluster.getPreferredBackupWindow() != null) {
            prefix = _prefix + "PreferredBackupWindow";
            String preferredBackupWindow = _dBCluster.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (_dBCluster.getPreferredMaintenanceWindow() != null) {
            prefix = _prefix + "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = _dBCluster.getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (_dBCluster.getReplicationSourceIdentifier() != null) {
            prefix = _prefix + "ReplicationSourceIdentifier";
            String replicationSourceIdentifier = _dBCluster.getReplicationSourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(replicationSourceIdentifier));
        }
        if (_dBCluster.getReadReplicaIdentifiers() != null) {
            prefix = _prefix + "ReadReplicaIdentifiers";
            java.util.List<String> readReplicaIdentifiers = _dBCluster.getReadReplicaIdentifiers();
            int readReplicaIdentifiersIndex = 1;
            String readReplicaIdentifiersPrefix = prefix;
            for (String readReplicaIdentifiersItem : readReplicaIdentifiers) {
                prefix = readReplicaIdentifiersPrefix + "." + readReplicaIdentifiersIndex;
                if (readReplicaIdentifiersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(readReplicaIdentifiersItem));
                }
                readReplicaIdentifiersIndex++;
            }
            prefix = readReplicaIdentifiersPrefix;
        }
        if (_dBCluster.getDBClusterMembers() != null) {
            prefix = _prefix + "DBClusterMembers";
            java.util.List<DBClusterMember> dBClusterMembers = _dBCluster.getDBClusterMembers();
            int dBClusterMembersIndex = 1;
            String dBClusterMembersPrefix = prefix;
            for (DBClusterMember dBClusterMembersItem : dBClusterMembers) {
                prefix = dBClusterMembersPrefix + "." + dBClusterMembersIndex;
                if (dBClusterMembersItem != null) {
                    DBClusterMemberStaxMarshaller.getInstance().marshall(dBClusterMembersItem,
                            request, prefix + ".");
                }
                dBClusterMembersIndex++;
            }
            prefix = dBClusterMembersPrefix;
        }
        if (_dBCluster.getVpcSecurityGroups() != null) {
            prefix = _prefix + "VpcSecurityGroups";
            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups = _dBCluster
                    .getVpcSecurityGroups();
            int vpcSecurityGroupsIndex = 1;
            String vpcSecurityGroupsPrefix = prefix;
            for (VpcSecurityGroupMembership vpcSecurityGroupsItem : vpcSecurityGroups) {
                prefix = vpcSecurityGroupsPrefix + "." + vpcSecurityGroupsIndex;
                if (vpcSecurityGroupsItem != null) {
                    VpcSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            vpcSecurityGroupsItem, request, prefix + ".");
                }
                vpcSecurityGroupsIndex++;
            }
            prefix = vpcSecurityGroupsPrefix;
        }
        if (_dBCluster.getHostedZoneId() != null) {
            prefix = _prefix + "HostedZoneId";
            String hostedZoneId = _dBCluster.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (_dBCluster.getStorageEncrypted() != null) {
            prefix = _prefix + "StorageEncrypted";
            Boolean storageEncrypted = _dBCluster.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (_dBCluster.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _dBCluster.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_dBCluster.getDbClusterResourceId() != null) {
            prefix = _prefix + "DbClusterResourceId";
            String dbClusterResourceId = _dBCluster.getDbClusterResourceId();
            request.addParameter(prefix, StringUtils.fromString(dbClusterResourceId));
        }
        if (_dBCluster.getDBClusterArn() != null) {
            prefix = _prefix + "DBClusterArn";
            String dBClusterArn = _dBCluster.getDBClusterArn();
            request.addParameter(prefix, StringUtils.fromString(dBClusterArn));
        }
        if (_dBCluster.getAssociatedRoles() != null) {
            prefix = _prefix + "AssociatedRoles";
            java.util.List<DBClusterRole> associatedRoles = _dBCluster.getAssociatedRoles();
            int associatedRolesIndex = 1;
            String associatedRolesPrefix = prefix;
            for (DBClusterRole associatedRolesItem : associatedRoles) {
                prefix = associatedRolesPrefix + "." + associatedRolesIndex;
                if (associatedRolesItem != null) {
                    DBClusterRoleStaxMarshaller.getInstance().marshall(associatedRolesItem,
                            request, prefix + ".");
                }
                associatedRolesIndex++;
            }
            prefix = associatedRolesPrefix;
        }
        if (_dBCluster.getIAMDatabaseAuthenticationEnabled() != null) {
            prefix = _prefix + "IAMDatabaseAuthenticationEnabled";
            Boolean iAMDatabaseAuthenticationEnabled = _dBCluster
                    .getIAMDatabaseAuthenticationEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(iAMDatabaseAuthenticationEnabled));
        }
        if (_dBCluster.getCloneGroupId() != null) {
            prefix = _prefix + "CloneGroupId";
            String cloneGroupId = _dBCluster.getCloneGroupId();
            request.addParameter(prefix, StringUtils.fromString(cloneGroupId));
        }
        if (_dBCluster.getClusterCreateTime() != null) {
            prefix = _prefix + "ClusterCreateTime";
            java.util.Date clusterCreateTime = _dBCluster.getClusterCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(clusterCreateTime));
        }
        if (_dBCluster.getEarliestBacktrackTime() != null) {
            prefix = _prefix + "EarliestBacktrackTime";
            java.util.Date earliestBacktrackTime = _dBCluster.getEarliestBacktrackTime();
            request.addParameter(prefix, StringUtils.fromDate(earliestBacktrackTime));
        }
        if (_dBCluster.getBacktrackWindow() != null) {
            prefix = _prefix + "BacktrackWindow";
            Long backtrackWindow = _dBCluster.getBacktrackWindow();
            request.addParameter(prefix, StringUtils.fromLong(backtrackWindow));
        }
        if (_dBCluster.getBacktrackConsumedChangeRecords() != null) {
            prefix = _prefix + "BacktrackConsumedChangeRecords";
            Long backtrackConsumedChangeRecords = _dBCluster.getBacktrackConsumedChangeRecords();
            request.addParameter(prefix, StringUtils.fromLong(backtrackConsumedChangeRecords));
        }
        if (_dBCluster.getEnabledCloudwatchLogsExports() != null) {
            prefix = _prefix + "EnabledCloudwatchLogsExports";
            java.util.List<String> enabledCloudwatchLogsExports = _dBCluster
                    .getEnabledCloudwatchLogsExports();
            int enabledCloudwatchLogsExportsIndex = 1;
            String enabledCloudwatchLogsExportsPrefix = prefix;
            for (String enabledCloudwatchLogsExportsItem : enabledCloudwatchLogsExports) {
                prefix = enabledCloudwatchLogsExportsPrefix + ".member."
                        + enabledCloudwatchLogsExportsIndex;
                if (enabledCloudwatchLogsExportsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(enabledCloudwatchLogsExportsItem));
                }
                enabledCloudwatchLogsExportsIndex++;
            }
            prefix = enabledCloudwatchLogsExportsPrefix;
        }
        if (_dBCluster.getCapacity() != null) {
            prefix = _prefix + "Capacity";
            Integer capacity = _dBCluster.getCapacity();
            request.addParameter(prefix, StringUtils.fromInteger(capacity));
        }
        if (_dBCluster.getEngineMode() != null) {
            prefix = _prefix + "EngineMode";
            String engineMode = _dBCluster.getEngineMode();
            request.addParameter(prefix, StringUtils.fromString(engineMode));
        }
        if (_dBCluster.getScalingConfigurationInfo() != null) {
            prefix = _prefix + "ScalingConfigurationInfo";
            ScalingConfigurationInfo scalingConfigurationInfo = _dBCluster
                    .getScalingConfigurationInfo();
            ScalingConfigurationInfoStaxMarshaller.getInstance().marshall(scalingConfigurationInfo,
                    request, prefix + ".");
        }
        if (_dBCluster.getDeletionProtection() != null) {
            prefix = _prefix + "DeletionProtection";
            Boolean deletionProtection = _dBCluster.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (_dBCluster.getHttpEndpointEnabled() != null) {
            prefix = _prefix + "HttpEndpointEnabled";
            Boolean httpEndpointEnabled = _dBCluster.getHttpEndpointEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(httpEndpointEnabled));
        }
        if (_dBCluster.getActivityStreamMode() != null) {
            prefix = _prefix + "ActivityStreamMode";
            String activityStreamMode = _dBCluster.getActivityStreamMode();
            request.addParameter(prefix, StringUtils.fromString(activityStreamMode));
        }
        if (_dBCluster.getActivityStreamStatus() != null) {
            prefix = _prefix + "ActivityStreamStatus";
            String activityStreamStatus = _dBCluster.getActivityStreamStatus();
            request.addParameter(prefix, StringUtils.fromString(activityStreamStatus));
        }
        if (_dBCluster.getActivityStreamKmsKeyId() != null) {
            prefix = _prefix + "ActivityStreamKmsKeyId";
            String activityStreamKmsKeyId = _dBCluster.getActivityStreamKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(activityStreamKmsKeyId));
        }
        if (_dBCluster.getActivityStreamKinesisStreamName() != null) {
            prefix = _prefix + "ActivityStreamKinesisStreamName";
            String activityStreamKinesisStreamName = _dBCluster
                    .getActivityStreamKinesisStreamName();
            request.addParameter(prefix, StringUtils.fromString(activityStreamKinesisStreamName));
        }
        if (_dBCluster.getCopyTagsToSnapshot() != null) {
            prefix = _prefix + "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = _dBCluster.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (_dBCluster.getCrossAccountClone() != null) {
            prefix = _prefix + "CrossAccountClone";
            Boolean crossAccountClone = _dBCluster.getCrossAccountClone();
            request.addParameter(prefix, StringUtils.fromBoolean(crossAccountClone));
        }
        if (_dBCluster.getDomainMemberships() != null) {
            prefix = _prefix + "DomainMemberships";
            java.util.List<DomainMembership> domainMemberships = _dBCluster.getDomainMemberships();
            int domainMembershipsIndex = 1;
            String domainMembershipsPrefix = prefix;
            for (DomainMembership domainMembershipsItem : domainMemberships) {
                prefix = domainMembershipsPrefix + "." + domainMembershipsIndex;
                if (domainMembershipsItem != null) {
                    DomainMembershipStaxMarshaller.getInstance().marshall(domainMembershipsItem,
                            request, prefix + ".");
                }
                domainMembershipsIndex++;
            }
            prefix = domainMembershipsPrefix;
        }
        if (_dBCluster.getGlobalWriteForwardingStatus() != null) {
            prefix = _prefix + "GlobalWriteForwardingStatus";
            String globalWriteForwardingStatus = _dBCluster.getGlobalWriteForwardingStatus();
            request.addParameter(prefix, StringUtils.fromString(globalWriteForwardingStatus));
        }
        if (_dBCluster.getGlobalWriteForwardingRequested() != null) {
            prefix = _prefix + "GlobalWriteForwardingRequested";
            Boolean globalWriteForwardingRequested = _dBCluster.getGlobalWriteForwardingRequested();
            request.addParameter(prefix, StringUtils.fromBoolean(globalWriteForwardingRequested));
        }
    }

    private static DBClusterStaxMarshaller instance;

    public static DBClusterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBClusterStaxMarshaller();
        return instance;
    }
}
