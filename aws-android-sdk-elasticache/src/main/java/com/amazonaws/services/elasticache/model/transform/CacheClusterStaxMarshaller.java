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
 * StAX marshaller for POJO CacheCluster
 */
class CacheClusterStaxMarshaller {

    public void marshall(CacheCluster _cacheCluster, Request<?> request, String _prefix) {
        String prefix;
        if (_cacheCluster.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _cacheCluster.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_cacheCluster.getConfigurationEndpoint() != null) {
            prefix = _prefix + "ConfigurationEndpoint";
            Endpoint configurationEndpoint = _cacheCluster.getConfigurationEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(configurationEndpoint, request,
                    prefix + ".");
        }
        if (_cacheCluster.getClientDownloadLandingPage() != null) {
            prefix = _prefix + "ClientDownloadLandingPage";
            String clientDownloadLandingPage = _cacheCluster.getClientDownloadLandingPage();
            request.addParameter(prefix, StringUtils.fromString(clientDownloadLandingPage));
        }
        if (_cacheCluster.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _cacheCluster.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_cacheCluster.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _cacheCluster.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_cacheCluster.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _cacheCluster.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_cacheCluster.getCacheClusterStatus() != null) {
            prefix = _prefix + "CacheClusterStatus";
            String cacheClusterStatus = _cacheCluster.getCacheClusterStatus();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterStatus));
        }
        if (_cacheCluster.getNumCacheNodes() != null) {
            prefix = _prefix + "NumCacheNodes";
            Integer numCacheNodes = _cacheCluster.getNumCacheNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numCacheNodes));
        }
        if (_cacheCluster.getPreferredAvailabilityZone() != null) {
            prefix = _prefix + "PreferredAvailabilityZone";
            String preferredAvailabilityZone = _cacheCluster.getPreferredAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(preferredAvailabilityZone));
        }
        if (_cacheCluster.getCacheClusterCreateTime() != null) {
            prefix = _prefix + "CacheClusterCreateTime";
            java.util.Date cacheClusterCreateTime = _cacheCluster.getCacheClusterCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(cacheClusterCreateTime));
        }
        if (_cacheCluster.getPreferredMaintenanceWindow() != null) {
            prefix = _prefix + "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = _cacheCluster.getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (_cacheCluster.getPendingModifiedValues() != null) {
            prefix = _prefix + "PendingModifiedValues";
            PendingModifiedValues pendingModifiedValues = _cacheCluster.getPendingModifiedValues();
            PendingModifiedValuesStaxMarshaller.getInstance().marshall(pendingModifiedValues,
                    request, prefix + ".");
        }
        if (_cacheCluster.getNotificationConfiguration() != null) {
            prefix = _prefix + "NotificationConfiguration";
            NotificationConfiguration notificationConfiguration = _cacheCluster
                    .getNotificationConfiguration();
            NotificationConfigurationStaxMarshaller.getInstance().marshall(
                    notificationConfiguration, request, prefix + ".");
        }
        if (_cacheCluster.getCacheSecurityGroups() != null) {
            prefix = _prefix + "CacheSecurityGroups";
            java.util.List<CacheSecurityGroupMembership> cacheSecurityGroups = _cacheCluster
                    .getCacheSecurityGroups();
            int cacheSecurityGroupsIndex = 1;
            String cacheSecurityGroupsPrefix = prefix;
            for (CacheSecurityGroupMembership cacheSecurityGroupsItem : cacheSecurityGroups) {
                prefix = cacheSecurityGroupsPrefix + "." + cacheSecurityGroupsIndex;
                if (cacheSecurityGroupsItem != null) {
                    CacheSecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            cacheSecurityGroupsItem, request, prefix + ".");
                }
                cacheSecurityGroupsIndex++;
            }
            prefix = cacheSecurityGroupsPrefix;
        }
        if (_cacheCluster.getCacheParameterGroup() != null) {
            prefix = _prefix + "CacheParameterGroup";
            CacheParameterGroupStatus cacheParameterGroup = _cacheCluster.getCacheParameterGroup();
            CacheParameterGroupStatusStaxMarshaller.getInstance().marshall(cacheParameterGroup,
                    request, prefix + ".");
        }
        if (_cacheCluster.getCacheSubnetGroupName() != null) {
            prefix = _prefix + "CacheSubnetGroupName";
            String cacheSubnetGroupName = _cacheCluster.getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (_cacheCluster.getCacheNodes() != null) {
            prefix = _prefix + "CacheNodes";
            java.util.List<CacheNode> cacheNodes = _cacheCluster.getCacheNodes();
            int cacheNodesIndex = 1;
            String cacheNodesPrefix = prefix;
            for (CacheNode cacheNodesItem : cacheNodes) {
                prefix = cacheNodesPrefix + "." + cacheNodesIndex;
                if (cacheNodesItem != null) {
                    CacheNodeStaxMarshaller.getInstance().marshall(cacheNodesItem, request,
                            prefix + ".");
                }
                cacheNodesIndex++;
            }
            prefix = cacheNodesPrefix;
        }
        if (_cacheCluster.getAutoMinorVersionUpgrade() != null) {
            prefix = _prefix + "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = _cacheCluster.getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (_cacheCluster.getSecurityGroups() != null) {
            prefix = _prefix + "SecurityGroups";
            java.util.List<SecurityGroupMembership> securityGroups = _cacheCluster
                    .getSecurityGroups();
            int securityGroupsIndex = 1;
            String securityGroupsPrefix = prefix;
            for (SecurityGroupMembership securityGroupsItem : securityGroups) {
                prefix = securityGroupsPrefix + ".member." + securityGroupsIndex;
                if (securityGroupsItem != null) {
                    SecurityGroupMembershipStaxMarshaller.getInstance().marshall(
                            securityGroupsItem, request, prefix + ".");
                }
                securityGroupsIndex++;
            }
            prefix = securityGroupsPrefix;
        }
        if (_cacheCluster.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _cacheCluster.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_cacheCluster.getSnapshotRetentionLimit() != null) {
            prefix = _prefix + "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = _cacheCluster.getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (_cacheCluster.getSnapshotWindow() != null) {
            prefix = _prefix + "SnapshotWindow";
            String snapshotWindow = _cacheCluster.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (_cacheCluster.getAuthTokenEnabled() != null) {
            prefix = _prefix + "AuthTokenEnabled";
            Boolean authTokenEnabled = _cacheCluster.getAuthTokenEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(authTokenEnabled));
        }
        if (_cacheCluster.getAuthTokenLastModifiedDate() != null) {
            prefix = _prefix + "AuthTokenLastModifiedDate";
            java.util.Date authTokenLastModifiedDate = _cacheCluster.getAuthTokenLastModifiedDate();
            request.addParameter(prefix, StringUtils.fromDate(authTokenLastModifiedDate));
        }
        if (_cacheCluster.getTransitEncryptionEnabled() != null) {
            prefix = _prefix + "TransitEncryptionEnabled";
            Boolean transitEncryptionEnabled = _cacheCluster.getTransitEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(transitEncryptionEnabled));
        }
        if (_cacheCluster.getAtRestEncryptionEnabled() != null) {
            prefix = _prefix + "AtRestEncryptionEnabled";
            Boolean atRestEncryptionEnabled = _cacheCluster.getAtRestEncryptionEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(atRestEncryptionEnabled));
        }
    }

    private static CacheClusterStaxMarshaller instance;

    public static CacheClusterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheClusterStaxMarshaller();
        return instance;
    }
}
