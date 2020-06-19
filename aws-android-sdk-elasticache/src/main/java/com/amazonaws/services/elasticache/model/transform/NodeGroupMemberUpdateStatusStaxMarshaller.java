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
 * StAX marshaller for POJO NodeGroupMemberUpdateStatus
 */
class NodeGroupMemberUpdateStatusStaxMarshaller {

    public void marshall(NodeGroupMemberUpdateStatus _nodeGroupMemberUpdateStatus,
            Request<?> request, String _prefix) {
        String prefix;
        if (_nodeGroupMemberUpdateStatus.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _nodeGroupMemberUpdateStatus.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_nodeGroupMemberUpdateStatus.getCacheNodeId() != null) {
            prefix = _prefix + "CacheNodeId";
            String cacheNodeId = _nodeGroupMemberUpdateStatus.getCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeId));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeUpdateStatus() != null) {
            prefix = _prefix + "NodeUpdateStatus";
            String nodeUpdateStatus = _nodeGroupMemberUpdateStatus.getNodeUpdateStatus();
            request.addParameter(prefix, StringUtils.fromString(nodeUpdateStatus));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeDeletionDate() != null) {
            prefix = _prefix + "NodeDeletionDate";
            java.util.Date nodeDeletionDate = _nodeGroupMemberUpdateStatus.getNodeDeletionDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeDeletionDate));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeUpdateStartDate() != null) {
            prefix = _prefix + "NodeUpdateStartDate";
            java.util.Date nodeUpdateStartDate = _nodeGroupMemberUpdateStatus
                    .getNodeUpdateStartDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateStartDate));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeUpdateEndDate() != null) {
            prefix = _prefix + "NodeUpdateEndDate";
            java.util.Date nodeUpdateEndDate = _nodeGroupMemberUpdateStatus.getNodeUpdateEndDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateEndDate));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeUpdateInitiatedBy() != null) {
            prefix = _prefix + "NodeUpdateInitiatedBy";
            String nodeUpdateInitiatedBy = _nodeGroupMemberUpdateStatus.getNodeUpdateInitiatedBy();
            request.addParameter(prefix, StringUtils.fromString(nodeUpdateInitiatedBy));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeUpdateInitiatedDate() != null) {
            prefix = _prefix + "NodeUpdateInitiatedDate";
            java.util.Date nodeUpdateInitiatedDate = _nodeGroupMemberUpdateStatus
                    .getNodeUpdateInitiatedDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateInitiatedDate));
        }
        if (_nodeGroupMemberUpdateStatus.getNodeUpdateStatusModifiedDate() != null) {
            prefix = _prefix + "NodeUpdateStatusModifiedDate";
            java.util.Date nodeUpdateStatusModifiedDate = _nodeGroupMemberUpdateStatus
                    .getNodeUpdateStatusModifiedDate();
            request.addParameter(prefix, StringUtils.fromDate(nodeUpdateStatusModifiedDate));
        }
    }

    private static NodeGroupMemberUpdateStatusStaxMarshaller instance;

    public static NodeGroupMemberUpdateStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupMemberUpdateStatusStaxMarshaller();
        return instance;
    }
}
