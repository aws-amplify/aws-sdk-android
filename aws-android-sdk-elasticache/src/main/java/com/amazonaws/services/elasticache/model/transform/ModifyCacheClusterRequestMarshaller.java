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
 * StAX request marshaller for ModifyCacheClusterRequest
 */
public class ModifyCacheClusterRequestMarshaller implements
        Marshaller<Request<ModifyCacheClusterRequest>, ModifyCacheClusterRequest> {

    public Request<ModifyCacheClusterRequest> marshall(
            ModifyCacheClusterRequest modifyCacheClusterRequest) {
        if (modifyCacheClusterRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyCacheClusterRequest)");
        }

        Request<ModifyCacheClusterRequest> request = new DefaultRequest<ModifyCacheClusterRequest>(
                modifyCacheClusterRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyCacheCluster");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (modifyCacheClusterRequest.getCacheClusterId() != null) {
            prefix = "CacheClusterId";
            String cacheClusterId = modifyCacheClusterRequest.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (modifyCacheClusterRequest.getNumCacheNodes() != null) {
            prefix = "NumCacheNodes";
            Integer numCacheNodes = modifyCacheClusterRequest.getNumCacheNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numCacheNodes));
        }
        if (modifyCacheClusterRequest.getCacheNodeIdsToRemove() != null) {
            prefix = "CacheNodeIdsToRemove";
            java.util.List<String> cacheNodeIdsToRemove = modifyCacheClusterRequest
                    .getCacheNodeIdsToRemove();
            int cacheNodeIdsToRemoveIndex = 1;
            String cacheNodeIdsToRemovePrefix = prefix;
            for (String cacheNodeIdsToRemoveItem : cacheNodeIdsToRemove) {
                prefix = cacheNodeIdsToRemovePrefix + "." + cacheNodeIdsToRemoveIndex;
                if (cacheNodeIdsToRemoveItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(cacheNodeIdsToRemoveItem));
                }
                cacheNodeIdsToRemoveIndex++;
            }
            prefix = cacheNodeIdsToRemovePrefix;
        }
        if (modifyCacheClusterRequest.getAZMode() != null) {
            prefix = "AZMode";
            String aZMode = modifyCacheClusterRequest.getAZMode();
            request.addParameter(prefix, StringUtils.fromString(aZMode));
        }
        if (modifyCacheClusterRequest.getNewAvailabilityZones() != null) {
            prefix = "NewAvailabilityZones";
            java.util.List<String> newAvailabilityZones = modifyCacheClusterRequest
                    .getNewAvailabilityZones();
            int newAvailabilityZonesIndex = 1;
            String newAvailabilityZonesPrefix = prefix;
            for (String newAvailabilityZonesItem : newAvailabilityZones) {
                prefix = newAvailabilityZonesPrefix + "." + newAvailabilityZonesIndex;
                if (newAvailabilityZonesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(newAvailabilityZonesItem));
                }
                newAvailabilityZonesIndex++;
            }
            prefix = newAvailabilityZonesPrefix;
        }
        if (modifyCacheClusterRequest.getCacheSecurityGroupNames() != null) {
            prefix = "CacheSecurityGroupNames";
            java.util.List<String> cacheSecurityGroupNames = modifyCacheClusterRequest
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
        if (modifyCacheClusterRequest.getSecurityGroupIds() != null) {
            prefix = "SecurityGroupIds";
            java.util.List<String> securityGroupIds = modifyCacheClusterRequest
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
        if (modifyCacheClusterRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = modifyCacheClusterRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (modifyCacheClusterRequest.getNotificationTopicArn() != null) {
            prefix = "NotificationTopicArn";
            String notificationTopicArn = modifyCacheClusterRequest.getNotificationTopicArn();
            request.addParameter(prefix, StringUtils.fromString(notificationTopicArn));
        }
        if (modifyCacheClusterRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = modifyCacheClusterRequest.getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (modifyCacheClusterRequest.getNotificationTopicStatus() != null) {
            prefix = "NotificationTopicStatus";
            String notificationTopicStatus = modifyCacheClusterRequest.getNotificationTopicStatus();
            request.addParameter(prefix, StringUtils.fromString(notificationTopicStatus));
        }
        if (modifyCacheClusterRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyCacheClusterRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }
        if (modifyCacheClusterRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = modifyCacheClusterRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (modifyCacheClusterRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = modifyCacheClusterRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (modifyCacheClusterRequest.getSnapshotRetentionLimit() != null) {
            prefix = "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = modifyCacheClusterRequest.getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (modifyCacheClusterRequest.getSnapshotWindow() != null) {
            prefix = "SnapshotWindow";
            String snapshotWindow = modifyCacheClusterRequest.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (modifyCacheClusterRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = modifyCacheClusterRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (modifyCacheClusterRequest.getAuthToken() != null) {
            prefix = "AuthToken";
            String authToken = modifyCacheClusterRequest.getAuthToken();
            request.addParameter(prefix, StringUtils.fromString(authToken));
        }
        if (modifyCacheClusterRequest.getAuthTokenUpdateStrategy() != null) {
            prefix = "AuthTokenUpdateStrategy";
            String authTokenUpdateStrategy = modifyCacheClusterRequest.getAuthTokenUpdateStrategy();
            request.addParameter(prefix, StringUtils.fromString(authTokenUpdateStrategy));
        }

        return request;
    }
}
