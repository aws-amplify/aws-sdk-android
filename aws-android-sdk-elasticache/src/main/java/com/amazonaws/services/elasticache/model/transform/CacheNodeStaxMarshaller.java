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
 * StAX marshaller for POJO CacheNode
 */
class CacheNodeStaxMarshaller {

    public void marshall(CacheNode _cacheNode, Request<?> request, String _prefix) {
        String prefix;
        if (_cacheNode.getCacheNodeId() != null) {
            prefix = _prefix + "CacheNodeId";
            String cacheNodeId = _cacheNode.getCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeId));
        }
        if (_cacheNode.getCacheNodeStatus() != null) {
            prefix = _prefix + "CacheNodeStatus";
            String cacheNodeStatus = _cacheNode.getCacheNodeStatus();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeStatus));
        }
        if (_cacheNode.getCacheNodeCreateTime() != null) {
            prefix = _prefix + "CacheNodeCreateTime";
            java.util.Date cacheNodeCreateTime = _cacheNode.getCacheNodeCreateTime();
            request.addParameter(prefix, StringUtils.fromDate(cacheNodeCreateTime));
        }
        if (_cacheNode.getEndpoint() != null) {
            prefix = _prefix + "Endpoint";
            Endpoint endpoint = _cacheNode.getEndpoint();
            EndpointStaxMarshaller.getInstance().marshall(endpoint, request, prefix + ".");
        }
        if (_cacheNode.getParameterGroupStatus() != null) {
            prefix = _prefix + "ParameterGroupStatus";
            String parameterGroupStatus = _cacheNode.getParameterGroupStatus();
            request.addParameter(prefix, StringUtils.fromString(parameterGroupStatus));
        }
        if (_cacheNode.getSourceCacheNodeId() != null) {
            prefix = _prefix + "SourceCacheNodeId";
            String sourceCacheNodeId = _cacheNode.getSourceCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(sourceCacheNodeId));
        }
        if (_cacheNode.getCustomerAvailabilityZone() != null) {
            prefix = _prefix + "CustomerAvailabilityZone";
            String customerAvailabilityZone = _cacheNode.getCustomerAvailabilityZone();
            request.addParameter(prefix, StringUtils.fromString(customerAvailabilityZone));
        }
    }

    private static CacheNodeStaxMarshaller instance;

    public static CacheNodeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheNodeStaxMarshaller();
        return instance;
    }
}
