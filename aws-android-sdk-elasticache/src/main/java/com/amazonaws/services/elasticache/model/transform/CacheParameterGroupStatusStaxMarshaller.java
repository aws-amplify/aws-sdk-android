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
 * StAX marshaller for POJO CacheParameterGroupStatus
 */
class CacheParameterGroupStatusStaxMarshaller {

    public void marshall(CacheParameterGroupStatus _cacheParameterGroupStatus, Request<?> request,
            String _prefix) {
        String prefix;
        if (_cacheParameterGroupStatus.getCacheParameterGroupName() != null) {
            prefix = _prefix + "CacheParameterGroupName";
            String cacheParameterGroupName = _cacheParameterGroupStatus
                    .getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (_cacheParameterGroupStatus.getParameterApplyStatus() != null) {
            prefix = _prefix + "ParameterApplyStatus";
            String parameterApplyStatus = _cacheParameterGroupStatus.getParameterApplyStatus();
            request.addParameter(prefix, StringUtils.fromString(parameterApplyStatus));
        }
        if (_cacheParameterGroupStatus.getCacheNodeIdsToReboot() != null) {
            prefix = _prefix + "CacheNodeIdsToReboot";
            java.util.List<String> cacheNodeIdsToReboot = _cacheParameterGroupStatus
                    .getCacheNodeIdsToReboot();
            int cacheNodeIdsToRebootIndex = 1;
            String cacheNodeIdsToRebootPrefix = prefix;
            for (String cacheNodeIdsToRebootItem : cacheNodeIdsToReboot) {
                prefix = cacheNodeIdsToRebootPrefix + "." + cacheNodeIdsToRebootIndex;
                if (cacheNodeIdsToRebootItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(cacheNodeIdsToRebootItem));
                }
                cacheNodeIdsToRebootIndex++;
            }
            prefix = cacheNodeIdsToRebootPrefix;
        }
    }

    private static CacheParameterGroupStatusStaxMarshaller instance;

    public static CacheParameterGroupStatusStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheParameterGroupStatusStaxMarshaller();
        return instance;
    }
}
