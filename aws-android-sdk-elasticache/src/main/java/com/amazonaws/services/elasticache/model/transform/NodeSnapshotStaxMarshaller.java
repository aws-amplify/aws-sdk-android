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
 * StAX marshaller for POJO NodeSnapshot
 */
class NodeSnapshotStaxMarshaller {

    public void marshall(NodeSnapshot _nodeSnapshot, Request<?> request, String _prefix) {
        String prefix;
        if (_nodeSnapshot.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _nodeSnapshot.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_nodeSnapshot.getNodeGroupId() != null) {
            prefix = _prefix + "NodeGroupId";
            String nodeGroupId = _nodeSnapshot.getNodeGroupId();
            request.addParameter(prefix, StringUtils.fromString(nodeGroupId));
        }
        if (_nodeSnapshot.getCacheNodeId() != null) {
            prefix = _prefix + "CacheNodeId";
            String cacheNodeId = _nodeSnapshot.getCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeId));
        }
        if (_nodeSnapshot.getNodeGroupConfiguration() != null) {
            prefix = _prefix + "NodeGroupConfiguration";
            NodeGroupConfiguration nodeGroupConfiguration = _nodeSnapshot
                    .getNodeGroupConfiguration();
            NodeGroupConfigurationStaxMarshaller.getInstance().marshall(nodeGroupConfiguration,
                    request, prefix + ".");
        }
        if (_nodeSnapshot.getCacheSize() != null) {
            prefix = _prefix + "CacheSize";
            String cacheSize = _nodeSnapshot.getCacheSize();
            request.addParameter(prefix, StringUtils.fromString(cacheSize));
        }
        if (_nodeSnapshot.getCacheNodeCreateTime() != null) {
            prefix = _prefix + "CacheNodeCreateTime";
            java.util.Date cacheNodeCreateTime = _nodeSnapshot.getCacheNodeCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(cacheNodeCreateTime));
        }
        if (_nodeSnapshot.getSnapshotCreateTime() != null) {
            prefix = _prefix + "SnapshotCreateTime";
            java.util.Date snapshotCreateTime = _nodeSnapshot.getSnapshotCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(snapshotCreateTime));
        }
    }

    private static NodeSnapshotStaxMarshaller instance;

    public static NodeSnapshotStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeSnapshotStaxMarshaller();
        return instance;
    }
}
