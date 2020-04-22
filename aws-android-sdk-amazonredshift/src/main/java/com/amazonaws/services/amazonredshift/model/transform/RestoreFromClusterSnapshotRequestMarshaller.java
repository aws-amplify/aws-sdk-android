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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for RestoreFromClusterSnapshotRequest
 */
public class RestoreFromClusterSnapshotRequestMarshaller implements
        Marshaller<Request<RestoreFromClusterSnapshotRequest>, RestoreFromClusterSnapshotRequest> {

    public Request<RestoreFromClusterSnapshotRequest> marshall(
            RestoreFromClusterSnapshotRequest restoreFromClusterSnapshotRequest) {
        if (restoreFromClusterSnapshotRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(RestoreFromClusterSnapshotRequest)");
        }

        Request<RestoreFromClusterSnapshotRequest> request = new DefaultRequest<RestoreFromClusterSnapshotRequest>(
                restoreFromClusterSnapshotRequest, "AmazonRedshift");
        request.addParameter("Action", "RestoreFromClusterSnapshot");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (restoreFromClusterSnapshotRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = restoreFromClusterSnapshotRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (restoreFromClusterSnapshotRequest.getSnapshotIdentifier() != null) {
            prefix = "SnapshotIdentifier";
            String snapshotIdentifier = restoreFromClusterSnapshotRequest.getSnapshotIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotIdentifier));
        }
        if (restoreFromClusterSnapshotRequest.getSnapshotClusterIdentifier() != null) {
            prefix = "SnapshotClusterIdentifier";
            String snapshotClusterIdentifier = restoreFromClusterSnapshotRequest
                    .getSnapshotClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotClusterIdentifier));
        }
        if (restoreFromClusterSnapshotRequest.getPort() != null) {
            prefix = "Port";
            Integer port = restoreFromClusterSnapshotRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (restoreFromClusterSnapshotRequest.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = restoreFromClusterSnapshotRequest.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (restoreFromClusterSnapshotRequest.getAllowVersionUpgrade() != null) {
            prefix = "AllowVersionUpgrade";
            Boolean allowVersionUpgrade = restoreFromClusterSnapshotRequest
                    .getAllowVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(allowVersionUpgrade));
        }
        if (restoreFromClusterSnapshotRequest.getClusterSubnetGroupName() != null) {
            prefix = "ClusterSubnetGroupName";
            String clusterSubnetGroupName = restoreFromClusterSnapshotRequest
                    .getClusterSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSubnetGroupName));
        }
        if (restoreFromClusterSnapshotRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = restoreFromClusterSnapshotRequest.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (restoreFromClusterSnapshotRequest.getOwnerAccount() != null) {
            prefix = "OwnerAccount";
            String ownerAccount = restoreFromClusterSnapshotRequest.getOwnerAccount();
            request.addParameter(prefix, StringUtils.fromString(ownerAccount));
        }
        if (restoreFromClusterSnapshotRequest.getHsmClientCertificateIdentifier() != null) {
            prefix = "HsmClientCertificateIdentifier";
            String hsmClientCertificateIdentifier = restoreFromClusterSnapshotRequest
                    .getHsmClientCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificateIdentifier));
        }
        if (restoreFromClusterSnapshotRequest.getHsmConfigurationIdentifier() != null) {
            prefix = "HsmConfigurationIdentifier";
            String hsmConfigurationIdentifier = restoreFromClusterSnapshotRequest
                    .getHsmConfigurationIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmConfigurationIdentifier));
        }
        if (restoreFromClusterSnapshotRequest.getElasticIp() != null) {
            prefix = "ElasticIp";
            String elasticIp = restoreFromClusterSnapshotRequest.getElasticIp();
            request.addParameter(prefix, StringUtils.fromString(elasticIp));
        }
        if (restoreFromClusterSnapshotRequest.getClusterParameterGroupName() != null) {
            prefix = "ClusterParameterGroupName";
            String clusterParameterGroupName = restoreFromClusterSnapshotRequest
                    .getClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterParameterGroupName));
        }
        if (restoreFromClusterSnapshotRequest.getClusterSecurityGroups() != null) {
            prefix = "ClusterSecurityGroups";
            java.util.List<String> clusterSecurityGroups = restoreFromClusterSnapshotRequest
                    .getClusterSecurityGroups();
            int clusterSecurityGroupsIndex = 1;
            String clusterSecurityGroupsPrefix = prefix;
            for (String clusterSecurityGroupsItem : clusterSecurityGroups) {
                prefix = clusterSecurityGroupsPrefix + "." + clusterSecurityGroupsIndex;
                if (clusterSecurityGroupsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(clusterSecurityGroupsItem));
                }
                clusterSecurityGroupsIndex++;
            }
            prefix = clusterSecurityGroupsPrefix;
        }
        if (restoreFromClusterSnapshotRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = restoreFromClusterSnapshotRequest
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
        if (restoreFromClusterSnapshotRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = restoreFromClusterSnapshotRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (restoreFromClusterSnapshotRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            prefix = "AutomatedSnapshotRetentionPeriod";
            Integer automatedSnapshotRetentionPeriod = restoreFromClusterSnapshotRequest
                    .getAutomatedSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(automatedSnapshotRetentionPeriod));
        }
        if (restoreFromClusterSnapshotRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = restoreFromClusterSnapshotRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (restoreFromClusterSnapshotRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = restoreFromClusterSnapshotRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (restoreFromClusterSnapshotRequest.getNodeType() != null) {
            prefix = "NodeType";
            String nodeType = restoreFromClusterSnapshotRequest.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (restoreFromClusterSnapshotRequest.getEnhancedVpcRouting() != null) {
            prefix = "EnhancedVpcRouting";
            Boolean enhancedVpcRouting = restoreFromClusterSnapshotRequest.getEnhancedVpcRouting();
            request.addParameter(prefix, StringUtils.fromBoolean(enhancedVpcRouting));
        }
        if (restoreFromClusterSnapshotRequest.getAdditionalInfo() != null) {
            prefix = "AdditionalInfo";
            String additionalInfo = restoreFromClusterSnapshotRequest.getAdditionalInfo();
            request.addParameter(prefix, StringUtils.fromString(additionalInfo));
        }
        if (restoreFromClusterSnapshotRequest.getIamRoles() != null) {
            prefix = "IamRoles";
            java.util.List<String> iamRoles = restoreFromClusterSnapshotRequest.getIamRoles();
            int iamRolesIndex = 1;
            String iamRolesPrefix = prefix;
            for (String iamRolesItem : iamRoles) {
                prefix = iamRolesPrefix + "." + iamRolesIndex;
                if (iamRolesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(iamRolesItem));
                }
                iamRolesIndex++;
            }
            prefix = iamRolesPrefix;
        }
        if (restoreFromClusterSnapshotRequest.getMaintenanceTrackName() != null) {
            prefix = "MaintenanceTrackName";
            String maintenanceTrackName = restoreFromClusterSnapshotRequest
                    .getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (restoreFromClusterSnapshotRequest.getSnapshotScheduleIdentifier() != null) {
            prefix = "SnapshotScheduleIdentifier";
            String snapshotScheduleIdentifier = restoreFromClusterSnapshotRequest
                    .getSnapshotScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotScheduleIdentifier));
        }
        if (restoreFromClusterSnapshotRequest.getNumberOfNodes() != null) {
            prefix = "NumberOfNodes";
            Integer numberOfNodes = restoreFromClusterSnapshotRequest.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }

        return request;
    }
}
