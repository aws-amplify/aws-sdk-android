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
 * StAX request marshaller for CreateDBClusterRequest
 */
public class CreateDBClusterRequestMarshaller implements
        Marshaller<Request<CreateDBClusterRequest>, CreateDBClusterRequest> {

    public Request<CreateDBClusterRequest> marshall(CreateDBClusterRequest createDBClusterRequest) {
        if (createDBClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateDBClusterRequest)");
        }

        Request<CreateDBClusterRequest> request = new DefaultRequest<CreateDBClusterRequest>(
                createDBClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateDBCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createDBClusterRequest.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = createDBClusterRequest
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
        if (createDBClusterRequest.getBackupRetentionPeriod() != null) {
            prefix = "BackupRetentionPeriod";
            Integer backupRetentionPeriod = createDBClusterRequest.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (createDBClusterRequest.getCharacterSetName() != null) {
            prefix = "CharacterSetName";
            String characterSetName = createDBClusterRequest.getCharacterSetName();
            request.addParameter(prefix, StringUtils.fromString(characterSetName));
        }
        if (createDBClusterRequest.getDatabaseName() != null) {
            prefix = "DatabaseName";
            String databaseName = createDBClusterRequest.getDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(databaseName));
        }
        if (createDBClusterRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = createDBClusterRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (createDBClusterRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = createDBClusterRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (createDBClusterRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = createDBClusterRequest
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
        if (createDBClusterRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = createDBClusterRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (createDBClusterRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = createDBClusterRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (createDBClusterRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = createDBClusterRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (createDBClusterRequest.getPort() != null) {
            prefix = "Port";
            Integer port = createDBClusterRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (createDBClusterRequest.getMasterUsername() != null) {
            prefix = "MasterUsername";
            String masterUsername = createDBClusterRequest.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (createDBClusterRequest.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = createDBClusterRequest.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (createDBClusterRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = createDBClusterRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (createDBClusterRequest.getPreferredBackupWindow() != null) {
            prefix = "PreferredBackupWindow";
            String preferredBackupWindow = createDBClusterRequest.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (createDBClusterRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = createDBClusterRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (createDBClusterRequest.getReplicationSourceIdentifier() != null) {
            prefix = "ReplicationSourceIdentifier";
            String replicationSourceIdentifier = createDBClusterRequest
                    .getReplicationSourceIdentifier();
            request.addParameter(prefix, StringUtils.fromString(replicationSourceIdentifier));
        }
        if (createDBClusterRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createDBClusterRequest.getTags();
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
        if (createDBClusterRequest.getStorageEncrypted() != null) {
            prefix = "StorageEncrypted";
            Boolean storageEncrypted = createDBClusterRequest.getStorageEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(storageEncrypted));
        }
        if (createDBClusterRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = createDBClusterRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (createDBClusterRequest.getPreSignedUrl() != null) {
            prefix = "PreSignedUrl";
            String preSignedUrl = createDBClusterRequest.getPreSignedUrl();
            request.addParameter(prefix, StringUtils.fromString(preSignedUrl));
        }
        if (createDBClusterRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = createDBClusterRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (createDBClusterRequest.getBacktrackWindow() != null) {
            prefix = "BacktrackWindow";
            Long backtrackWindow = createDBClusterRequest.getBacktrackWindow();
            request.addParameter(prefix, StringUtils.fromLong(backtrackWindow));
        }
        if (createDBClusterRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = createDBClusterRequest
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
        if (createDBClusterRequest.getEngineMode() != null) {
            prefix = "EngineMode";
            String engineMode = createDBClusterRequest.getEngineMode();
            request.addParameter(prefix, StringUtils.fromString(engineMode));
        }
        if (createDBClusterRequest.getScalingConfiguration() != null) {
            prefix = "ScalingConfiguration";
            ScalingConfiguration scalingConfiguration = createDBClusterRequest
                    .getScalingConfiguration();
            ScalingConfigurationStaxMarshaller.getInstance().marshall(scalingConfiguration,
                    request, prefix + ".");
        }
        if (createDBClusterRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = createDBClusterRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (createDBClusterRequest.getGlobalClusterIdentifier() != null) {
            prefix = "GlobalClusterIdentifier";
            String globalClusterIdentifier = createDBClusterRequest.getGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(globalClusterIdentifier));
        }
        if (createDBClusterRequest.getEnableHttpEndpoint() != null) {
            prefix = "EnableHttpEndpoint";
            Boolean enableHttpEndpoint = createDBClusterRequest.getEnableHttpEndpoint();
            request.addParameter(prefix, StringUtils.fromBoolean(enableHttpEndpoint));
        }
        if (createDBClusterRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = createDBClusterRequest.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (createDBClusterRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = createDBClusterRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (createDBClusterRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = createDBClusterRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }
        if (createDBClusterRequest.getEnableGlobalWriteForwarding() != null) {
            prefix = "EnableGlobalWriteForwarding";
            Boolean enableGlobalWriteForwarding = createDBClusterRequest
                    .getEnableGlobalWriteForwarding();
            request.addParameter(prefix, StringUtils.fromBoolean(enableGlobalWriteForwarding));
        }

        return request;
    }
}
