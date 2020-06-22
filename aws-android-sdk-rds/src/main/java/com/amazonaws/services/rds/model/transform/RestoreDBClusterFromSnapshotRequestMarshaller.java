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
 * StAX request marshaller for RestoreDBClusterFromSnapshotRequest
 */
public class RestoreDBClusterFromSnapshotRequestMarshaller
        implements
        Marshaller<Request<RestoreDBClusterFromSnapshotRequest>, RestoreDBClusterFromSnapshotRequest> {

    public Request<RestoreDBClusterFromSnapshotRequest> marshall(
            RestoreDBClusterFromSnapshotRequest restoreDBClusterFromSnapshotRequest) {
        if (restoreDBClusterFromSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreDBClusterFromSnapshotRequest)");
        }

        Request<RestoreDBClusterFromSnapshotRequest> request = new DefaultRequest<RestoreDBClusterFromSnapshotRequest>(
                restoreDBClusterFromSnapshotRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "RestoreDBClusterFromSnapshot");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (restoreDBClusterFromSnapshotRequest.getAvailabilityZones() != null) {
            prefix = "AvailabilityZones";
            java.util.List<String> availabilityZones = restoreDBClusterFromSnapshotRequest
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
        if (restoreDBClusterFromSnapshotRequest.getDBClusterIdentifier() != null) {
            prefix = "DBClusterIdentifier";
            String dBClusterIdentifier = restoreDBClusterFromSnapshotRequest
                    .getDBClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(dBClusterIdentifier));
        }
        if (restoreDBClusterFromSnapshotRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = restoreDBClusterFromSnapshotRequest.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (restoreDBClusterFromSnapshotRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = restoreDBClusterFromSnapshotRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (restoreDBClusterFromSnapshotRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = restoreDBClusterFromSnapshotRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (restoreDBClusterFromSnapshotRequest.getPort() != null) {
            prefix = "Port";
            Integer port = restoreDBClusterFromSnapshotRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreDBClusterFromSnapshotRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = restoreDBClusterFromSnapshotRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (restoreDBClusterFromSnapshotRequest.getDatabaseName() != null) {
            prefix = "DatabaseName";
            String databaseName = restoreDBClusterFromSnapshotRequest.getDatabaseName();
            request.addParameter(prefix, StringUtils.fromString(databaseName));
        }
        if (restoreDBClusterFromSnapshotRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = restoreDBClusterFromSnapshotRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (restoreDBClusterFromSnapshotRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreDBClusterFromSnapshotRequest
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
        if (restoreDBClusterFromSnapshotRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = restoreDBClusterFromSnapshotRequest.getTags();
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
        if (restoreDBClusterFromSnapshotRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = restoreDBClusterFromSnapshotRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (restoreDBClusterFromSnapshotRequest.getEnableIAMDatabaseAuthentication() != null) {
            prefix = "EnableIAMDatabaseAuthentication";
            Boolean enableIAMDatabaseAuthentication = restoreDBClusterFromSnapshotRequest
                    .getEnableIAMDatabaseAuthentication();
            request.addParameter(prefix, StringUtils.fromBoolean(enableIAMDatabaseAuthentication));
        }
        if (restoreDBClusterFromSnapshotRequest.getBacktrackWindow() != null) {
            prefix = "BacktrackWindow";
            Long backtrackWindow = restoreDBClusterFromSnapshotRequest.getBacktrackWindow();
            request.addParameter(prefix, StringUtils.fromLong(backtrackWindow));
        }
        if (restoreDBClusterFromSnapshotRequest.getEnableCloudwatchLogsExports() != null) {
            prefix = "EnableCloudwatchLogsExports";
            java.util.List<String> enableCloudwatchLogsExports = restoreDBClusterFromSnapshotRequest
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
        if (restoreDBClusterFromSnapshotRequest.getEngineMode() != null) {
            prefix = "EngineMode";
            String engineMode = restoreDBClusterFromSnapshotRequest.getEngineMode();
            request.addParameter(prefix, StringUtils.fromString(engineMode));
        }
        if (restoreDBClusterFromSnapshotRequest.getScalingConfiguration() != null) {
            prefix = "ScalingConfiguration";
            ScalingConfiguration scalingConfiguration = restoreDBClusterFromSnapshotRequest
                    .getScalingConfiguration();
            ScalingConfigurationStaxMarshaller.getInstance().marshall(scalingConfiguration,
                    request, prefix + ".");
        }
        if (restoreDBClusterFromSnapshotRequest.getDBClusterParameterGroupName() != null) {
            prefix = "DBClusterParameterGroupName";
            String dBClusterParameterGroupName = restoreDBClusterFromSnapshotRequest
                    .getDBClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBClusterParameterGroupName));
        }
        if (restoreDBClusterFromSnapshotRequest.getDeletionProtection() != null) {
            prefix = "DeletionProtection";
            Boolean deletionProtection = restoreDBClusterFromSnapshotRequest
                    .getDeletionProtection();
            request.addParameter(prefix, StringUtils.fromBoolean(deletionProtection));
        }
        if (restoreDBClusterFromSnapshotRequest.getCopyTagsToSnapshot() != null) {
            prefix = "CopyTagsToSnapshot";
            Boolean copyTagsToSnapshot = restoreDBClusterFromSnapshotRequest
                    .getCopyTagsToSnapshot();
            request.addParameter(prefix, StringUtils.fromBoolean(copyTagsToSnapshot));
        }
        if (restoreDBClusterFromSnapshotRequest.getDomain() != null) {
            prefix = "Domain";
            String domain = restoreDBClusterFromSnapshotRequest.getDomain();
            request.addParameter(prefix, StringUtils.fromString(domain));
        }
        if (restoreDBClusterFromSnapshotRequest.getDomainIAMRoleName() != null) {
            prefix = "DomainIAMRoleName";
            String domainIAMRoleName = restoreDBClusterFromSnapshotRequest.getDomainIAMRoleName();
            request.addParameter(prefix, StringUtils.fromString(domainIAMRoleName));
        }

        return request;
    }
}
