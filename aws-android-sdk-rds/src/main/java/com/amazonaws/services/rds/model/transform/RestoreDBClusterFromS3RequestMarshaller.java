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
 * StAX request marshaller for RestoreDBClusterFromS3Request
 */
public class RestoreDBClusterFromS3RequestMarshaller implements
        Marshaller<Request<RestoreDBClusterFromS3Request>, RestoreDBClusterFromS3Request> {

    public Request<RestoreDBClusterFromS3Request> marshall(
            RestoreDBClusterFromS3Request restoreDBClusterFromS3Request) {
        if (restoreDBClusterFromS3Request == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreDBClusterFromS3Request)");
        }

        Request<RestoreDBClusterFromS3Request> request = new DefaultRequest<RestoreDBClusterFromS3Request>(
                restoreDBClusterFromS3Request, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RestoreDBClusterFromS3");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (restoreDBClusterFromS3Request.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = restoreDBClusterFromS3Request
                    .getAvailabilityZones();
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
        if (restoreDBClusterFromS3Request.getBackupRetentionPeriod() != null) {
            prefix = "BackupRetentionPeriod";
            Integer backupRetentionPeriod = restoreDBClusterFromS3Request
                    .getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (restoreDBClusterFromS3Request.getCharacterSetName() != null) {
            prefix = "CharacterSetName";
            String characterSetName = restoreDBClusterFromS3Request.getCharacterSetName();
            request.addParameter(prefix, StringUtils.fromString(characterSetName));
        }
        if (restoreDBClusterFromS3Request.getDatabaseName() != null) {
            prefix = "DatabaseName";
            String databaseName = restoreDBClusterFromS3Request.getDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(databaseName));
        }
        if (restoreDBClusterFromS3Request.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = restoreDBClusterFromS3Request.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (restoreDBClusterFromS3Request.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = restoreDBClusterFromS3Request
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (restoreDBClusterFromS3Request.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreDBClusterFromS3Request
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
        if (restoreDBClusterFromS3Request.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = restoreDBClusterFromS3Request.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (restoreDBClusterFromS3Request.getEngine() != null) {
            prefix = "Engine";
            String engine = restoreDBClusterFromS3Request.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (restoreDBClusterFromS3Request.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = restoreDBClusterFromS3Request.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (restoreDBClusterFromS3Request.getPort() != null) {
            prefix = "Port";
            Integer port = restoreDBClusterFromS3Request.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreDBClusterFromS3Request.getMasterUsername() != null) {
            prefix = "MasterUsername";
            String masterUsername = restoreDBClusterFromS3Request.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (restoreDBClusterFromS3Request.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = restoreDBClusterFromS3Request.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (restoreDBClusterFromS3Request.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = restoreDBClusterFromS3Request.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (restoreDBClusterFromS3Request.getPreferredBackupWindow() != null) {
            prefix = "PreferredBackupWindow";
            String preferredBackupWindow = restoreDBClusterFromS3Request.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (restoreDBClusterFromS3Request.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = restoreDBClusterFromS3Request
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (restoreDBClusterFromS3Request.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = restoreDBClusterFromS3Request.getTags();
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
        if (restoreDBClusterFromS3Request.getStorageEncrypted() != null) {
            prefix = "StorageEncrypted";
            Boolean storageEncrypted = restoreDBClusterFromS3Request.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (restoreDBClusterFromS3Request.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = restoreDBClusterFromS3Request.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (restoreDBClusterFromS3Request.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = restoreDBClusterFromS3Request
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (restoreDBClusterFromS3Request.getSourceEngine() != null) {
            prefix = "SourceEngine";
            String sourceEngine = restoreDBClusterFromS3Request.getSourceEngine();
            request.addParameter(prefix, StringUtils.fromString(sourceEngine));
        }
        if (restoreDBClusterFromS3Request.getSourceEngineVersion() != null) {
            prefix = "SourceEngineVersion";
            String sourceEngineVersion = restoreDBClusterFromS3Request.getSourceEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(sourceEngineVersion));
        }
        if (restoreDBClusterFromS3Request.getS3BucketName() != null) {
            prefix = "S3BucketName";
            String s3BucketName = restoreDBClusterFromS3Request.getS3BucketName();
            request.addParameter(prefix, StringUtils.fromString(s3BucketName));
        }
        if (restoreDBClusterFromS3Request.getS3Prefix() != null) {
            prefix = "S3Prefix";
            String s3Prefix = restoreDBClusterFromS3Request.getS3Prefix();
            request.addParameter(prefix, StringUtils.fromString(s3Prefix));
        }
        if (restoreDBClusterFromS3Request.getS3IngestionRoleArn() != null) {
            prefix = "S3IngestionRoleArn";
            String s3IngestionRoleArn = restoreDBClusterFromS3Request.getS3IngestionRoleArn();
            request.addParameter(prefix, StringUtils.fromString(s3IngestionRoleArn));
        }
        if (restoreDBClusterFromS3Request.getBacktrackWindow() != null) {
            prefix = "BacktrackWindow";
            Long backtrackWindow = restoreDBClusterFromS3Request.getBacktrackWindow();
            request.addParameter(prefix, StringUtils.fromLong(backtrackWindow));
        }
        if (restoreDBClusterFromS3Request.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = restoreDBClusterFromS3Request
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
        if (restoreDBClusterFromS3Request.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = restoreDBClusterFromS3Request.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (restoreDBClusterFromS3Request.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = restoreDBClusterFromS3Request.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (restoreDBClusterFromS3Request.getDomain() != null) {
            prefix = "Domain";
            String domain = restoreDBClusterFromS3Request.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (restoreDBClusterFromS3Request.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = restoreDBClusterFromS3Request.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }

        return request;
    }
}
