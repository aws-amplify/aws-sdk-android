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
 * StAX marshaller for POJO CacheParameterGroup
 */
class CacheParameterGroupStaxMarshaller {

    public void marshall(CacheParameterGroup _cacheParameterGroup, Request<?> request,
            String _prefix) {
        String prefix;
        if (_cacheParameterGroup.getCacheParameterGroupName() != null) {
            prefix = _prefix + "CacheParameterGroupName";
            String cacheParameterGroupName = _cacheParameterGroup.getCacheParameterGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupName));
        }
        if (_cacheParameterGroup.getCacheParameterGroupFamily() != null) {
            prefix = _prefix + "CacheParameterGroupFamily";
            String cacheParameterGroupFamily = _cacheParameterGroup.getCacheParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupFamily));
        }
        if (_cacheParameterGroup.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _cacheParameterGroup.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_cacheParameterGroup.getIsGlobal() != null) {
            prefix = _prefix + "IsGlobal";
            Boolean isGlobal = _cacheParameterGroup.getIsGlobal();
            request.addParameter(prefix, StringUtils.fromBoolean(isGlobal));
        }
    }

    private static CacheParameterGroupStaxMarshaller instance;

    public static CacheParameterGroupStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheParameterGroupStaxMarshaller();
        return instance;
    }
}
