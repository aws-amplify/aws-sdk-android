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
 * StAX request marshaller for ModifyDBInstanceRequest
 */
public class ModifyDBInstanceRequestMarshaller implements
        Marshaller<Request<ModifyDBInstanceRequest>, ModifyDBInstanceRequest> {

    public Request<ModifyDBInstanceRequest> marshall(ModifyDBInstanceRequest modifyDBInstanceRequest) {
        if (modifyDBInstanceRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBInstanceRequest)");
        }

        Request<ModifyDBInstanceRequest> request = new DefaultRequest<ModifyDBInstanceRequest>(
                modifyDBInstanceRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBInstance");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBInstanceRequest.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = modifyDBInstanceRequest.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (modifyDBInstanceRequest.getAllocatedStorage() != null) {
            prefix = "AllocatedStorage";
            Integer allocatedStorage = modifyDBInstanceRequest.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (modifyDBInstanceRequest.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = modifyDBInstanceRequest.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (modifyDBInstanceRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = modifyDBInstanceRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (modifyDBInstanceRequest.getDBSecurityGroups() != null) {
            prefix = "DBSecurityGroups";
            java.util.List<String> dBSecurityGroups = modifyDBInstanceRequest.getDBSecurityGroups();
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
        if (modifyDBInstanceRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = modifyDBInstanceRequest
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
        if (modifyDBInstanceRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyDBInstanceRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }
        if (modifyDBInstanceRequest.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = modifyDBInstanceRequest.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (modifyDBInstanceRequest.getDBParameterGroupName() != null) {
            prefix = "DBParameterGroupName";
            String dBParameterGroupName = modifyDBInstanceRequest.getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (modifyDBInstanceRequest.getBackupRetentionPeriod() != null) {
            prefix = "BackupRetentionPeriod";
            Integer backupRetentionPeriod = modifyDBInstanceRequest.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (modifyDBInstanceRequest.getPreferredBackupWindow() != null) {
            prefix = "PreferredBackupWindow";
            String preferredBackupWindow = modifyDBInstanceRequest.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (modifyDBInstanceRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = modifyDBInstanceRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (modifyDBInstanceRequest.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = modifyDBInstanceRequest.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (modifyDBInstanceRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = modifyDBInstanceRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (modifyDBInstanceRequest.getAllowMajorVersionUpgrade() != null) {
            prefix = "AllowMajorVersionUpgrade";
            Boolean allowMajorVersionUpgrade = modifyDBInstanceRequest
                    .getAllowMajorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(allowMajorVersionUpgrade));
        }
        if (modifyDBInstanceRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = modifyDBInstanceRequest.getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (modifyDBInstanceRequest.getLicenseModel() != null) {
            prefix = "LicenseModel";
            String licenseModel = modifyDBInstanceRequest.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (modifyDBInstanceRequest.getIops() != null) {
            prefix = "Iops";
            Integer iops = modifyDBInstanceRequest.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (modifyDBInstanceRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = modifyDBInstanceRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (modifyDBInstanceRequest.getNewDBInstanceIdentifier() != null) {
            prefix = "NewDBInstanceIdentifier";
            String newDBInstanceIdentifier = modifyDBInstanceRequest.getNewDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(newDBInstanceIdentifier));
        }
        if (modifyDBInstanceRequest.getStorageType() != null) {
            prefix = "StorageType";
            String storageType = modifyDBInstanceRequest.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (modifyDBInstanceRequest.getTdeCredentialArn() != null) {
            prefix = "TdeCredentialArn";
            String tdeCredentialArn = modifyDBInstanceRequest.getTdeCredentialArn();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialArn));
        }
        if (modifyDBInstanceRequest.getTdeCredentialPassword() != null) {
            prefix = "TdeCredentialPassword";
            String tdeCredentialPassword = modifyDBInstanceRequest.getTdeCredentialPassword();
            request.addParameter(prefix, StringUtils.fromString(tdeCredentialPassword));
        }
        if (modifyDBInstanceRequest.getCACertificateIdentifier() != null) {
            prefix = "CACertificateIdentifier";
            String cACertificateIdentifier = modifyDBInstanceRequest.getCACertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(cACertificateIdentifier));
        }
        if (modifyDBInstanceRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = modifyDBInstanceRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (modifyDBInstanceRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = modifyDBInstanceRequest.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (modifyDBInstanceRequest.getMonitoringInterval() != null) {
            prefix = "MonitoringInterval";
            Integer monitoringInterval = modifyDBInstanceRequest.getMonitoringInterval();
            request.addParameter(prefix, StringUtils.fromInteger(monitoringInterval));
        }
        if (modifyDBInstanceRequest.getDBPortNumber() != null) {
            prefix = "DBPortNumber";
            Integer dBPortNumber = modifyDBInstanceRequest.getDBPortNumber();
            request.addParameter(prefix, StringUtils.fromInteger(dBPortNumber));
        }
        if (modifyDBInstanceRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = modifyDBInstanceRequest.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (modifyDBInstanceRequest.getMonitoringRoleArn() != null) {
            prefix = "MonitoringRoleArn";
            String monitoringRoleArn = modifyDBInstanceRequest.getMonitoringRoleArn();
            request.addParameter(prefix, StringUtils.fromString(monitoringRoleArn));
        }
        if (modifyDBInstanceRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = modifyDBInstanceRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }
        if (modifyDBInstanceRequest.getPromotionTier() != null) {
            prefix = "PromotionTier";
            Integer promotionTier = modifyDBInstanceRequest.getPromotionTier();
            request.addParameter(prefix, StringUtils.fromInteger(promotionTier));
        }
        if (modifyDBInstanceRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = modifyDBInstanceRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (modifyDBInstanceRequest.getEnablePerformanceInsights() != null) {
            prefix = "EnablePerformanceInsights";
            Boolean enablePerformanceInsights = modifyDBInstanceRequest
                    .getEnablePerformanceInsights();
            request.addParameter(prefix, StringUtils.fromBoolean(enablePerformanceInsights));
        }
        if (modifyDBInstanceRequest.getPerformanceInsightsKMSKeyId() != null) {
            prefix = "PerformanceInsightsKMSKeyId";
            String performanceInsightsKMSKeyId = modifyDBInstanceRequest
                    .getPerformanceInsightsKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(performanceInsightsKMSKeyId));
        }
        if (modifyDBInstanceRequest.getPerformanceInsightsRetentionPeriod() != null) {
            prefix = "PerformanceInsightsRetentionPeriod";
            Integer performanceInsightsRetentionPeriod = modifyDBInstanceRequest
                    .getPerformanceInsightsRetentionPeriod();
            request.addParameter(prefix,
                    StringUtils.fromInteger(performanceInsightsRetentionPeriod));
        }
        if (modifyDBInstanceRequest.getCloudwatchLogsExportConfiguration() != null) {
            prefix = "CloudwatchLogsExportConfiguration";
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration = modifyDBInstanceRequest
                    .getCloudwatchLogsExportConfiguration();
            CloudwatchLogsExportConfigurationStaxMarshaller.getInstance().marshall(
                    cloudwatchLogsExportConfiguration, request, prefix + ".");
        }
        if (modifyDBInstanceRequest.getProcessorFeatures() != null) {
            prefix = "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = modifyDBInstanceRequest
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
        if (modifyDBInstanceRequest.getUseDefaultProcessorFeatures() != null) {
            prefix = "UseDefaultProcessorFeatures";
            Boolean useDefaultProcessorFeatures = modifyDBInstanceRequest
                    .getUseDefaultProcessorFeatures();
            request.addParameter(prefix, StringUtils.fromBoolean(useDefaultProcessorFeatures));
        }
        if (modifyDBInstanceRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = modifyDBInstanceRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (modifyDBInstanceRequest.getMaxAllocatedStorage() != null) {
            prefix = "MaxAllocatedStorage";
            Integer maxAllocatedStorage = modifyDBInstanceRequest.getMaxAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(maxAllocatedStorage));
        }
        if (modifyDBInstanceRequest.getCertificateRotationRestart() != null) {
            prefix = "CertificateRotationRestart";
            Boolean certificateRotationRestart = modifyDBInstanceRequest
                    .getCertificateRotationRestart();
            request.addParameter(prefix, StringUtils.fromBoolean(certificateRotationRestart));
        }

        return request;
    }
}
