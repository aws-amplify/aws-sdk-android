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
 * StAX marshaller for POJO NodeGroupMember
 */
class NodeGroupMemberStaxMarshaller {

    public void marshall(NodeGroupMember _nodeGroupMember, Request<?> request, String _prefix) {
        String prefix;
        if (_nodeGroupMember.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _nodeGroupMember.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_nodeGroupMember.getCacheNodeId() != null) {
            prefix = _prefix + "CacheNodeId";
            String cacheNodeId = _nodeGroupMember.getCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeId));
        }
        if (_nodeGroupMember.getReadEndpoint() != null) {
            prefix = _prefix + "ReadEndpoint";
            Endpoint readEndpoint = _nodeGroupMember.getReadEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(readEndpoint, request, prefix + ".");
        }
        if (_nodeGroupMember.getPreferredAvailabilityZone() != null) {
            prefix = _prefix + "PreferredAvailabilityZone";
            String preferredAvailabilityZone = _nodeGroupMember.getPreferredAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(preferredAvailabilityZone));
        }
        if (_nodeGroupMember.getCurrentRole() != null) {
            prefix = _prefix + "CurrentRole";
            String currentRole = _nodeGroupMember.getCurrentRole();
            request.addParameter(prefix, StringUtils.fromString(currentRole));
        }
    }

    private static NodeGroupMemberStaxMarshaller instance;

    public static NodeGroupMemberStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeGroupMemberStaxMarshaller();
        return instance;
    }
}
