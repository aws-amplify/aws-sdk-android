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
 * StAX marshaller for POJO DBInstance
 */
class DBInstanceStaxMarshaller {

    public void marshall(DBInstance _dBInstance, Request<?> request, String _prefix) {
        String prefix;
        if (_dBInstance.getDBInstanceIdentifier() != null) {
            prefix = _prefix + "DBInstanceIdentifier";
            String dBInstanceIdentifier = _dBInstance.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (_dBInstance.getDBInstanceClass() != null) {
            prefix = _prefix + "DBInstanceClass";
            String dBInstanceClass = _dBInstance.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (_dBInstance.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _dBInstance.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_dBInstance.getDBInstanceStatus() != null) {
            prefix = _prefix + "DBInstanceStatus";
            String dBInstanceStatus = _dBInstance.getDBInstanceStatus();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceStatus));
        }
        if (_dBInstance.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _dBInstance.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_dBInstance.getDBName() != null) {
            prefix = _prefix + "DBName";
            String dBName = _dBInstance.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (_dBInstance.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            Endpoint endpoint = _dBInstance.getEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(endpoint, request, prefix + ".");
        }
        if (_dBInstance.getAllocatedStorage() != null) {
            prefix = _prefix + "AllocatedStorage";
            Integer allocatedStorage = _dBInstance.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (_dBInstance.getInstanceCreateTime() != null) {
            prefix = _prefix + "InstanceCreateTime";
            java.util.Date instanceCreateTime = _dBInstance.getInstanceCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(instanceCreateTime));
        }
        if (_dBInstance.getPreferredBackupWindow() != null) {
            prefix = _prefix + "PreferredBackupWindow";
            String preferredBackupWindow = _dBInstance.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (_dBInstance.getBackupRetentionPeriod() != null) {
            prefix = _prefix + "BackupRetentionPeriod";
            Integer backupRetentionPeriod = _dBInstance.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (_dBInstance.getDBSecurityGroups() != null) {
            prefix = _prefix + "DBSecurityGroups";
            java.util.List<DBSecurityGroupMembership> dBSecurityGroups = _dBInstance
                    .getDBSecurityGroups();
            int dBSecurityGroupsIndex = 1;
            String dBSecurityGroupsPrefix = prefix;
            for (DBSecurityGroupMembership dBSecurityGroupsItem : dBSecurityGroups) {
                prefix = dBSecurityGroupsPrefix + "." + dBSecurityGroupsIndex;
                if (dBSecurityGroupsItem != null) {
                    DBSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            dBSecurityGroupsItem, request, prefix + ".");
                }
                dBSecurityGroupsIndex++;
            }
            prefix = dBSecurityGroupsPrefix;
        }
        if (_dBInstance.getVpcSecurityGroups() != null) {
            prefix = _prefix + "VpcSecurityGroups";
            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups = _dBInstance
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
        if (_dBInstance.getDBParameterGroups() != null) {
            prefix = _prefix + "DBParameterGroups";
            java.util.List<DBParameterGroupStatus> dBParameterGroups = _dBInstance
                    .getDBParameterGroups();
            int dBParameterGroupsIndex = 1;
            String dBParameterGroupsPrefix = prefix;
            for (DBParameterGroupStatus dBParameterGroupsItem : dBParameterGroups) {
                prefix = dBParameterGroupsPrefix + "." + dBParameterGroupsIndex;
                if (dBParameterGroupsItem != null) {
                    DBParameterGroupStatusStaxMarshaller.getInstance().marshall(
                            dBParameterGroupsItem, request, prefix + ".");
                }
                dBParameterGroupsIndex++;
            }
            prefix = dBParameterGroupsPrefix;
        }
        if (_dBInstance.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _dBInstance.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_dBInstance.getDBSubnetGroup() != null) {
            prefix = _prefix + "DBSubnetGroup";
            DBSubnetGroup dBSubnetGroup = _dBInstance.getDBSubnetGroup();
            DBSubnetGroupStaxMarshaller.getInstance()
                    .marshall(dBSubnetGroup, request, prefix + ".");
        }
        if (_dBInstance.getPreferredMaintenanceWindow() != null) {
            prefix = _prefix + "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = _dBInstance.getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (_dBInstance.getPendingModifiedValues() != null) {
            prefix = _prefix + "PendingModifiedValues";
            PendingModifiedValues pendingModifiedValues = _dBInstance.getPendingModifiedValues();
            PendingModifiedValuesStaxMarshaller.getInstance().marshall(pendingModifiedValues,
                    request, prefix + ".");
        }
        if (_dBInstance.getLatestRestorableTime() != null) {
            prefix = _prefix + "LatestRestorableTime";
            java.util.Date latestRestorableTime = _dBInstance.getLatestRestorableTime();
            request.addParameter(prefix, StringUtils.fromDate(latestRestorableTime));
        }
        if (_dBInstance.getMultiAZ() != null) {
            prefix = _prefix + "MultiAZ";
            Boolean multiAZ = _dBInstance.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (_dBInstance.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _dBInstance.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_dBInstance.getAutoMinorVersionUpgrade() != null) {
            prefix = _prefix + "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = _dBInstance.getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (_dBInstance.getReadReplicaSourceDBInstanceIdentifier() != null) {
            prefix = _prefix + "ReadReplicaSourceDBInstanceIdentifier";
            String readReplicaSourceDBInstanceIdentifier = _dBInstance
                    .getReadReplicaSourceDBInstanceIdentifier();
            request.addParameter(prefix,
                    StringUtils.fromString(readReplicaSourceDBInstanceIdentifier));
        }
        if (_dBInstance.getReadReplicaDBInstanceIdentifiers() != null) {
            prefix = _prefix + "ReadReplicaDBInstanceIdentifiers";
            java.util.List<String> readReplicaDBInstanceIdentifiers = _dBInstance
                    .getReadReplicaDBInstanceIdentifiers();
            int readReplicaDBInstanceIdentifiersIndex = 1;
            String readReplicaDBInstanceIdentifiersPrefix = prefix;
            for (String readReplicaDBInstanceIdentifiersItem : readReplicaDBInstanceIdentifiers) {
                prefix = readReplicaDBInstanceIdentifiersPrefix + "."
                        + readReplicaDBInstanceIdentifiersIndex;
                if (readReplicaDBInstanceIdentifiersItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(readReplicaDBInstanceIdentifiersItem));
                }
                readReplicaDBInstanceIdentifiersIndex++;
            }
            prefix = readReplicaDBInstanceIdentifiersPrefix;
        }
        if (_dBInstance.getReadReplicaDBClusterIdentifiers() != null) {
            prefix = _prefix + "ReadReplicaDBClusterIdentifiers";
            java.util.List<String> readReplicaDBClusterIdentifiers = _dBInstance
                    .getReadReplicaDBClusterIdentifiers();
            int readReplicaDBClusterIdentifiersIndex = 1;
            String readReplicaDBClusterIdentifiersPrefix = prefix;
            for (String readReplicaDBClusterIdentifiersItem : readReplicaDBClusterIdentifiers) {
                prefix = readReplicaDBClusterIdentifiersPrefix + "."
                        + readReplicaDBClusterIdentifiersIndex;
                if (readReplicaDBClusterIdentifiersItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(readReplicaDBClusterIdentifiersItem));
                }
                readReplicaDBClusterIdentifiersIndex++;
            }
            prefix = readReplicaDBClusterIdentifiersPrefix;
        }
        if (_dBInstance.getLicenseModel() != null) {
            prefix = _prefix + "LicenseModel";
            String licenseModel = _dBInstance.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (_dBInstance.getIops() != null) {
            prefix = _prefix + "Iops";
            Integer iops = _dBInstance.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (_dBInstance.getOptionGroupMemberships() != null) {
            prefix = _prefix + "OptionGroupMemberships";
            java.util.List<OptionGroupMembership> optionGroupMemberships = _dBInstance
                    .getOptionGroupMemberships();
            int optionGroupMembershipsIndex = 1;
            String optionGroupMembershipsPrefix = prefix;
            for (OptionGroupMembership optionGroupMembershipsItem : optionGroupMemberships) {
                prefix = optionGroupMembershipsPrefix + "." + optionGroupMembershipsIndex;
                if (optionGroupMembershipsItem != null) {
                    OptionGroupMembershipStaxMarshaller.getInstance().marshall(
                            optionGroupMembershipsItem, request, prefix + ".");
                }
                optionGroupMembershipsIndex++;
            }
            prefix = optionGroupMembershipsPrefix;
        }
        if (_dBInstance.getCharacterSetName() != null) {
            prefix = _prefix + "CharacterSetName";
            String characterSetName = _dBInstance.getCharacterSetName();
            request.addParameter(prefix, StringUtils.fromString(characterSetName));
        }
        if (_dBInstance.getSecondaryAvailabilityZone() != null) {
            prefix = _prefix + "SecondaryAvailabilityZone";
            String secondaryAvailabilityZone = _dBInstance.getSecondaryAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(secondaryAvailabilityZone));
        }
        if (_dBInstance.getPubliclyAccessible() != null) {
            prefix = _prefix + "PubliclyAccessible";
            Boolean publiclyAccessible = _dBInstance.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (_dBInstance.getStatusInfos() != null) {
            prefix = _prefix + "StatusInfos";
            java.util.List<DBInstanceStatusInfo> statusInfos = _dBInstance.getStatusInfos();
            int statusInfosIndex = 1;
            String statusInfosPrefix = prefix;
            for (DBInstanceStatusInfo statusInfosItem : statusInfos) {
                prefix = statusInfosPrefix + "." + statusInfosIndex;
                if (statusInfosItem != null) {
                    DBInstanceStatusInfoStaxMarshaller.getInstance().marshall(statusInfosItem,
                            request, prefix + ".");
                }
                statusInfosIndex++;
            }
            prefix = statusInfosPrefix;
        }
        if (_dBInstance.getStorageType() != null) {
            prefix = _prefix + "StorageType";
            String storageType = _dBInstance.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (_dBInstance.getTdeCredentialArn() != null) {
            prefix = _prefix + "TdeCredentialArn";
            String tdeCredentialArn = _dBInstance.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (_dBInstance.getDbInstancePort() != null) {
            prefix = _prefix + "DbInstancePort";
            Integer dbInstancePort = _dBInstance.getDbInstancePort();
            request.addParameter(prefix, StringUtils.fromInteger(dbInstancePort));
        }
        if (_dBInstance.getDBClusterIdentifier() != null) {
            prefix = _prefix + "DBClusterIdentifier";
            String dBClusterIdentifier = _dBInstance.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (_dBInstance.getStorageEncrypted() != null) {
            prefix = _prefix + "StorageEncrypted";
            Boolean storageEncrypted = _dBInstance.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (_dBInstance.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _dBInstance.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_dBInstance.getDbiResourceId() != null) {
            prefix = _prefix + "DbiResourceId";
            String dbiResourceId = _dBInstance.getDbiResourceId();
            request.addParameter(prefix, StringUtils.fromString(dbiResourceId));
        }
        if (_dBInstance.getCACertificateIdentifier() != null) {
            prefix = _prefix + "CACertificateIdentifier";
            String cACertificateIdentifier = _dBInstance.getCACertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(cACertificateIdentifier));
        }
        if (_dBInstance.getDomainMemberships() != null) {
            prefix = _prefix + "DomainMemberships";
            java.util.List<DomainMembership> domainMemberships = _dBInstance.getDomainMemberships();
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
        if (_dBInstance.getCopyTagsToSnapshot() != null) {
            prefix = _prefix + "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = _dBInstance.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (_dBInstance.getMonitoringInterval() != null) {
            prefix = _prefix + "MonitoringInterval";
            Integer monitoringInterval = _dBInstance.getMonitoringInterval();
            request.addParameter(prefix, StringUtils.fromInteger(monitoringInterval));
        }
        if (_dBInstance.getEnhancedMonitoringResourceArn() != null) {
            prefix = _prefix + "EnhancedMonitoringResourceArn";
            String enhancedMonitoringResourceArn = _dBInstance.getEnhancedMonitoringResourceArn();
            request.addParameter(prefix, StringUtils.fromString(enhancedMonitoringResourceArn));
        }
        if (_dBInstance.getMonitoringRoleArn() != null) {
            prefix = _prefix + "MonitoringRoleArn";
            String monitoringRoleArn = _dBInstance.getMonitoringRoleArn();
            request.addParameter(prefix, StringUtils.fromString(monitoringRoleArn));
        }
        if (_dBInstance.getPromotionTier() != null) {
            prefix = _prefix + "PromotionTier";
            Integer promotionTier = _dBInstance.getPromotionTier();
            request.addParameter(prefix, StringUtils.fromInteger(promotionTier));
        }
        if (_dBInstance.getDBInstanceArn() != null) {
            prefix = _prefix + "DBInstanceArn";
            String dBInstanceArn = _dBInstance.getDBInstanceArn();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceArn));
        }
        if (_dBInstance.getTimezone() != null) {
            prefix = _prefix + "Timezone";
            String timezone = _dBInstance.getTimezone();
            request.addParameter(prefix, StringUtils.fromString(timezone));
        }
        if (_dBInstance.getIAMDatabaseAuthenticationEnabled() != null) {
            prefix = _prefix + "IAMDatabaseAuthenticationEnabled";
            Boolean iAMDatabaseAuthenticationEnabled = _dBInstance
                    .getIAMDatabaseAuthenticationEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(iAMDatabaseAuthenticationEnabled));
        }
        if (_dBInstance.getPerformanceInsightsEnabled() != null) {
            prefix = _prefix + "PerformanceInsightsEnabled";
            Boolean performanceInsightsEnabled = _dBInstance.getPerformanceInsightsEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(performanceInsightsEnabled));
        }
        if (_dBInstance.getPerformanceInsightsKMSKeyId() != null) {
            prefix = _prefix + "PerformanceInsightsKMSKeyId";
            String performanceInsightsKMSKeyId = _dBInstance.getPerformanceInsightsKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(performanceInsightsKMSKeyId));
        }
        if (_dBInstance.getPerformanceInsightsRetentionPeriod() != null) {
            prefix = _prefix + "PerformanceInsightsRetentionPeriod";
            Integer performanceInsightsRetentionPeriod = _dBInstance
                    .getPerformanceInsightsRetentionPeriod();
            request.addParameter(prefix,
                    StringUtils.fromInteger(performanceInsightsRetentionPeriod));
        }
        if (_dBInstance.getEnabledCloudwatchLogsExports() != null) {
            prefix = _prefix + "EnabledCloudwatchLogsExports";
            java.util.List<String> enabledCloudwatchLogsExports = _dBInstance
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
        if (_dBInstance.getProcessorFeatures() != null) {
            prefix = _prefix + "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = _dBInstance.getProcessorFeatures();
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
        if (_dBInstance.getDeletionProtection() != null) {
            prefix = _prefix + "DeletionProtection";
            Boolean deletionProtection = _dBInstance.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (_dBInstance.getAssociatedRoles() != null) {
            prefix = _prefix + "AssociatedRoles";
            java.util.List<DBInstanceRole> associatedRoles = _dBInstance.getAssociatedRoles();
            int associatedRolesIndex = 1;
            String associatedRolesPrefix = prefix;
            for (DBInstanceRole associatedRolesItem : associatedRoles) {
                prefix = associatedRolesPrefix + "." + associatedRolesIndex;
                if (associatedRolesItem != null) {
                    DBInstanceRoleStaxMarshaller.getInstance().marshall(associatedRolesItem,
                            request, prefix + ".");
                }
                associatedRolesIndex++;
            }
            prefix = associatedRolesPrefix;
        }
        if (_dBInstance.getListenerEndpoint() != null) {
            prefix = _prefix + "ListenerEndpoint";
            Endpoint listenerEndpoint = _dBInstance.getListenerEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(listenerEndpoint, request, prefix + ".");
        }
        if (_dBInstance.getMaxAllocatedStorage() != null) {
            prefix = _prefix + "MaxAllocatedStorage";
            Integer maxAllocatedStorage = _dBInstance.getMaxAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(maxAllocatedStorage));
        }
    }

    private static DBInstanceStaxMarshaller instance;

    public static DBInstanceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DBInstanceStaxMarshaller();
        return instance;
    }
}
