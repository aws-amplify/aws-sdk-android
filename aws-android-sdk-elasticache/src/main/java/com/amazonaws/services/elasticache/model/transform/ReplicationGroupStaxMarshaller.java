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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReplicationGroup
 */
class ReplicationGroupStaxMarshaller {

    public void marshall(ReplicationGroup _replicationGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_replicationGroup.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _replicationGroup.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_replicationGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _replicationGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_replicationGroup.getGlobalReplicationGroupInfo() != null) {
            prefix = _prefix + "GlobalReplicationGroupInfo";
            GlobalReplicationGroupInfo globalReplicationGroupInfo = _replicationGroup
                    .getGlobalReplicationGroupInfo();
            GlobalReplicationGroupInfoStaxMarshaller.getInstance().marshall(
                    globalReplicationGroupInfo, request, prefix + ".");
        }
        if (_replicationGroup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _replicationGroup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_replicationGroup.getPendingModifiedValues() != null) {
            prefix = _prefix + "PendingModifiedValues";
            ReplicationGroupPendingModifiedValues pendingModifiedValues = _replicationGroup
                    .getPendingModifiedValues();
            ReplicationGroupPendingModifiedValuesStaxMarshaller.getInstance().marshall(
                    pendingModifiedValues, request, prefix + ".");
        }
        if (_replicationGroup.getMemberClusters() != null) {
            prefix = _prefix + "MemberClusters";
            java.util.List<String> memberClusters = _replicationGroup.getMemberClusters();
            int memberClustersIndex = 1;
            String memberClustersPrefix = prefix;
            for (String memberClustersItem : memberClusters) {
                prefix = memberClustersPrefix + "." + memberClustersIndex;
                if (memberClustersItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(memberClustersItem));
                }
                memberClustersIndex++;
            }
            prefix = memberClustersPrefix;
        }
        if (_replicationGroup.getNodeGroups() != null) {
            prefix = _prefix + "NodeGroups";
            java.util.List<NodeGroup> nodeGroups = _replicationGroup.getNodeGroups();
            int nodeGroupsIndex = 1;
            String nodeGroupsPrefix = prefix;
            for (NodeGroup nodeGroupsItem : nodeGroups) {
                prefix = nodeGroupsPrefix + "." + nodeGroupsIndex;
                if (nodeGroupsItem != null) {
                    NodeGroupStaxMarshaller.getInstance().marshall(nodeGroupsItem, request,
                            prefix + ".");
                }
                nodeGroupsIndex++;
            }
            prefix = nodeGroupsPrefix;
        }
        if (_replicationGroup.getSnapshottingClusterId() != null) {
            prefix = _prefix + "SnapshottingClusterId";
            String snapshottingClusterId = _replicationGroup.getSnapshottingClusterId();
            request.addParameter(prefix, StringUtils.fromString(snapshottingClusterId));
        }
        if (_replicationGroup.getAutomaticFailover() != null) {
            prefix = _prefix + "AutomaticFailover";
            String automaticFailover = _replicationGroup.getAutomaticFailover();
            request.addParameter(prefix, StringUtils.fromString(automaticFailover));
        }
        if (_replicationGroup.getConfigurationEndpoint() != null) {
            prefix = _prefix + "ConfigurationEndpoint";
            Endpoint configurationEndpoint = _replicationGroup.getConfigurationEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(configurationEndpoint, request,
                    prefix + ".");
        }
        if (_replicationGroup.getSnapshotRetentionLimit() != null) {
            prefix = _prefix + "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = _replicationGroup.getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (_replicationGroup.getSnapshotWindow() != null) {
            prefix = _prefix + "SnapshotWindow";
            String snapshotWindow = _replicationGroup.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (_replicationGroup.getClusterEnabled() != null) {
            prefix = _prefix + "ClusterEnabled";
            Boolean clusterEnabled = _replicationGroup.getClusterEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(clusterEnabled));
        }
        if (_replicationGroup.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _replicationGroup.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_replicationGroup.getAuthTokenEnabled() != null) {
            prefix = _prefix + "AuthTokenEnabled";
            Boolean authTokenEnabled = _replicationGroup.getAuthTokenEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(authTokenEnabled));
        }
        if (_replicationGroup.getAuthTokenLastModifiedDate() != null) {
            prefix = _prefix + "AuthTokenLastModifiedDate";
            java.util.Date authTokenLastModifiedDate = _replicationGroup
                    .getAuthTokenLastModifiedDate();
            request.addParameter(prefix, StringUtils.fromDate(authTokenLastModifiedDate));
        }
        if (_replicationGroup.getTransitEncryptionEnabled() != null) {
            prefix = _prefix + "TransitEncryptionEnabled";
            Boolean transitEncryptionEnabled = _replicationGroup.getTransitEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(transitEncryptionEnabled));
        }
        if (_replicationGroup.getAtRestEncryptionEnabled() != null) {
            prefix = _prefix + "AtRestEncryptionEnabled";
            Boolean atRestEncryptionEnabled = _replicationGroup.getAtRestEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(atRestEncryptionEnabled));
        }
        if (_replicationGroup.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _replicationGroup.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_replicationGroup.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _replicationGroup.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
    }

    private static ReplicationGroupStaxMarshaller instance;

    public static ReplicationGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReplicationGroupStaxMarshaller();
        return instance;
    }
}
