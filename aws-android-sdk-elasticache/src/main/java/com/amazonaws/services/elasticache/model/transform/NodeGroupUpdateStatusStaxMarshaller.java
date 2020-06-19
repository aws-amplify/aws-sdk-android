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
 * StAX marshaller for POJO NodeGroupUpdateStatus
 */
class NodeGroupUpdateStatusStaxMarshaller {

    public void marshall(NodeGroupUpdateStatus _nodeGroupUpdateStatus, Request<?> request,
            String _prefix) {
        String prefix;
        if (_nodeGroupUpdateStatus.getNodeGroupId() != null) {
            prefix = _prefix + "NodeGroupId";
            String nodeGroupId = _nodeGroupUpdateStatus.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (_nodeGroupUpdateStatus.getNodeGroupMemberUpdateStatus() != null) {
            prefix = _prefix + "NodeGroupMemberUpdateStatus";
            java.util.List<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus = _nodeGroupUpdateStatus
                    .getNodeGroupMemberUpdateStatus();
            int nodeGroupMemberUpdateStatusIndex = 1;
            String nodeGroupMemberUpdateStatusPrefix = prefix;
            for (NodeGroupMemberUpdateStatus nodeGroupMemberUpdateStatusItem : nodeGroupMemberUpdateStatus) {
                prefix = nodeGroupMemberUpdateStatusPrefix + "." + nodeGroupMemberUpdateStatusIndex;
                if (nodeGroupMemberUpdateStatusItem != null) {
                    NodeGroupMemberUpdateStatusStaxMarshaller.getInstance().marshall(
                            nodeGroupMemberUpdateStatusItem, request, prefix + ".");
                }
                nodeGroupMemberUpdateStatusIndex++;
            }
            prefix = nodeGroupMemberUpdateStatusPrefix;
        }
    }

    private static NodeGroupUpdateStatusStaxMarshaller instance;

    public static NodeGroupUpdateStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupUpdateStatusStaxMarshaller();
        return instance;
    }
}
