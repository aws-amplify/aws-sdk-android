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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateReplicationGroupRequest
 */
public class CreateReplicationGroupRequestMarshaller implements
        Marshaller<Request<CreateReplicationGroupRequest>, CreateReplicationGroupRequest> {

    public Request<CreateReplicationGroupRequest> marshall(
            CreateReplicationGroupRequest createReplicationGroupRequest) {
        if (createReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateReplicationGroupRequest)");
        }

        Request<CreateReplicationGroupRequest> request = new DefaultRequest<CreateReplicationGroupRequest>(
                createReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "CreateReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (createReplicationGroupRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = createReplicationGroupRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (createReplicationGroupRequest.getReplicationGroupDescription() != null) {
            prefix = "ReplicationGroupDescription";
            String replicationGroupDescription = createReplicationGroupRequest
                    .getReplicationGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupDescription));
        }
        if (createReplicationGroupRequest.getGlobalReplicationGroupId() != null) {
            prefix = "GlobalReplicationGroupId";
            String globalReplicationGroupId = createReplicationGroupRequest
                    .getGlobalReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(globalReplicationGroupId));
        }
        if (createReplicationGroupRequest.getPrimaryClusterId() != null) {
            prefix = "PrimaryClusterId";
            String primaryClusterId = createReplicationGroupRequest.getPrimaryClusterId();
            request.addParameter(prefix, StringUtils.fromString(primaryClusterId));
        }
        if (createReplicationGroupRequest.getAutomaticFailoverEnabled() != null) {
            prefix = "AutomaticFailoverEnabled";
            Boolean automaticFailoverEnabled = createReplicationGroupRequest
                    .getAutomaticFailoverEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(automaticFailoverEnabled));
        }
        if (createReplicationGroupRequest.getMultiAZEnabled() != null) {
            prefix = "MultiAZEnabled";
            Boolean multiAZEnabled = createReplicationGroupRequest.getMultiAZEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZEnabled));
        }
        if (createReplicationGroupRequest.getNumCacheClusters() != null) {
            prefix = "NumCacheClusters";
            Integer numCacheClusters = createReplicationGroupRequest.getNumCacheClusters();
            request.addParameter(prefix, StringUtils.fromInteger(numCacheClusters));
        }
        if (createReplicationGroupRequest.getPreferredCacheClusterAZs() != null) {
            prefix = "PreferredCacheClusterAZs";
            java.util.List<String> preferredCacheClusterAZs = createReplicationGroupRequest
                    .getPreferredCacheClusterAZs();
            int preferredCacheClusterAZsIndex = 1;
            String preferredCacheClusterAZsPrefix = prefix;
            for (String preferredCacheClusterAZsItem : preferredCacheClusterAZs) {
                prefix = preferredCacheClusterAZsPrefix + "." + preferredCacheClusterAZsIndex;
                if (preferredCacheClusterAZsItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(preferredCacheClusterAZsItem));
                }
                preferredCacheClusterAZsIndex++;
            }
            prefix = preferredCacheClusterAZsPrefix;
        }
        if (createReplicationGroupRequest.getNumNodeGroups() != null) {
            prefix = "NumNodeGroups";
            Integer numNodeGroups = createReplicationGroupRequest.getNumNodeGroups();
            request.addParameter(prefix, StringUtils.fromInteger(numNodeGroups));
        }
        if (createReplicationGroupRequest.getReplicasPerNodeGroup() != null) {
            prefix = "ReplicasPerNodeGroup";
            Integer replicasPerNodeGroup = createReplicationGroupRequest.getReplicasPerNodeGroup();
            request.addParameter(prefix, StringUtils.fromInteger(replicasPerNodeGroup));
        }
        if (createReplicationGroupRequest.getNodeGroupConfiguration() != null) {
            prefix = "NodeGroupConfiguration";
            java.util.List<NodeGroupConfiguration> nodeGroupConfiguration = createReplicationGroupRequest
                    .getNodeGroupConfiguration();
            int nodeGroupConfigurationIndex = 1;
            String nodeGroupConfigurationPrefix = prefix;
            for (NodeGroupConfiguration nodeGroupConfigurationItem : nodeGroupConfiguration) {
                prefix = nodeGroupConfigurationPrefix + "." + nodeGroupConfigurationIndex;
                if (nodeGroupConfigurationItem != null) {
                    NodeGroupConfigurationStaxMarshaller.getInstance().marshall(
                            nodeGroupConfigurationItem, request, prefix + ".");
                }
                nodeGroupConfigurationIndex++;
            }
            prefix = nodeGroupConfigurationPrefix;
        }
        if (createReplicationGroupRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = createReplicationGroupRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (createReplicationGroupRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = createReplicationGroupRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (createReplicationGroupRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = createReplicationGroupRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (createReplicationGroupRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = createReplicationGroupRequest
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (createReplicationGroupRequest.getCacheSubnetGroupName() != null) {
            prefix = "CacheSubnetGroupName";
            String cacheSubnetGroupName = createReplicationGroupRequest.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (createReplicationGroupRequest.getCacheSecurityGroupNames() != null) {
            prefix = "CacheSecurityGroupNames";
            java.util.List<String> cacheSecurityGroupNames = createReplicationGroupRequest
                    .getCacheSecurityGroupNames();
            int cacheSecurityGroupNamesIndex = 1;
            String cacheSecurityGroupNamesPrefix = prefix;
            for (String cacheSecurityGroupNamesItem : cacheSecurityGroupNames) {
                prefix = cacheSecurityGroupNamesPrefix + "." + cacheSecurityGroupNamesIndex;
                if (cacheSecurityGroupNamesItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(cacheSecurityGroupNamesItem));
                }
                cacheSecurityGroupNamesIndex++;
            }
            prefix = cacheSecurityGroupNamesPrefix;
        }
        if (createReplicationGroupRequest.getSecurityGroupIds() != null) {
            prefix = "SecurityGroupIds";
            java.util.List<String> securityGroupIds = createReplicationGroupRequest
                    .getSecurityGroupIds();
            int securityGroupIdsIndex = 1;
            String securityGroupIdsPrefix = prefix;
            for (String securityGroupIdsItem : securityGroupIds) {
                prefix = securityGroupIdsPrefix + "." + securityGroupIdsIndex;
                if (securityGroupIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(securityGroupIdsItem));
                }
                securityGroupIdsIndex++;
            }
            prefix = securityGroupIdsPrefix;
        }
        if (createReplicationGroupRequest.getTags() != null) {
            prefix = "Tags";
            java.util.List<Tag> tags = createReplicationGroupRequest.getTags();
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
        if (createReplicationGroupRequest.getSnapshotArns() != null) {
            prefix = "SnapshotArns";
            java.util.List<String> snapshotArns = createReplicationGroupRequest.getSnapshotArns();
            int snapshotArnsIndex = 1;
            String snapshotArnsPrefix = prefix;
            for (String snapshotArnsItem : snapshotArns) {
                prefix = snapshotArnsPrefix + "." + snapshotArnsIndex;
                if (snapshotArnsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(snapshotArnsItem));
                }
                snapshotArnsIndex++;
            }
            prefix = snapshotArnsPrefix;
        }
        if (createReplicationGroupRequest.getSnapshotName() != null) {
            prefix = "SnapshotName";
            String snapshotName = createReplicationGroupRequest.getSnapshotName();
            request.addParameter(prefix, StringUtils.fromString(snapshotName));
        }
        if (createReplicationGroupRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = createReplicationGroupRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (createReplicationGroupRequest.getPort() != null) {
            prefix = "Port";
            Integer port = createReplicationGroupRequest.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (createReplicationGroupRequest.getNotificationTopicArn() != null) {
            prefix = "NotificationTopicArn";
            String notificationTopicArn = createReplicationGroupRequest.getNotificationTopicArn();
            request.addParameter(prefix, StringUtils.fromString(notificationTopicArn));
        }
        if (createReplicationGroupRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = createReplicationGroupRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (createReplicationGroupRequest.getSnapshotRetentionLimit() != null) {
            prefix = "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = createReplicationGroupRequest
                    .getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (createReplicationGroupRequest.getSnapshotWindow() != null) {
            prefix = "SnapshotWindow";
            String snapshotWindow = createReplicationGroupRequest.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (createReplicationGroupRequest.getAuthToken() != null) {
            prefix = "AuthToken";
            String authToken = createReplicationGroupRequest.getAuthToken();
            request.addParameter(prefix, StringUtils.fromString(authToken));
        }
        if (createReplicationGroupRequest.getTransitEncryptionEnabled() != null) {
            prefix = "TransitEncryptionEnabled";
            Boolean transitEncryptionEnabled = createReplicationGroupRequest
                    .getTransitEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(transitEncryptionEnabled));
        }
        if (createReplicationGroupRequest.getAtRestEncryptionEnabled() != null) {
            prefix = "AtRestEncryptionEnabled";
            Boolean atRestEncryptionEnabled = createReplicationGroupRequest
                    .getAtRestEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(atRestEncryptionEnabled));
        }
        if (createReplicationGroupRequest.getKmsKeyId() != null) {
            prefix = "KmsKeyId";
            String kmsKeyId = createReplicationGroupRequest.getKmsKeyId();
            request.addParameter(prefix, StringUtils.fromString(kmsKeyId));
        }

        return request;
    }
}
