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
 * StAX request marshaller for ModifyReplicationGroupRequest
 */
public class ModifyReplicationGroupRequestMarshaller implements
        Marshaller<Request<ModifyReplicationGroupRequest>, ModifyReplicationGroupRequest> {

    public Request<ModifyReplicationGroupRequest> marshall(
            ModifyReplicationGroupRequest modifyReplicationGroupRequest) {
        if (modifyReplicationGroupRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ModifyReplicationGroupRequest)");
        }

        Request<ModifyReplicationGroupRequest> request = new DefaultRequest<ModifyReplicationGroupRequest>(
                modifyReplicationGroupRequest, "AmazonElastiCache");
        request.addParameter("Action", "ModifyReplicationGroup");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (modifyReplicationGroupRequest.getReplicationGroupId() != null) {
            prefix = "ReplicationGroupId";
            String replicationGroupId = modifyReplicationGroupRequest.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (modifyReplicationGroupRequest.getReplicationGroupDescription() != null) {
            prefix = "ReplicationGroupDescription";
            String replicationGroupDescription = modifyReplicationGroupRequest
                    .getReplicationGroupDescription();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupDescription));
        }
        if (modifyReplicationGroupRequest.getPrimaryClusterId() != null) {
            prefix = "PrimaryClusterId";
            String primaryClusterId = modifyReplicationGroupRequest.getPrimaryClusterId();
            request.addParameter(prefix, StringUtils.fromString(primaryClusterId));
        }
        if (modifyReplicationGroupRequest.getSnapshottingClusterId() != null) {
            prefix = "SnapshottingClusterId";
            String snapshottingClusterId = modifyReplicationGroupRequest.getSnapshottingClusterId();
            request.addParameter(prefix, StringUtils.fromString(snapshottingClusterId));
        }
        if (modifyReplicationGroupRequest.getAutomaticFailoverEnabled() != null) {
            prefix = "AutomaticFailoverEnabled";
            Boolean automaticFailoverEnabled = modifyReplicationGroupRequest
                    .getAutomaticFailoverEnabled();
            request.addParameter(prefix, StringUtils.fromBoolean(automaticFailoverEnabled));
        }
        if (modifyReplicationGroupRequest.getNodeGroupId() != null) {
            prefix = "NodeGroupId";
            String nodeGroupId = modifyReplicationGroupRequest.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (modifyReplicationGroupRequest.getCacheSecurityGroupNames() != null) {
            prefix = "CacheSecurityGroupNames";
            java.util.List<String> cacheSecurityGroupNames = modifyReplicationGroupRequest
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
        if (modifyReplicationGroupRequest.getSecurityGroupIds() != null) {
            prefix = "SecurityGroupIds";
            java.util.List<String> securityGroupIds = modifyReplicationGroupRequest
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
        if (modifyReplicationGroupRequest.getPreferredMaintenanceWindow() != null) {
            prefix = "PreferredMaintenanceWindow";
            String preferredMaintenanceWindow = modifyReplicationGroupRequest
                    .getPreferredMaintenanceWindow();
            request.addParameter(prefix, StringUtils.fromString(preferredMaintenanceWindow));
        }
        if (modifyReplicationGroupRequest.getNotificationTopicArn() != null) {
            prefix = "NotificationTopicArn";
            String notificationTopicArn = modifyReplicationGroupRequest.getNotificationTopicArn();
            request.addParameter(prefix, StringUtils.fromString(notificationTopicArn));
        }
        if (modifyReplicationGroupRequest.getCacheParameterGroupName() != null) {
            prefix = "CacheParameterGroupName";
            String cacheParameterGroupName = modifyReplicationGroupRequest
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (modifyReplicationGroupRequest.getNotificationTopicStatus() != null) {
            prefix = "NotificationTopicStatus";
            String notificationTopicStatus = modifyReplicationGroupRequest
                    .getNotificationTopicStatus();
            request.addParameter(prefix, StringUtils.fromString(notificationTopicStatus));
        }
        if (modifyReplicationGroupRequest.getApplyImmediately() != null) {
            prefix = "ApplyImmediately";
            Boolean applyImmediately = modifyReplicationGroupRequest.getApplyImmediately();
            request.addParameter(prefix, StringUtils.fromBoolean(applyImmediately));
        }
        if (modifyReplicationGroupRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = modifyReplicationGroupRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (modifyReplicationGroupRequest.getAutoMinorVersionUpgrade() != null) {
            prefix = "AutoMinorVersionUpgrade";
            Boolean autoMinorVersionUpgrade = modifyReplicationGroupRequest
                    .getAutoMinorVersionUpgrade();
            request.addParameter(prefix, StringUtils.fromBoolean(autoMinorVersionUpgrade));
        }
        if (modifyReplicationGroupRequest.getSnapshotRetentionLimit() != null) {
            prefix = "SnapshotRetentionLimit";
            Integer snapshotRetentionLimit = modifyReplicationGroupRequest
                    .getSnapshotRetentionLimit();
            request.addParameter(prefix, StringUtils.fromInteger(snapshotRetentionLimit));
        }
        if (modifyReplicationGroupRequest.getSnapshotWindow() != null) {
            prefix = "SnapshotWindow";
            String snapshotWindow = modifyReplicationGroupRequest.getSnapshotWindow();
            request.addParameter(prefix, StringUtils.fromString(snapshotWindow));
        }
        if (modifyReplicationGroupRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = modifyReplicationGroupRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (modifyReplicationGroupRequest.getAuthToken() != null) {
            prefix = "AuthToken";
            String authToken = modifyReplicationGroupRequest.getAuthToken();
            request.addParameter(prefix, StringUtils.fromString(authToken));
        }
        if (modifyReplicationGroupRequest.getAuthTokenUpdateStrategy() != null) {
            prefix = "AuthTokenUpdateStrategy";
            String authTokenUpdateStrategy = modifyReplicationGroupRequest
                    .getAuthTokenUpdateStrategy();
            request.addParameter(prefix, StringUtils.fromString(authTokenUpdateStrategy));
        }

        return request;
    }
}
