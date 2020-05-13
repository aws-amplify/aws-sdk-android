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
 * StAX marshaller for POJO PendingModifiedValues
 */
class PendingModifiedValuesStaxMarshaller {

    public void marshall(PendingModifiedValues _pendingModifiedValues, Request<?> request,
            String _prefix) {
        String prefix;
        if (_pendingModifiedValues.getNumCacheNodes() != null) {
            prefix = _prefix + "NumCacheNodes";
            Integer numCacheNodes = _pendingModifiedValues.getNumCacheNodes();
            request.addParameter(prefix, StringUtils.fromInteger(numCacheNodes));
        }
        if (_pendingModifiedValues.getCacheNodeIdsToRemove() != null) {
            prefix = _prefix + "CacheNodeIdsToRemove";
            java.util.List<String> cacheNodeIdsToRemove = _pendingModifiedValues
                    .getCacheNodeIdsToRemove();
            int cacheNodeIdsToRemoveIndex = 1;
            String cacheNodeIdsToRemovePrefix = prefix;
            for (String cacheNodeIdsToRemoveItem : cacheNodeIdsToRemove) {
                prefix = cacheNodeIdsToRemovePrefix + "." + cacheNodeIdsToRemoveIndex;
                if (cacheNodeIdsToRemoveItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(cacheNodeIdsToRemoveItem));
                }
                cacheNodeIdsToRemoveIndex++;
            }
            prefix = cacheNodeIdsToRemovePrefix;
        }
        if (_pendingModifiedValues.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _pendingModifiedValues.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_pendingModifiedValues.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _pendingModifiedValues.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_pendingModifiedValues.getAuthTokenStatus() != null) {
            prefix = _prefix + "AuthTokenStatus";
            String authTokenStatus = _pendingModifiedValues.getAuthTokenStatus();
            request.addParameter(prefix, StringUtils.fromString(authTokenStatus));
        }
    }

    private static PendingModifiedValuesStaxMarshaller instance;

    public static PendingModifiedValuesStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PendingModifiedValuesStaxMarshaller();
        return instance;
    }
}
