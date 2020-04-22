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
 * StAX request marshaller for CreateClusterRequest
 */
public class CreateClusterRequestMarshaller implements
        Marshaller<Request<CreateClusterRequest>, CreateClusterRequest> {

    public Request<CreateClusterRequest> marshall(CreateClusterRequest createClusterRequest) {
        if (createClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateClusterRequest)");
        }

        Request<CreateClusterRequest> request = new DefaultRequest<CreateClusterRequest>(
                createClusterRequest, "AmazonRedshift");
        request.addParameter("Action", "CreateCluster");
        request.addParameter("Version", "2012-12-01");

        String prefix;
        if (createClusterRequest.getDBName() != null) {
            prefix = "DBName";
            String dBName = createClusterRequest.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (createClusterRequest.getClusterIdentifier() != null) {
            prefix = "ClusterIdentifier";
            String clusterIdentifier = createClusterRequest.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (createClusterRequest.getClusterType() != null) {
            prefix = "ClusterType";
            String clusterType = createClusterRequest.getClusterType();
            request.addParameter(prefix, StringUtils.fromString(clusterType));
        }
        if (createClusterRequest.getNodeType() != null) {
            prefix = "NodeType";
            String nodeType = createClusterRequest.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (createClusterRequest.getMasterUsername() != null) {
            prefix = "MasterUsername";
            String masterUsername = createClusterRequest.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (createClusterRequest.getMasterUserPassword() != null) {
            prefix = "MasterUserPassword";
            String masterUserPassword = createClusterRequest.getMasterUserPassword();
            request.addParameter(prefix, StringUtils.fromString(masterUserPassword));
        }
        if (createClusterRequest.getClusterSecurityGroups() != null) {
            prefix = "ClusterSecurityGroups";
            java.util.List<String> clusterSecurityGroups = createClusterRequest
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
        if (createClusterRequest.getVpcSecurityGroupIds() != null) {
            prefix = "VpcSecurityGroupIds";
            java.util.List<String> vpcSecurityGroupIds = createClusterRequest
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
        if (createClusterRequest.getClusterSubnetGroupName() != null) {
            prefix = "ClusterSubnetGroupName";
            String clusterSubnetGroupName = createClusterRequest.getClusterSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSubnetGroupName));
        }
        if (createClusterRequest.getAvailabilityZone() != null) {
            prefix = "AvailabilityZone";
            String availabilityZone = createClusterRequest.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (createClusterRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = createClusterRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (createClusterRequest.getClusterParameterGroupName() != null) {
            prefix = "ClusterParameterGroupName";
            String clusterParameterGroupName = createClusterRequest.getClusterParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterParameterGroupName));
        }
        if (createClusterRequest.getAutomatedSnapshotRetentionPeriod() != null) {
            prefix = "AutomatedSnapshotRetentionPeriod";
            Integer automatedSnapshotRetentionPeriod = createClusterRequest
                    .getAutomatedSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(automatedSnapshotRetentionPeriod));
        }
        if (createClusterRequest.getManualSnapshotRetentionPeriod() != null) {
            prefix = "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = createClusterRequest
                    .getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (createClusterRequest.getPort() != null) {
            prefix = "Port";
            Integer port = createClusterRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (createClusterRequest.getClusterVersion() != null) {
            prefix = "ClusterVersion";
            String clusterVersion = createClusterRequest.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (createClusterRequest.getAllowVersionUpgrade() != null) {
            prefix = "AllowVersionUpgrade";
            Boolean allowVersionUpgrade = createClusterRequest.getAllowVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(allowVersionUpgrade));
        }
        if (createClusterRequest.getNumberOfNodes() != null) {
            prefix = "NumberOfNodes";
            Integer numberOfNodes = createClusterRequest.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (createClusterRequest.getPubliclyAccessible() != null) {
            prefix = "PubliclyAccessible";
            Boolean publiclyAccessible = createClusterRequest.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (createClusterRequest.getEncrypted() != null) {
            prefix = "Encrypted";
            Boolean encrypted = createClusterRequest.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
        if (createClusterRequest.getHsmClientCertificateIdentifier() != null) {
            prefix = "HsmClientCertificateIdentifier";
            String hsmClientCertificateIdentifier = createClusterRequest
                    .getHsmClientCertificateIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmClientCertificateIdentifier));
        }
        if (createClusterRequest.getHsmConfigurationIdentifier() != null) {
            prefix = "HsmConfigurationIdentifier";
            String hsmConfigurationIdentifier = createClusterRequest
                    .getHsmConfigurationIdentifier();
            request.addParameter(prefix, StringUtils.fromString(hsmConfigurationIdentifier));
        }
        if (createClusterRequest.getElasticIp() != null) {
            prefix = "ElasticIp";
            String elasticIp = createClusterRequest.getElasticIp();
            request.addParameter(prefix, StringUtils.fromString(elasticIp));
        }
        if (createClusterRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createClusterRequest.getTags();
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
        if (createClusterRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = createClusterRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (createClusterRequest.getEnhancedVpcRouting() != null) {
            prefix = "EnhancedVpcRouting";
            Boolean enhancedVpcRouting = createClusterRequest.getEnhancedVpcRouting();
            request.addParameter(prefix, StringUtils.fromBoolean(enhancedVpcRouting));
        }
        if (createClusterRequest.getAdditionalInfo() != null) {
            prefix = "AdditionalInfo";
            String additionalInfo = createClusterRequest.getAdditionalInfo();
            request.addParameter(prefix, StringUtils.fromString(additionalInfo));
        }
        if (createClusterRequest.getIamRoles() != null) {
            prefix = "IamRoles";
            java.util.List<String> iamRoles = createClusterRequest.getIamRoles();
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
        if (createClusterRequest.getMaintenanceTrackName() != null) {
            prefix = "MaintenanceTrackName";
            String maintenanceTrackName = createClusterRequest.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (createClusterRequest.getSnapshotScheduleIdentifier() != null) {
            prefix = "SnapshotScheduleIdentifier";
            String snapshotScheduleIdentifier = createClusterRequest
                    .getSnapshotScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotScheduleIdentifier));
        }

        return request;
    }
}
