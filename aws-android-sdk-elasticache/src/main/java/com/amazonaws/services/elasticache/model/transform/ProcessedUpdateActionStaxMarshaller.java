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
 * StAX marshaller for POJO ProcessedUpdateAction
 */
class ProcessedUpdateActionStaxMarshaller {

    public void marshall(ProcessedUpdateAction _processedUpdateAction, Request<?> request,
            String _prefix) {
        String prefix;
        if (_processedUpdateAction.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _processedUpdateAction.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_processedUpdateAction.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _processedUpdateAction.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_processedUpdateAction.getServiceUpdateName() != null) {
            prefix = _prefix + "ServiceUpdateName";
            String serviceUpdateName = _processedUpdateAction.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }
        if (_processedUpdateAction.getUpdateActionStatus() != null) {
            prefix = _prefix + "UpdateActionStatus";
            String updateActionStatus = _processedUpdateAction.getUpdateActionStatus();
            request.addParameter(prefix, StringUtils.fromString(updateActionStatus));
        }
    }

    private static ProcessedUpdateActionStaxMarshaller instance;

    public static ProcessedUpdateActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ProcessedUpdateActionStaxMarshaller();
        return instance;
    }
}
