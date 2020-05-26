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
 * StAX marshaller for POJO NodeGroup
 */
class NodeGroupStaxMarshaller {

    public void marshall(NodeGroup _nodeGroup, Request<?> request, String _prefix) {
        String prefix;
        if (_nodeGroup.getNodeGroupId() != null) {
            prefix = _prefix + "NodeGroupId";
            String nodeGroupId = _nodeGroup.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (_nodeGroup.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _nodeGroup.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_nodeGroup.getPrimaryEndpoint() != null) {
            prefix = _prefix + "PrimaryEndpoint";
            Endpoint primaryEndpoint = _nodeGroup.getPrimaryEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(primaryEndpoint, request, prefix + ".");
        }
        if (_nodeGroup.getReaderEndpoint() != null) {
            prefix = _prefix + "ReaderEndpoint";
            Endpoint readerEndpoint = _nodeGroup.getReaderEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(readerEndpoint, request, prefix + ".");
        }
        if (_nodeGroup.getSlots() != null) {
            prefix = _prefix + "Slots";
            String slots = _nodeGroup.getSlots();
            request.addParameter(prefix, StringUtils.fromString(slots));
        }
        if (_nodeGroup.getNodeGroupMembers() != null) {
            prefix = _prefix + "NodeGroupMembers";
            java.util.List<NodeGroupMember> nodeGroupMembers = _nodeGroup.getNodeGroupMembers();
            int nodeGroupMembersIndex = 1;
            String nodeGroupMembersPrefix = prefix;
            for (NodeGroupMember nodeGroupMembersItem : nodeGroupMembers) {
                prefix = nodeGroupMembersPrefix + "." + nodeGroupMembersIndex;
                if (nodeGroupMembersItem != null) {
                    NodeGroupMemberStaxMarshaller.getInstance().marshall(nodeGroupMembersItem,
                            request, prefix + ".");
                }
                nodeGroupMembersIndex++;
            }
            prefix = nodeGroupMembersPrefix;
        }
    }

    private static NodeGroupStaxMarshaller instance;

    public static NodeGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupStaxMarshaller();
        return instance;
    }
}
