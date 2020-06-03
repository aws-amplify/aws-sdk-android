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
 * StAX marshaller for POJO CacheNodeTypeSpecificValue
 */
class CacheNodeTypeSpecificValueStaxMarshaller {

    public void marshall(CacheNodeTypeSpecificValue _cacheNodeTypeSpecificValue,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cacheNodeTypeSpecificValue.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _cacheNodeTypeSpecificValue.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_cacheNodeTypeSpecificValue.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _cacheNodeTypeSpecificValue.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
    }

    private static CacheNodeTypeSpecificValueStaxMarshaller instance;

    public static CacheNodeTypeSpecificValueStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheNodeTypeSpecificValueStaxMarshaller();
        return instance;
    }
}
