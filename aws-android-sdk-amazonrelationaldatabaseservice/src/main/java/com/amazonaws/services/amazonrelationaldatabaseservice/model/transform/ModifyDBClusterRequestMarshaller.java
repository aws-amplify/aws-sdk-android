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
 * StAX request marshaller for ModifyDBClusterRequest
 */
public class ModifyDBClusterRequestMarshaller implements
        Marshaller<Request<ModifyDBClusterRequest>, ModifyDBClusterRequest> {

    public Request<ModifyDBClusterRequest> marshall(ModifyDBClusterRequest modifyDBClusterRequest) {
        if (modifyDBClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyDBClusterRequest)");
        }

        Request<ModifyDBClusterRequest> request = new DefaultRequest<ModifyDBClusterRequest>(
                modifyDBClusterRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "ModifyDBCluster");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (modifyDBClusterRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = modifyDBClusterRequest.getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (modifyDBClusterRequest.getNewDBClusterIdentifier() != null) {
            prefix = "NewDBClusterIdentifier";
            String newDBClusterIdentifier = modifyDBClusterRequest.getNewDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(newDBClusterIdentifier));
        }
        if (modifyDBClusterRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyDBClusterRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }
        if (modifyDBClusterRequest.getBackupRetentionPeriod() != null) {
            prefix = "BackupRetentionPeriod";
            Integer backupRetentionPeriod = modifyDBClusterRequest.getBackupRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(backupRetentionPeriod));
        }
        if (modifyDBClusterRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = modifyDBClusterRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (modifyDBClusterRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = modifyDBClusterRequest
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
        if (modifyDBClusterRequest.getPort() != null) {
            prefix = "Port";
            Integer port = modifyDBClusterRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (modifyDBClusterRequest.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = modifyDBClusterRequest.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (modifyDBClusterRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = modifyDBClusterRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (modifyDBClusterRequest.getPreferredBackupWindow() != null) {
            prefix = "PreferredBackupWindow";
            String preferredBackupWindow = modifyDBClusterRequest.getPreferredBackupWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredBackupWindow));
        }
        if (modifyDBClusterRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = modifyDBClusterRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (modifyDBClusterRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = modifyDBClusterRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (modifyDBClusterRequest.getBacktrackWindow() != null) {
            prefix = "BacktrackWindow";
            Long backtrackWindow = modifyDBClusterRequest.getBacktrackWindow();
            request.addParameter(prefix, StringUtils.fromLong(backtrackWindow));
        }
        if (modifyDBClusterRequest.getCloudwatchLogsExportConfiguration() != null) {
            prefix = "CloudwatchLogsExportConfiguration";
            CloudwatchLogsExportConfiguration cloudwatchLogsExportConfiguration = modifyDBClusterRequest
                    .getCloudwatchLogsExportConfiguration();
            CloudwatchLogsExportConfigurationStaxMarshaller.getInstance().marshall(
                    cloudwatchLogsExportConfiguration, request, prefix + ".");
        }
        if (modifyDBClusterRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = modifyDBClusterRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (modifyDBClusterRequest.getAllowMajorVersionUpgrade() != null) {
            prefix = "AllowMajorVersionUpgrade";
            Boolean allowMajorVersionUpgrade = modifyDBClusterRequest.getAllowMajorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(allowMajorVersionUpgrade));
        }
        if (modifyDBClusterRequest.getDBInstanceParameterGroupName() != null) {
            prefix = "DBInstanceParameterGroupName";
            String dBInstanceParameterGroupName = modifyDBClusterRequest
                    .getDBInstanceParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceParameterGroupName));
        }
        if (modifyDBClusterRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = modifyDBClusterRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (modifyDBClusterRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = modifyDBClusterRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }
        if (modifyDBClusterRequest.getScalingConfiguration() != null) {
            prefix = "ScalingConfiguration";
            ScalingConfiguration scalingConfiguration = modifyDBClusterRequest
                    .getScalingConfiguration();
            ScalingConfigurationStaxMarshaller.getInstance().marshall(scalingConfiguration,
                    request, prefix + ".");
        }
        if (modifyDBClusterRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = modifyDBClusterRequest.getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (modifyDBClusterRequest.getEnableHttpEndpoint() != null) {
            prefix = "EnableHttpEndpoint";
            Boolean enableHttpEndpoint = modifyDBClusterRequest.getEnableHttpEndpoint();
            request.addParameter(prefix, StringUtils.fromBoolean(enableHttpEndpoint));
        }
        if (modifyDBClusterRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = modifyDBClusterRequest.getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }

        return request;
    }
}
