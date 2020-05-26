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
 * StAX marshaller for POJO CacheNodeTypeSpecificParameter
 */
class CacheNodeTypeSpecificParameterStaxMarshaller {

    public void marshall(CacheNodeTypeSpecificParameter _cacheNodeTypeSpecificParameter,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cacheNodeTypeSpecificParameter.getParameterName() != null) {
            prefix = _prefix + "ParameterName";
            String parameterName = _cacheNodeTypeSpecificParameter.getParameterName();
            request.addParameter(prefix, StringUtils.fromString(parameterName));
        }
        if (_cacheNodeTypeSpecificParameter.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _cacheNodeTypeSpecificParameter.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_cacheNodeTypeSpecificParameter.getSource() != null) {
            prefix = _prefix + "Source";
            String source = _cacheNodeTypeSpecificParameter.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (_cacheNodeTypeSpecificParameter.getDataType() != null) {
            prefix = _prefix + "DataType";
            String dataType = _cacheNodeTypeSpecificParameter.getDataType();
            request.addParameter(prefix, StringUtils.fromString(dataType));
        }
        if (_cacheNodeTypeSpecificParameter.getAllowedValues() != null) {
            prefix = _prefix + "AllowedValues";
            String allowedValues = _cacheNodeTypeSpecificParameter.getAllowedValues();
            request.addParameter(prefix, StringUtils.fromString(allowedValues));
        }
        if (_cacheNodeTypeSpecificParameter.getIsModifiable() != null) {
            prefix = _prefix + "IsModifiable";
            Boolean isModifiable = _cacheNodeTypeSpecificParameter.getIsModifiable();
            request.addParameter(prefix, StringUtils.fromBoolean(isModifiable));
        }
        if (_cacheNodeTypeSpecificParameter.getMinimumEngineVersion() != null) {
            prefix = _prefix + "MinimumEngineVersion";
            String minimumEngineVersion = _cacheNodeTypeSpecificParameter.getMinimumEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(minimumEngineVersion));
        }
        if (_cacheNodeTypeSpecificParameter.getCacheNodeTypeSpecificValues() != null) {
            prefix = _prefix + "CacheNodeTypeSpecificValues";
            java.util.List<CacheNodeTypeSpecificValue> cacheNodeTypeSpecificValues = _cacheNodeTypeSpecificParameter
                    .getCacheNodeTypeSpecificValues();
            int cacheNodeTypeSpecificValuesIndex = 1;
            String cacheNodeTypeSpecificValuesPrefix = prefix;
            for (CacheNodeTypeSpecificValue cacheNodeTypeSpecificValuesItem : cacheNodeTypeSpecificValues) {
                prefix = cacheNodeTypeSpecificValuesPrefix + "." + cacheNodeTypeSpecificValuesIndex;
                if (cacheNodeTypeSpecificValuesItem != null) {
                    CacheNodeTypeSpecificValueStaxMarshaller.getInstance().marshall(
                            cacheNodeTypeSpecificValuesItem, request, prefix + ".");
                }
                cacheNodeTypeSpecificValuesIndex++;
            }
            prefix = cacheNodeTypeSpecificValuesPrefix;
        }
        if (_cacheNodeTypeSpecificParameter.getChangeType() != null) {
            prefix = _prefix + "ChangeType";
            String changeType = _cacheNodeTypeSpecificParameter.getChangeType();
            request.addParameter(prefix, StringUtils.fromString(changeType));
        }
    }

    private static CacheNodeTypeSpecificParameterStaxMarshaller instance;

    public static CacheNodeTypeSpecificParameterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CacheNodeTypeSpecificParameterStaxMarshaller();
        return instance;
    }
}
