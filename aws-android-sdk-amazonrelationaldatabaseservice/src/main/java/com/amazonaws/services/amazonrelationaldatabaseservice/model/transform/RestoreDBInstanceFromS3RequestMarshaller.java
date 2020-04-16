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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for RestoreDBInstanceFromS3Request
 */
public class RestoreDBInstanceFromS3RequestMarshaller implements
        Marshaller<Request<RestoreDBInstanceFromS3Request>, RestoreDBInstanceFromS3Request> {

    public Request<RestoreDBInstanceFromS3Request> marshall(
            RestoreDBInstanceFromS3Request restoreDBInstanceFromS3Request) {
        if (restoreDBInstanceFromS3Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreDBInstanceFromS3Request)");
        }

        Request<RestoreDBInstanceFromS3Request> request = new DefaultRequest<RestoreDBInstanceFromS3Request>(
                restoreDBInstanceFromS3Request, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RestoreDBInstanceFromS3");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (restoreDBInstanceFromS3Request.getDBName() != null) {
            prefix = "DBName";
            String dBName = restoreDBInstanceFromS3Request.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (restoreDBInstanceFromS3Request.getDBInstanceIdentifier() != null) {
            prefix = "DBInstanceIdentifier";
            String dBInstanceIdentifier = restoreDBInstanceFromS3Request.getDBInstanceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceIdentifier));
        }
        if (restoreDBInstanceFromS3Request.getAllocatedStorage() != null) {
            prefix = "AllocatedStorage";
            Integer allocatedStorage = restoreDBInstanceFromS3Request.getAllocatedStorage();
            request.addParameter(prefix, StringUtils.fromInteger(allocatedStorage));
        }
        if (restoreDBInstanceFromS3Request.getDBInstanceClass() != null) {
            prefix = "DBInstanceClass";
            String dBInstanceClass = restoreDBInstanceFromS3Request.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (restoreDBInstanceFromS3Request.getEngine() != null) {
            prefix = "Engine";
            String engine = restoreDBInstanceFromS3Request.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (restoreDBInstanceFromS3Request.getMasterUsername() != null) {
            prefix = "MasterUsername";
            String masterUsername = restoreDBInstanceFromS3Request.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (restoreDBInstanceFromS3Request.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = restoreDBInstanceFromS3Request.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (restoreDBInstanceFromS3Request.getDBSecurityGroups() != null) {
            prefix = "DBSecurityGroups";
            java.util.List<String> dBSecurityGroups = restoreDBInstanceFromS3Request
                    .getDBSecurityGroups();
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
        if (restoreDBInstanceFromS3Request.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreDBInstanceFromS3Request
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
        if (restoreDBInstanceFromS3Request.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = restoreDBInstanceFromS3Request.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (restoreDBInstanceFromS3Request.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = restoreDBInstanceFromS3Request.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (restoreDBInstanceFromS3Request.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = restoreDBInstanceFromS3Request
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (restoreDBInstanceFromS3Request.getDBParameterGroupName() != null) {
            prefix = "DBParameterGroupName";
            String dBParameterGroupName = restoreDBInstanceFromS3Request.getDBParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupName));
        }
        if (restoreDBInstanceFromS3Request.getBackupRetentionPeriod() != null) {
            prefix = "BackupRetentionPeriod";
            Integer backupRetentionPeriod = restoreDBInstanceFromS3Request
                    .getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (restoreDBInstanceFromS3Request.getPreferredBackupWindow() != null) {
            prefix = "PreferredBackupWindow";
            String preferredBackupWindow = restoreDBInstanceFromS3Request
                    .getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (restoreDBInstanceFromS3Request.getPort() != null) {
            prefix = "Port";
            Integer port = restoreDBInstanceFromS3Request.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreDBInstanceFromS3Request.getMultiAZ() != null) {
            prefix = "MultiAZ";
            Boolean multiAZ = restoreDBInstanceFromS3Request.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (restoreDBInstanceFromS3Request.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = restoreDBInstanceFromS3Request.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (restoreDBInstanceFromS3Request.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = restoreDBInstanceFromS3Request
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (restoreDBInstanceFromS3Request.getLicenseModel() != null) {
            prefix = "LicenseModel";
            String licenseModel = restoreDBInstanceFromS3Request.getLicenseModel();
            request.addParameter(prefix, StringUtils.fromString(licenseModel));
        }
        if (restoreDBInstanceFromS3Request.getIops() != null) {
            prefix = "Iops";
            Integer iops = restoreDBInstanceFromS3Request.getIops();
            request.addParameter(prefix, StringUtils.fromInteger(iops));
        }
        if (restoreDBInstanceFromS3Request.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = restoreDBInstanceFromS3Request.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (restoreDBInstanceFromS3Request.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = restoreDBInstanceFromS3Request.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (restoreDBInstanceFromS3Request.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = restoreDBInstanceFromS3Request.getTags();
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
        if (restoreDBInstanceFromS3Request.getStorageType() != null) {
            prefix = "StorageType";
            String storageType = restoreDBInstanceFromS3Request.getStorageType();
            request.addParameter(prefix, StringUtils.fromString(storageType));
        }
        if (restoreDBInstanceFromS3Request.getStorageEncrypted() != null) {
            prefix = "StorageEncrypted";
            Boolean storageEncrypted = restoreDBInstanceFromS3Request.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (restoreDBInstanceFromS3Request.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = restoreDBInstanceFromS3Request.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (restoreDBInstanceFromS3Request.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = restoreDBInstanceFromS3Request.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (restoreDBInstanceFromS3Request.getMonitoringInterval() != null) {
            prefix = "MonitoringInterval";
            Integer monitoringInterval = restoreDBInstanceFromS3Request.getMonitoringInterval();
            request.addParameter(prefix, StringUtils.fromInteger(monitoringInterval));
        }
        if (restoreDBInstanceFromS3Request.getMonitoringRoleArn() != null) {
            prefix = "MonitoringRoleArn";
            String monitoringRoleArn = restoreDBInstanceFromS3Request.getMonitoringRoleArn();
            request.addParameter(prefix, StringUtils.fromString(monitoringRoleArn));
        }
        if (restoreDBInstanceFromS3Request.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = restoreDBInstanceFromS3Request
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (restoreDBInstanceFromS3Request.getSourceEngine() != null) {
            prefix = "SourceEngine";
            String sourceEngine = restoreDBInstanceFromS3Request.getSourceEngine();
            request.addParameter(prefix, StringUtils.fromString(sourceEngine));
        }
        if (restoreDBInstanceFromS3Request.getSourceEngineVersion() != null) {
            prefix = "SourceEngineVersion";
            String sourceEngineVersion = restoreDBInstanceFromS3Request.getSourceEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(sourceEngineVersion));
        }
        if (restoreDBInstanceFromS3Request.getS3BucketName() != null) {
            prefix = "S3BucketName";
            String s3BucketName = restoreDBInstanceFromS3Request.getS3BucketName();
            request.addParameter(prefix, StringUtils.fromString(s3BucketName));
        }
        if (restoreDBInstanceFromS3Request.getS3Prefix() != null) {
            prefix = "S3Prefix";
            String s3Prefix = restoreDBInstanceFromS3Request.getS3Prefix();
            request.addParameter(prefix, StringUtils.fromString(s3Prefix));
        }
        if (restoreDBInstanceFromS3Request.getS3IngestionRoleArn() != null) {
            prefix = "S3IngestionRoleArn";
            String s3IngestionRoleArn = restoreDBInstanceFromS3Request.getS3IngestionRoleArn();
            request.addParameter(prefix, StringUtils.fromString(s3IngestionRoleArn));
        }
        if (restoreDBInstanceFromS3Request.getEnablePerformanceInsights() != null) {
            prefix = "EnablePerformanceInsights";
            Boolean enablePerformanceInsights = restoreDBInstanceFromS3Request
                    .getEnablePerformanceInsights();
            request.addParameter(prefix, StringUtils.fromBoolean(enablePerformanceInsights));
        }
        if (restoreDBInstanceFromS3Request.getPerformanceInsightsKMSKeyId() != null) {
            prefix = "PerformanceInsightsKMSKeyId";
            String performanceInsightsKMSKeyId = restoreDBInstanceFromS3Request
                    .getPerformanceInsightsKMSKeyId();
            request.addParameter(prefix, StringUtils.fromString(performanceInsightsKMSKeyId));
        }
        if (restoreDBInstanceFromS3Request.getPerformanceInsightsRetentionPeriod() != null) {
            prefix = "PerformanceInsightsRetentionPeriod";
            Integer performanceInsightsRetentionPeriod = restoreDBInstanceFromS3Request
                    .getPerformanceInsightsRetentionPeriod();
            request.addParameter(prefix,
                    StringUtils.fromInteger(performanceInsightsRetentionPeriod));
        }
        if (restoreDBInstanceFromS3Request.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = restoreDBInstanceFromS3Request
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
        if (restoreDBInstanceFromS3Request.getProcessorFeatures() != null) {
            prefix = "ProcessorFeatures";
            java.util.List<ProcessorFeature> processorFeatures = restoreDBInstanceFromS3Request
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
        if (restoreDBInstanceFromS3Request.getUseDefaultProcessorFeatures() != null) {
            prefix = "UseDefaultProcessorFeatures";
            Boolean useDefaultProcessorFeatures = restoreDBInstanceFromS3Request
                    .getUseDefaultProcessorFeatures();
            request.addParameter(prefix, StringUtils.fromBoolean(useDefaultProcessorFeatures));
        }
        if (restoreDBInstanceFromS3Request.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = restoreDBInstanceFromS3Request.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }

        return request;
    }
}
