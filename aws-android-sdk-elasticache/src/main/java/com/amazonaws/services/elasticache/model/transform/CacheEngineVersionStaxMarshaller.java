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
 * StAX marshaller for POJO CacheEngineVersion
 */
class CacheEngineVersionStaxMarshaller {

    public void marshall(CacheEngineVersion _cacheEngineVersion, Request<?> request, String _prefix) {
        String prefix;
        if (_cacheEngineVersion.getEngine() != null) {
            prefix = _prefix + "Engine";
            String engine = _cacheEngineVersion.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (_cacheEngineVersion.getEngineVersion() != null) {
            prefix = _prefix + "EngineVersion";
            String engineVersion = _cacheEngineVersion.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (_cacheEngineVersion.getCacheParameterGroupFamily() != null) {
            prefix = _prefix + "CacheParameterGroupFamily";
            String cacheParameterGroupFamily = _cacheEngineVersion.getCacheParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupFamily));
        }
        if (_cacheEngineVersion.getCacheEngineDescription() != null) {
            prefix = _prefix + "CacheEngineDescription";
            String cacheEngineDescription = _cacheEngineVersion.getCacheEngineDescription();
            request.addParameter(prefix, StringUtils.fromString(cacheEngineDescription));
        }
        if (_cacheEngineVersion.getCacheEngineVersionDescription() != null) {
            prefix = _prefix + "CacheEngineVersionDescription";
            String cacheEngineVersionDescription = _cacheEngineVersion
                    .getCacheEngineVersionDescription();
            request.addParameter(prefix, StringUtils.fromString(cacheEngineVersionDescription));
        }
    }

    private static CacheEngineVersionStaxMarshaller instance;

    public static CacheEngineVersionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheEngineVersionStaxMarshaller();
        return instance;
    }
}
