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
 * StAX marshaller for POJO EngineDefaults
 */
class EngineDefaultsStaxMarshaller {

    public void marshall(EngineDefaults _engineDefaults, Request<?> request, String _prefix) {
        String prefix;
        if (_engineDefaults.getCacheParameterGroupFamily() != null) {
            prefix = _prefix + "CacheParameterGroupFamily";
            String cacheParameterGroupFamily = _engineDefaults.getCacheParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(cacheParameterGroupFamily));
        }
        if (_engineDefaults.getMarker() != null) {
            prefix = _prefix + "Marker";
            String marker = _engineDefaults.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (_engineDefaults.getParameters() != null) {
            prefix = _prefix + "Parameters";
            java.util.List<Parameter> parameters = _engineDefaults.getParameters();
            int parametersIndex = 1;
            String parametersPrefix = prefix;
            for (Parameter parametersItem : parameters) {
                prefix = parametersPrefix + "." + parametersIndex;
                if (parametersItem != null) {
                    ParameterStaxMarshaller.getInstance().marshall(parametersItem, request,
                            prefix + ".");
                }
                parametersIndex++;
            }
            prefix = parametersPrefix;
        }
        if (_engineDefaults.getCacheNodeTypeSpecificParameters() != null) {
            prefix = _prefix + "CacheNodeTypeSpecificParameters";
            java.util.List<CacheNodeTypeSpecificParameter> cacheNodeTypeSpecificParameters = _engineDefaults
                    .getCacheNodeTypeSpecificParameters();
            int cacheNodeTypeSpecificParametersIndex = 1;
            String cacheNodeTypeSpecificParametersPrefix = prefix;
            for (CacheNodeTypeSpecificParameter cacheNodeTypeSpecificParametersItem : cacheNodeTypeSpecificParameters) {
                prefix = cacheNodeTypeSpecificParametersPrefix + "."
                        + cacheNodeTypeSpecificParametersIndex;
                if (cacheNodeTypeSpecificParametersItem != null) {
                    CacheNodeTypeSpecificParameterStaxMarshaller.getInstance().marshall(
                            cacheNodeTypeSpecificParametersItem, request, prefix + ".");
                }
                cacheNodeTypeSpecificParametersIndex++;
            }
            prefix = cacheNodeTypeSpecificParametersPrefix;
        }
    }

    private static EngineDefaultsStaxMarshaller instance;

    public static EngineDefaultsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EngineDefaultsStaxMarshaller();
        return instance;
    }
}
