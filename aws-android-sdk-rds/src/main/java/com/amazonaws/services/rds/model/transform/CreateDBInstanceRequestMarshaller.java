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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateDBInstanceRequest
 */
public class CreateDBInstanceRequestMarshaller implements
        Marshaller<Request<CreateDBInstanceRequest>, CreateDBInstanceRequest> {

    public Request<CreateDBInstanceRequest> marshall(CreateDBInstanceRequest createDBInstanceRequest) {
        if (createDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBInstanceRequest)");
        }

        Request<CreateDBInstanceRequest> request = new DefaultRequest<CreateDBInstanceRequest>(
                createDBInstanceRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBInstance");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBInstanceRequest.getDBName() != null) {
            prefix = "DBName";
            String dBName = createDBInstanceRequest.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (createDBInstanceRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = createDBInstanceRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (createDBInstanceRequest.getAllocatedStorage() != null) {
            prefix = "AllocatedStorage";
            Integer allocatedStorage = createDBInstanceRequest.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (createDBInstanceRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = createDBInstanceRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (createDBInstanceRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = createDBInstanceRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (createDBInstanceRequest.getMasterUsername() != null) {
            prefix = "MasterUsername";
            String masterUsername = createDBInstanceRequest.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (createDBInstanceRequest.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = createDBInstanceRequest.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (createDBInstanceRequest.getDBSecurityGroups() != null) {
            prefix = "DBSecurityGroups";
            java.util.List<String> dBSecurityGroups = createDBInstanceRequest.getDBSecurityGroups();
            int dBSecurityGroupsIndex = 1;
            String dBSecurityGroupsPrefix = prefix;
            for (String dBSecurityGroupsItem : dBSecurityGroups) {
                prefix = dBSecurityGroupsPrefix + "." + dBSecurityGroupsIndex;
                if (dBSecurityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(dBSecurityGroupsItem));
                }
                dBSecurityGroupsIndex++;
            }
            prefix = dBSecurityGroupsPrefix;
        }
        if (createDBInstanceRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = createDBInstanceRequest
                    .getVpcSecurityGroupIds();
            int vpcSecurityGroupIdsIndex = 1;
            String vpcSecurityGroupIdsPrefix = prefix;
            for (String vpcSecurityGroupIdsItem : vpcSecurityGroupIds) {
                prefix = vpcSecurityGroupIdsPrefix + "." + vpcSecurityGroupIdsIndex;
                if (vpcSecurityGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(vpcSecurityGroupIdsItem));
                }
                vpcSecurityGroupIdsIndex++;
            }
            prefix = vpcSecurityGroupIdsPrefix;
        }
        if (createDBInstanceRequest.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = createDBInstanceRequest.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (createDBInstanceRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = createDBInstanceRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (createDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = createDBInstanceRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (createDBInstanceRequest.getDBParameterGroupName() != null) {
            prefix = "DBParameterGroupName";
            String dBParameterGroupName = createDBInstanceRequest.getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (createDBInstanceRequest.getBackupRetentionPeriod() != null) {
            prefix = "BackupRetentionPeriod";
            Integer backupRetentionPeriod = createDBInstanceRequest.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (createDBInstanceRequest.getPreferredBackupWindow() != null) {
            prefix = "PreferredBackupWindow";
            String preferredBackupWindow = createDBInstanceRequest.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (createDBInstanceRequest.getPort() != null) {
            prefix = "Port";
            Integer port = createDBInstanceRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (createDBInstanceRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = createDBInstanceRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (createDBInstanceRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = createDBInstanceRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (createDBInstanceRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = createDBInstanceRequest.getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (createDBInstanceRequest.getLicenseModel() != null) {
            prefix = "LicenseModel";
            String licenseModel = createDBInstanceRequest.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (createDBInstanceRequest.getIops() != null) {
            prefix = "Iops";
            Integer iops = createDBInstanceRequest.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (createDBInstanceRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = createDBInstanceRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (createDBInstanceRequest.getCharacterSetName() != null) {
            prefix = "CharacterSetName";
            String characterSetName = createDBInstanceRequest.getCharacterSetName();
            request.addParameter(prefix, StringUtils.fromString(characterSetName));
        }
        if (createDBInstanceRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = createDBInstanceRequest.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (createDBInstanceRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBInstanceRequest.getTags();
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
        if (createDBInstanceRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = createDBInstanceRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (createDBInstanceRequest.getStorageType() != null) {
            prefix = "StorageType";
            String storageType = createDBInstanceRequest.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (createDBInstanceRequest.getTdeCredentialArn() != null) {
            prefix = "TdeCredentialArn";
            String tdeCredentialArn = createDBInstanceRequest.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (createDBInstanceRequest.getTdeCredentialPassword() != null) {
            prefix = "TdeCredentialPassword";
            String tdeCredentialPassword = createDBInstanceRequest.getTdeCredentialPassword();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialPassword));
        }
        if (createDBInstanceRequest.getStorageEncrypted() != null) {
            prefix = "StorageEncrypted";
            Boolean storageEncrypted = createDBInstanceRequest.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (createDBInstanceRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = createDBInstanceRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (createDBInstanceRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = createDBInstanceRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (createDBInstanceRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = createDBInstanceRequest.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (createDBInstanceRequest.getMonitoringInterval() != null) {
            prefix = "MonitoringInterval";
            Integer monitoringInterval = createDBInstanceRequest.getMonitoringInterval();
            request.addParameter(prefix, StringUtils.fromInteger(monitoringInterval));
        }
        if (createDBInstanceRequest.getMonitoringRoleArn() != null) {
            prefix = "MonitoringRoleArn";
            String monitoringRoleArn = createDBInstanceRequest.getMonitoringRoleArn();
            request.addParameter(prefix, StringUtils.fromString(monitoringRoleArn));
        }
        if (createDBInstanceRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = createDBInstanceRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }
        if (createDBInstanceRequest.getPromotionTier() != null) {
            prefix = "PromotionTier";
            Integer promotionTier = createDBInstanceRequest.getPromotionTier();
            request.addParameter(prefix, StringUtils.fromInteger(promotionTier));
        }
        if (createDBInstanceRequest.getTimezone() != null) {
            prefix = "Timezone";
            String timezone = createDBInstanceRequest.getTimezone();
            request.addParameter(prefix, StringUtils.fromString(timezone));
        }
        if (createDBInstanceRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = createDBInstanceRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (createDBInstanceRequest.getEnablePerformanceInsights() != null) {
            prefix = "EnablePerformanceInsights";
            Boolean enablePerformanceInsights = createDBInstanceRequest
                    .getEnablePerformanceInsights();
            request.addParameter(prefix, StringUtils.fromBoolean(enablePerformanceInsights));
        }
        if (createDBInstanceRequest.getPerformanceInsightsKMSKeyId() != null) {
            prefix = "PerformanceInsightsKMSKeyId";
            String performanceInsightsKMSKeyId = createDBInstanceRequest
                    .getPerformanceInsightsKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(performanceInsightsKMSKeyId));
        }
        if (createDBInstanceRequest.getPerformanceInsightsRetentionPeriod() != null) {
            prefix = "PerformanceInsightsRetentionPeriod";
            Integer performanceInsightsRetentionPeriod = createDBInstanceRequest
                    .getPerformanceInsightsRetentionPeriod();
            request.addParameter(prefix,
                    StringUtils.fromInteger(performanceInsightsRetentionPeriod));
        }
        if (createDBInstanceRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = createDBInstanceRequest
                    .getEnableCloudwatchLogsExports();
            int enableCloudwatchLogsExportsIndex = 1;
            String enableCloudwatchLogsExportsPrefix = prefix;
            for (String enableCloudwatchLogsExportsItem : enableCloudwatchLogsExports) {
                prefix = enableCloudwatchLogsExportsPrefix + ".member."
                        + enableCloudwatchLogsExportsIndex;
                if (enableCloudwatchLogsExportsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(enableCloudwatchLogsExportsItem));
                }
                enableCloudwatchLogsExportsIndex++;
            }
            prefix = enableCloudwatchLogsExportsPrefix;
        }
        if (createDBInstanceRequest.getProcessorFeatures() != null) {
            prefix = "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = createDBInstanceRequest
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
        if (createDBInstanceRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = createDBInstanceRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (createDBInstanceRequest.getMaxAllocatedStorage() != null) {
            prefix = "MaxAllocatedStorage";
            Integer maxAllocatedStorage = createDBInstanceRequest.getMaxAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(maxAllocatedStorage));
        }

        return request;
    }
}
