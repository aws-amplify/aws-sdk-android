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

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Cluster
 */
class ClusterStaxMarshaller {

    public void marshall(Cluster _cluster, Request<?> request, String _prefix) {
        String prefix;
        if (_cluster.getClusterIdentifier() != null) {
            prefix = _prefix + "ClusterIdentifier";
            String clusterIdentifier = _cluster.getClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(clusterIdentifier));
        }
        if (_cluster.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _cluster.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_cluster.getClusterStatus() != null) {
            prefix = _prefix + "ClusterStatus";
            String clusterStatus = _cluster.getClusterStatus();
            request.addParameter(prefix, StringUtils.fromString(clusterStatus));
        }
        if (_cluster.getClusterAvailabilityStatus() != null) {
            prefix = _prefix + "ClusterAvailabilityStatus";
            String clusterAvailabilityStatus = _cluster.getClusterAvailabilityStatus();
            request.addParameter(prefix, StringUtils.fromString(clusterAvailabilityStatus));
        }
        if (_cluster.getModifyStatus() != null) {
            prefix = _prefix + "ModifyStatus";
            String modifyStatus = _cluster.getModifyStatus();
            request.addParameter(prefix, StringUtils.fromString(modifyStatus));
        }
        if (_cluster.getMasterUsername() != null) {
            prefix = _prefix + "MasterUsername";
            String masterUsername = _cluster.getMasterUsername();
            request.addParameter(prefix, StringUtils.fromString(masterUsername));
        }
        if (_cluster.getDBName() != null) {
            prefix = _prefix + "DBName";
            String dBName = _cluster.getDBName();
            request.addParameter(prefix, StringUtils.fromString(dBName));
        }
        if (_cluster.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            Endpoint endpoint = _cluster.getEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(endpoint, request, prefix + ".");
        }
        if (_cluster.getClusterCreateTime() != null) {
            prefix = _prefix + "ClusterCreateTime";
            java.util.Date clusterCreateTime = _cluster.getClusterCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(clusterCreateTime));
        }
        if (_cluster.getAutomatedSnapshotRetentionPeriod() != null) {
            prefix = _prefix + "AutomatedSnapshotRetentionPeriod";
            Integer automatedSnapshotRetentionPeriod = _cluster
                    .getAutomatedSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(automatedSnapshotRetentionPeriod));
        }
        if (_cluster.getManualSnapshotRetentionPeriod() != null) {
            prefix = _prefix + "ManualSnapshotRetentionPeriod";
            Integer manualSnapshotRetentionPeriod = _cluster.getManualSnapshotRetentionPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(manualSnapshotRetentionPeriod));
        }
        if (_cluster.getClusterSecurityGroups() != null) {
            prefix = _prefix + "ClusterSecurityGroups";
            java.util.List<ClusterSecurityGroupMembership> clusterSecurityGroups = _cluster
                    .getClusterSecurityGroups();
            int clusterSecurityGroupsIndex = 1;
            String clusterSecurityGroupsPrefix = prefix;
            for (ClusterSecurityGroupMembership clusterSecurityGroupsItem : clusterSecurityGroups) {
                prefix = clusterSecurityGroupsPrefix + "." + clusterSecurityGroupsIndex;
                if (clusterSecurityGroupsItem != null) {
                    ClusterSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            clusterSecurityGroupsItem, request, prefix + ".");
                }
                clusterSecurityGroupsIndex++;
            }
            prefix = clusterSecurityGroupsPrefix;
        }
        if (_cluster.getVpcSecurityGroups() != null) {
            prefix = _prefix + "VpcSecurityGroups";
            java.util.List<VpcSecurityGroupMembership> vpcSecurityGroups = _cluster
                    .getVpcSecurityGroups();
            int vpcSecurityGroupsIndex = 1;
            String vpcSecurityGroupsPrefix = prefix;
            for (VpcSecurityGroupMembership vpcSecurityGroupsItem : vpcSecurityGroups) {
                prefix = vpcSecurityGroupsPrefix + "." + vpcSecurityGroupsIndex;
                if (vpcSecurityGroupsItem != null) {
                    VpcSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            vpcSecurityGroupsItem, request, prefix + ".");
                }
                vpcSecurityGroupsIndex++;
            }
            prefix = vpcSecurityGroupsPrefix;
        }
        if (_cluster.getClusterParameterGroups() != null) {
            prefix = _prefix + "ClusterParameterGroups";
            java.util.List<ClusterParameterGroupStatus> clusterParameterGroups = _cluster
                    .getClusterParameterGroups();
            int clusterParameterGroupsIndex = 1;
            String clusterParameterGroupsPrefix = prefix;
            for (ClusterParameterGroupStatus clusterParameterGroupsItem : clusterParameterGroups) {
                prefix = clusterParameterGroupsPrefix + "." + clusterParameterGroupsIndex;
                if (clusterParameterGroupsItem != null) {
                    ClusterParameterGroupStatusStaxMarshaller.getInstance().marshall(
                            clusterParameterGroupsItem, request, prefix + ".");
                }
                clusterParameterGroupsIndex++;
            }
            prefix = clusterParameterGroupsPrefix;
        }
        if (_cluster.getClusterSubnetGroupName() != null) {
            prefix = _prefix + "ClusterSubnetGroupName";
            String clusterSubnetGroupName = _cluster.getClusterSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(clusterSubnetGroupName));
        }
        if (_cluster.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _cluster.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_cluster.getAvailabilityZone() != null) {
            prefix = _prefix + "AvailabilityZone";
            String availabilityZone = _cluster.getAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(availabilityZone));
        }
        if (_cluster.getPreferredMaintenanceWindow() != null) {
            prefix = _prefix + "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = _cluster.getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (_cluster.getPendingModifiedValues() != null) {
            prefix = _prefix + "PendingModifiedValues";
            PendingModifiedValues pendingModifiedValues = _cluster.getPendingModifiedValues();
            PendingModifiedValuesStaxMarshaller.getInstance().marshall(pendingModifiedValues,
                    request, prefix + ".");
        }
        if (_cluster.getClusterVersion() != null) {
            prefix = _prefix + "ClusterVersion";
            String clusterVersion = _cluster.getClusterVersion();
            request.addParameter(prefix, StringUtils.fromString(clusterVersion));
        }
        if (_cluster.getAllowVersionUpgrade() != null) {
            prefix = _prefix + "AllowVersionUpgrade";
            Boolean allowVersionUpgrade = _cluster.getAllowVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(allowVersionUpgrade));
        }
        if (_cluster.getNumberOfNodes() != null) {
            prefix = _prefix + "NumberOfNodes";
            Integer numberOfNodes = _cluster.getNumberOfNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numberOfNodes));
        }
        if (_cluster.getPubliclyAccessible() != null) {
            prefix = _prefix + "PubliclyAccessible";
            Boolean publiclyAccessible = _cluster.getPubliclyAccessible();
            request.addParameter(prefix, StringUtils.fromBoolean(publiclyAccessible));
        }
        if (_cluster.getEncrypted() != null) {
            prefix = _prefix + "Encrypted";
            Boolean encrypted = _cluster.getEncrypted();
            request.addParameter(prefix, StringUtils.fromBoolean(encrypted));
        }
        if (_cluster.getRestoreStatus() != null) {
            prefix = _prefix + "RestoreStatus";
            RestoreStatus restoreStatus = _cluster.getRestoreStatus();
            RestoreStatusStaxMarshaller.getInstance()
                    .marshall(restoreStatus, request, prefix + ".");
        }
        if (_cluster.getDataTransferProgress() != null) {
            prefix = _prefix + "DataTransferProgress";
            DataTransferProgress dataTransferProgress = _cluster.getDataTransferProgress();
            DataTransferProgressStaxMarshaller.getInstance().marshall(dataTransferProgress,
                    request, prefix + ".");
        }
        if (_cluster.getHsmStatus() != null) {
            prefix = _prefix + "HsmStatus";
            HsmStatus hsmStatus = _cluster.getHsmStatus();
            HsmStatusStaxMarshaller.getInstance().marshall(hsmStatus, request, prefix + ".");
        }
        if (_cluster.getClusterSnapshotCopyStatus() != null) {
            prefix = _prefix + "ClusterSnapshotCopyStatus";
            ClusterSnapshotCopyStatus clusterSnapshotCopyStatus = _cluster
                    .getClusterSnapshotCopyStatus();
            ClusterSnapshotCopyStatusStaxMarshaller.getInstance().marshall(
                    clusterSnapshotCopyStatus, request, prefix + ".");
        }
        if (_cluster.getClusterPublicKey() != null) {
            prefix = _prefix + "ClusterPublicKey";
            String clusterPublicKey = _cluster.getClusterPublicKey();
            request.addParameter(prefix, StringUtils.fromString(clusterPublicKey));
        }
        if (_cluster.getClusterNodes() != null) {
            prefix = _prefix + "ClusterNodes";
            java.util.List<ClusterNode> clusterNodes = _cluster.getClusterNodes();
            int clusterNodesIndex = 1;
            String clusterNodesPrefix = prefix;
            for (ClusterNode clusterNodesItem : clusterNodes) {
                prefix = clusterNodesPrefix + ".member." + clusterNodesIndex;
                if (clusterNodesItem != null) {
                    ClusterNodeStaxMarshaller.getInstance().marshall(clusterNodesItem, request,
                            prefix + ".");
                }
                clusterNodesIndex++;
            }
            prefix = clusterNodesPrefix;
        }
        if (_cluster.getElasticIpStatus() != null) {
            prefix = _prefix + "ElasticIpStatus";
            ElasticIpStatus elasticIpStatus = _cluster.getElasticIpStatus();
            ElasticIpStatusStaxMarshaller.getInstance().marshall(elasticIpStatus, request,
                    prefix + ".");
        }
        if (_cluster.getClusterRevisionNumber() != null) {
            prefix = _prefix + "ClusterRevisionNumber";
            String clusterRevisionNumber = _cluster.getClusterRevisionNumber();
            request.addParameter(prefix, StringUtils.fromString(clusterRevisionNumber));
        }
        if (_cluster.getTags() != null) {
            prefix = _prefix + "Tags";
            java.util.List<Tag> tags = _cluster.getTags();
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
        if (_cluster.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _cluster.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_cluster.getEnhancedVpcRouting() != null) {
            prefix = _prefix + "EnhancedVpcRouting";
            Boolean enhancedVpcRouting = _cluster.getEnhancedVpcRouting();
            request.addParameter(prefix, StringUtils.fromBoolean(enhancedVpcRouting));
        }
        if (_cluster.getIamRoles() != null) {
            prefix = _prefix + "IamRoles";
            java.util.List<ClusterIamRole> iamRoles = _cluster.getIamRoles();
            int iamRolesIndex = 1;
            String iamRolesPrefix = prefix;
            for (ClusterIamRole iamRolesItem : iamRoles) {
                prefix = iamRolesPrefix + "." + iamRolesIndex;
                if (iamRolesItem != null) {
                    ClusterIamRoleStaxMarshaller.getInstance().marshall(iamRolesItem, request,
                            prefix + ".");
                }
                iamRolesIndex++;
            }
            prefix = iamRolesPrefix;
        }
        if (_cluster.getPendingActions() != null) {
            prefix = _prefix + "PendingActions";
            java.util.List<String> pendingActions = _cluster.getPendingActions();
            int pendingActionsIndex = 1;
            String pendingActionsPrefix = prefix;
            for (String pendingActionsItem : pendingActions) {
                prefix = pendingActionsPrefix + ".member." + pendingActionsIndex;
                if (pendingActionsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(pendingActionsItem));
                }
                pendingActionsIndex++;
            }
            prefix = pendingActionsPrefix;
        }
        if (_cluster.getMaintenanceTrackName() != null) {
            prefix = _prefix + "MaintenanceTrackName";
            String maintenanceTrackName = _cluster.getMaintenanceTrackName();
            request.addParameter(prefix, StringUtils.fromString(maintenanceTrackName));
        }
        if (_cluster.getElasticResizeNumberOfNodeOptions() != null) {
            prefix = _prefix + "ElasticResizeNumberOfNodeOptions";
            String elasticResizeNumberOfNodeOptions = _cluster
                    .getElasticResizeNumberOfNodeOptions();
            request.addParameter(prefix, StringUtils.fromString(elasticResizeNumberOfNodeOptions));
        }
        if (_cluster.getDeferredMaintenanceWindows() != null) {
            prefix = _prefix + "DeferredMaintenanceWindows";
            java.util.List<DeferredMaintenanceWindow> deferredMaintenanceWindows = _cluster
                    .getDeferredMaintenanceWindows();
            int deferredMaintenanceWindowsIndex = 1;
            String deferredMaintenanceWindowsPrefix = prefix;
            for (DeferredMaintenanceWindow deferredMaintenanceWindowsItem : deferredMaintenanceWindows) {
                prefix = deferredMaintenanceWindowsPrefix + "." + deferredMaintenanceWindowsIndex;
                if (deferredMaintenanceWindowsItem != null) {
                    DeferredMaintenanceWindowStaxMarshaller.getInstance().marshall(
                            deferredMaintenanceWindowsItem, request, prefix + ".");
                }
                deferredMaintenanceWindowsIndex++;
            }
            prefix = deferredMaintenanceWindowsPrefix;
        }
        if (_cluster.getSnapshotScheduleIdentifier() != null) {
            prefix = _prefix + "SnapshotScheduleIdentifier";
            String snapshotScheduleIdentifier = _cluster.getSnapshotScheduleIdentifier();
            request.addParameter(prefix, StringUtils.fromString(snapshotScheduleIdentifier));
        }
        if (_cluster.getSnapshotScheduleState() != null) {
            prefix = _prefix + "SnapshotScheduleState";
            String snapshotScheduleState = _cluster.getSnapshotScheduleState();
            request.addParameter(prefix, StringUtils.fromString(snapshotScheduleState));
        }
        if (_cluster.getExpectedNextSnapshotScheduleTime() != null) {
            prefix = _prefix + "ExpectedNextSnapshotScheduleTime";
            java.util.Date expectedNextSnapshotScheduleTime = _cluster
                    .getExpectedNextSnapshotScheduleTime();
            request.addParameter(prefix, StringUtils.fromDate(expectedNextSnapshotScheduleTime));
        }
        if (_cluster.getExpectedNextSnapshotScheduleTimeStatus() != null) {
            prefix = _prefix + "ExpectedNextSnapshotScheduleTimeStatus";
            String expectedNextSnapshotScheduleTimeStatus = _cluster
                    .getExpectedNextSnapshotScheduleTimeStatus();
            request.addParameter(prefix,
                    StringUtils.fromString(expectedNextSnapshotScheduleTimeStatus));
        }
        if (_cluster.getNextMaintenanceWindowStartTime() != null) {
            prefix = _prefix + "NextMaintenanceWindowStartTime";
            java.util.Date nextMaintenanceWindowStartTime = _cluster
                    .getNextMaintenanceWindowStartTime();
            request.addParameter(prefix, StringUtils.fromDate(nextMaintenanceWindowStartTime));
        }
        if (_cluster.getResizeInfo() != null) {
            prefix = _prefix + "ResizeInfo";
            ResizeInfo resizeInfo = _cluster.getResizeInfo();
            ResizeInfoStaxMarshaller.getInstance().marshall(resizeInfo, request, prefix + ".");
        }
    }

    private static ClusterStaxMarshaller instance;

    public static ClusterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ClusterStaxMarshaller();
        return instance;
    }
}
