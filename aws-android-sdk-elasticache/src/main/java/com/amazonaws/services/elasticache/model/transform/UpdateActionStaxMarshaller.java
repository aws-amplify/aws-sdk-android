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
 * StAX marshaller for POJO UpdateAction
 */
class UpdateActionStaxMarshaller {

    public void marshall(UpdateAction _updateAction, Request<?> request, String _prefix) {
        String prefix;
        if (_updateAction.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _updateAction.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_updateAction.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _updateAction.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_updateAction.getServiceUpdateName() != null) {
            prefix = _prefix + "ServiceUpdateName";
            String serviceUpdateName = _updateAction.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }
        if (_updateAction.getServiceUpdateReleaseDate() != null) {
            prefix = _prefix + "ServiceUpdateReleaseDate";
            java.util.Date serviceUpdateReleaseDate = _updateAction.getServiceUpdateReleaseDate();
            request.addParameter(prefix, StringUtils.fromDate(serviceUpdateReleaseDate));
        }
        if (_updateAction.getServiceUpdateSeverity() != null) {
            prefix = _prefix + "ServiceUpdateSeverity";
            String serviceUpdateSeverity = _updateAction.getServiceUpdateSeverity();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateSeverity));
        }
        if (_updateAction.getServiceUpdateStatus() != null) {
            prefix = _prefix + "ServiceUpdateStatus";
            String serviceUpdateStatus = _updateAction.getServiceUpdateStatus();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateStatus));
        }
        if (_updateAction.getServiceUpdateRecommendedApplyByDate() != null) {
            prefix = _prefix + "ServiceUpdateRecommendedApplyByDate";
            java.util.Date serviceUpdateRecommendedApplyByDate = _updateAction
                    .getServiceUpdateRecommendedApplyByDate();
            request.addParameter(prefix, StringUtils.fromDate(serviceUpdateRecommendedApplyByDate));
        }
        if (_updateAction.getServiceUpdateType() != null) {
            prefix = _prefix + "ServiceUpdateType";
            String serviceUpdateType = _updateAction.getServiceUpdateType();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateType));
        }
        if (_updateAction.getUpdateActionAvailableDate() != null) {
            prefix = _prefix + "UpdateActionAvailableDate";
            java.util.Date updateActionAvailableDate = _updateAction.getUpdateActionAvailableDate();
            request.addParameter(prefix, StringUtils.fromDate(updateActionAvailableDate));
        }
        if (_updateAction.getUpdateActionStatus() != null) {
            prefix = _prefix + "UpdateActionStatus";
            String updateActionStatus = _updateAction.getUpdateActionStatus();
            request.addParameter(prefix, StringUtils.fromString(updateActionStatus));
        }
        if (_updateAction.getNodesUpdated() != null) {
            prefix = _prefix + "NodesUpdated";
            String nodesUpdated = _updateAction.getNodesUpdated();
            request.addParameter(prefix, StringUtils.fromString(nodesUpdated));
        }
        if (_updateAction.getUpdateActionStatusModifiedDate() != null) {
            prefix = _prefix + "UpdateActionStatusModifiedDate";
            java.util.Date updateActionStatusModifiedDate = _updateAction
                    .getUpdateActionStatusModifiedDate();
            request.addParameter(prefix, StringUtils.fromDate(updateActionStatusModifiedDate));
        }
        if (_updateAction.getSlaMet() != null) {
            prefix = _prefix + "SlaMet";
            String slaMet = _updateAction.getSlaMet();
            request.addParameter(prefix, StringUtils.fromString(slaMet));
        }
        if (_updateAction.getNodeGroupUpdateStatus() != null) {
            prefix = _prefix + "NodeGroupUpdateStatus";
            java.util.List<NodeGroupUpdateStatus> nodeGroupUpdateStatus = _updateAction
                    .getNodeGroupUpdateStatus();
            int nodeGroupUpdateStatusIndex = 1;
            String nodeGroupUpdateStatusPrefix = prefix;
            for (NodeGroupUpdateStatus nodeGroupUpdateStatusItem : nodeGroupUpdateStatus) {
                prefix = nodeGroupUpdateStatusPrefix + "." + nodeGroupUpdateStatusIndex;
                if (nodeGroupUpdateStatusItem != null) {
                    NodeGroupUpdateStatusStaxMarshaller.getInstance().marshall(
                            nodeGroupUpdateStatusItem, request, prefix + ".");
                }
                nodeGroupUpdateStatusIndex++;
            }
            prefix = nodeGroupUpdateStatusPrefix;
        }
        if (_updateAction.getCacheNodeUpdateStatus() != null) {
            prefix = _prefix + "CacheNodeUpdateStatus";
            java.util.List<CacheNodeUpdateStatus> cacheNodeUpdateStatus = _updateAction
                    .getCacheNodeUpdateStatus();
            int cacheNodeUpdateStatusIndex = 1;
            String cacheNodeUpdateStatusPrefix = prefix;
            for (CacheNodeUpdateStatus cacheNodeUpdateStatusItem : cacheNodeUpdateStatus) {
                prefix = cacheNodeUpdateStatusPrefix + "." + cacheNodeUpdateStatusIndex;
                if (cacheNodeUpdateStatusItem != null) {
                    CacheNodeUpdateStatusStaxMarshaller.getInstance().marshall(
                            cacheNodeUpdateStatusItem, request, prefix + ".");
                }
                cacheNodeUpdateStatusIndex++;
            }
            prefix = cacheNodeUpdateStatusPrefix;
        }
        if (_updateAction.getEstimatedUpdateTime() != null) {
            prefix = _prefix + "EstimatedUpdateTime";
            String estimatedUpdateTime = _updateAction.getEstimatedUpdateTime();
            request.addParameter(prefix, StringUtils.fromString(estimatedUpdateTime));
        }
        if (_updateAction.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _updateAction.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
    }

    private static UpdateActionStaxMarshaller instance;

    public static UpdateActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateActionStaxMarshaller();
        return instance;
    }
}
