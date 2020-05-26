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
 * StAX marshaller for POJO Snapshot
 */
class SnapshotStaxMarshaller {

    public void marshall(Snapshot _snapshot, Request<?> request, String _prefix) {
        String prefix;
        if (_snapshot.getSnapshotName() != null) {
            prefix = _prefix + "SnapshotName";
            String snapshotName = _snapshot.getSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(snapshotName));
        }
        if (_snapshot.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _snapshot.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_snapshot.getReplicationGroupDescription() != null) {
            prefix = _prefix + "ReplicationGroupDescription";
            String replicationGroupDescription = _snapshot.getReplicationGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupDescription));
        }
        if (_snapshot.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _snapshot.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_snapshot.getSnapshotStatus() != null) {
            prefix = _prefix + "SnapshotStatus";
            String snapshotStatus = _snapshot.getSnapshotStatus();
            request.addParameter(prefix, StringUtils.fromString(snapshotStatus));
        }
        if (_snapshot.getSnapshotSource() != null) {
            prefix = _prefix + "SnapshotSource";
            String snapshotSource = _snapshot.getSnapshotSource();
            request.addParameter(prefix, StringUtils.fromString(snapshotSource));
        }
        if (_snapshot.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _snapshot.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_snapshot.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _snapshot.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_snapshot.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _snapshot.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_snapshot.getNumCacheNodes() != null) {
            prefix = _prefix + "NumCacheNodes";
            Integer numCacheNodes = _snapshot.getNumCacheNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numCacheNodes));
        }
        if (_snapshot.getPreferredAvailabilityZone() != null) {
            prefix = _prefix + "PreferredAvailabilityZone";
            String preferredAvailabilityZone = _snapshot.getPreferredAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(preferredAvailabilityZone));
        }
        if (_snapshot.getCacheClusterCreateTime() != null) {
            prefix = _prefix + "CacheClusterCreateTime";
            java.util.Date cacheClusterCreateTime = _snapshot.getCacheClusterCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(cacheClusterCreateTime));
        }
        if (_snapshot.getPreferredMaintenanceWindow() != null) {
            prefix = _prefix + "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = _snapshot.getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (_snapshot.getTopicArn() != null) {
            prefix = _prefix + "TopicArn";
            String topicArn = _snapshot.getTopicArn();
            request.addParameter(prefix, StringUtils.fromString(topicArn));
        }
        if (_snapshot.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _snapshot.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_snapshot.getCacheParameterGroupName() != null) {
            prefix = _prefix + "CacheParameterGroupName";
            String cacheParameterGroupName = _snapshot.getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (_snapshot.getCacheSubnetGroupName() != null) {
            prefix = _prefix + "CacheSubnetGroupName";
            String cacheSubnetGroupName = _snapshot.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (_snapshot.getVpcId() != null) {
            prefix = _prefix + "VpcId";
            String vpcId = _snapshot.getVpcId();
            request.addParameter(prefix, StringUtils.fromString(vpcId));
        }
        if (_snapshot.getAutoMinorVersionUpgrade() != null) {
            prefix = _prefix + "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = _snapshot.getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (_snapshot.getSnapshotRetentionLimit() != null) {
            prefix = _prefix + "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = _snapshot.getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (_snapshot.getSnapshotWindow() != null) {
            prefix = _prefix + "SnapshotWindow";
            String snapshotWindow = _snapshot.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (_snapshot.getNumNodeGroups() != null) {
            prefix = _prefix + "NumNodeGroups";
            Integer numNodeGroups = _snapshot.getNumNodeGroups();
            request.addParameter(prefix, StringUtils.fromInteger(numNodeGroups));
        }
        if (_snapshot.getAutomaticFailover() != null) {
            prefix = _prefix + "AutomaticFailover";
            String automaticFailover = _snapshot.getAutomaticFailover();
            request.addParameter(prefix, StringUtils.fromString(automaticFailover));
        }
        if (_snapshot.getNodeSnapshots() != null) {
            prefix = _prefix + "NodeSnapshots";
            java.util.List<NodeSnapshot> nodeSnapshots = _snapshot.getNodeSnapshots();
            int nodeSnapshotsIndex = 1;
            String nodeSnapshotsPrefix = prefix;
            for (NodeSnapshot nodeSnapshotsItem : nodeSnapshots) {
                prefix = nodeSnapshotsPrefix + "." + nodeSnapshotsIndex;
                if (nodeSnapshotsItem != null) {
                    NodeSnapshotStaxMarshaller.getInstance().marshall(nodeSnapshotsItem, request,
                            prefix + ".");
                }
                nodeSnapshotsIndex++;
            }
            prefix = nodeSnapshotsPrefix;
        }
        if (_snapshot.getKmsKeyId() != null) {
            prefix = _prefix + "KmsKeyId";
            String kmsKeyId = _snapshot.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }
        if (_snapshot.getARN() != null) {
            prefix = _prefix + "ARN";
            String aRN = _snapshot.getARN();
            request.addParameter(prefix, StringUtils.fromString(aRN));
        }
    }

    private static SnapshotStaxMarshaller instance;

    public static SnapshotStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SnapshotStaxMarshaller();
        return instance;
    }
}
