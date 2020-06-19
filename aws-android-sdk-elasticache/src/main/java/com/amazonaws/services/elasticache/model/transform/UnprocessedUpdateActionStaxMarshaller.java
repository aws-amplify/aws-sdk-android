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
 * StAX marshaller for POJO UnprocessedUpdateAction
 */
class UnprocessedUpdateActionStaxMarshaller {

    public void marshall(UnprocessedUpdateAction _unprocessedUpdateAction, Request<?> request,
            String _prefix) {
        String prefix;
        if (_unprocessedUpdateAction.getReplicationGroupId() != null) {
            prefix = _prefix + "ReplicationGroupId";
            String replicationGroupId = _unprocessedUpdateAction.getReplicationGroupId();
            request.addParameter(prefix, StringUtils.fromString(replicationGroupId));
        }
        if (_unprocessedUpdateAction.getCacheClusterId() != null) {
            prefix = _prefix + "CacheClusterId";
            String cacheClusterId = _unprocessedUpdateAction.getCacheClusterId();
            request.addParameter(prefix, StringUtils.fromString(cacheClusterId));
        }
        if (_unprocessedUpdateAction.getServiceUpdateName() != null) {
            prefix = _prefix + "ServiceUpdateName";
            String serviceUpdateName = _unprocessedUpdateAction.getServiceUpdateName();
            request.addParameter(prefix, StringUtils.fromString(serviceUpdateName));
        }
        if (_unprocessedUpdateAction.getErrorType() != null) {
            prefix = _prefix + "ErrorType";
            String errorType = _unprocessedUpdateAction.getErrorType();
            request.addParameter(prefix, StringUtils.fromString(errorType));
        }
        if (_unprocessedUpdateAction.getErrorMessage() != null) {
            prefix = _prefix + "ErrorMessage";
            String errorMessage = _unprocessedUpdateAction.getErrorMessage();
            request.addParameter(prefix, StringUtils.fromString(errorMessage));
        }
    }

    private static UnprocessedUpdateActionStaxMarshaller instance;

    public static UnprocessedUpdateActionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new UnprocessedUpdateActionStaxMarshaller();
        return instance;
    }
}
