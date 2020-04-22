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
 * StAX request marshaller for ModifyClusterRequest
 */
public class ModifyClusterRequestMarshaller implements
        Marshaller<Request<ModifyClusterRequest>, ModifyClusterRequest> {

    public Request<ModifyClusterRequest> marshall(ModifyClusterRequest modifyClusterRequest) {
        if (modifyClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyClusterRequest)");
        }

        Request<ModifyClusterRequest> request = new DefaultRequest<ModifyClusterRequest>(
                modifyClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "ModifyCluster");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (modifyClusterRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = modifyClusterRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (modifyClusterRequest.getClusterType() != null) {
            prefix = "ClusterType";
            String clusterType = modifyClusterRequest.getClusterType();
            request.addParameter(prefix, StringUtils.fromString(clusterType));
        }
        if (modifyClusterRequest.getNodeType() != null) {
            prefix = "NodeType";
            String nodeType = modifyClusterRequest.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (modifyClusterRequest.getNumberOfNodes() != null) {
            prefix = "NumberOfNodes";
            Integer numberOfNodes = modifyClusterRequest.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (modifyClusterRequest.getClusterSecurityGroups() != null) {
            prefix = "ClusterSecurityGroups";
            java.util.List<String> clusterSecurityGroups = modifyClusterRequest
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
        if (modifyClusterRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = modifyClusterRequest
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
        if (modifyClusterRequest.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = modifyClusterRequest.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (modifyClusterRequest.getClusterParameterGroupName() != null) {
            prefix = "ClusterParameterGroupName";
            String clusterParameterGroupName = modifyClusterRequest.getClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterParameterGroupName));
        }
        if (modifyClusterRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            prefix = "AutomatedSnapshotRetentionPeriod";
            Integer automatedSnapshotRetentionPeriod = modifyClusterRequest
                    .getAutomatedSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(automatedSnapshotRetentionPeriod));
        }
        if (modifyClusterRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = modifyClusterRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (modifyClusterRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = modifyClusterRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (modifyClusterRequest.getClusterVersion() != null) {
            prefix = "ClusterVersion";
            String clusterVersion = modifyClusterRequest.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (modifyClusterRequest.getAllowVersionUpgrade() != null) {
            prefix = "AllowVersionUpgrade";
            Boolean allowVersionUpgrade = modifyClusterRequest.getAllowVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(allowVersionUpgrade));
        }
        if (modifyClusterRequest.getHsmClientCertificateIdentifier() != null) {
            prefix = "HsmClientCertificateIdentifier";
            String hsmClientCertificateIdentifier = modifyClusterRequest
                    .getHsmClientCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificateIdentifier));
        }
        if (modifyClusterRequest.getHsmConfigurationIdentifier() != null) {
            prefix = "HsmConfigurationIdentifier";
            String hsmConfigurationIdentifier = modifyClusterRequest
                    .getHsmConfigurationIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmConfigurationIdentifier));
        }
        if (modifyClusterRequest.getNewClusterIdentifier() != null) {
            prefix = "NewClusterIdentifier";
            String newClusterIdentifier = modifyClusterRequest.getNewClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(newClusterIdentifier));
        }
        if (modifyClusterRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = modifyClusterRequest.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (modifyClusterRequest.getElasticIp() != null) {
            prefix = "ElasticIp";
            String elasticIp = modifyClusterRequest.getElasticIp();
            request.addParameter(prefix, StringUtils.fromString(elasticIp));
        }
        if (modifyClusterRequest.getEnhancedVpcRouting() != null) {
            prefix = "EnhancedVpcRouting";
            Boolean enhancedVpcRouting = modifyClusterRequest.getEnhancedVpcRouting();
            request.addParameter(prefix, StringUtils.fromBoolean(enhancedVpcRouting));
        }
        if (modifyClusterRequest.getMaintenanceTrackName() != null) {
            prefix = "MaintenanceTrackName";
            String maintenanceTrackName = modifyClusterRequest.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (modifyClusterRequest.getEncrypted() != null) {
            prefix = "Encrypted";
            Boolean encrypted = modifyClusterRequest.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
        if (modifyClusterRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = modifyClusterRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }

        return request;
    }
}
