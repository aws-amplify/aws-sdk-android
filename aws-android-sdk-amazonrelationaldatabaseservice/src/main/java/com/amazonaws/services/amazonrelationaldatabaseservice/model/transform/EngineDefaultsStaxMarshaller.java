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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO EngineDefaults
 */
class EngineDefaultsStaxMarshaller {

    public void marshall(EngineDefaults _engineDefaults, Request<?> request, String _prefix) {
        String prefix;
        if (_engineDefaults.getDBParameterGroupFamily() != null) {
            prefix = _prefix + "DBParameterGroupFamily";
            String dBParameterGroupFamily = _engineDefaults.getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
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
    }

    private static EngineDefaultsStaxMarshaller instance;

    public static EngineDefaultsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EngineDefaultsStaxMarshaller();
        return instance;
    }
}
