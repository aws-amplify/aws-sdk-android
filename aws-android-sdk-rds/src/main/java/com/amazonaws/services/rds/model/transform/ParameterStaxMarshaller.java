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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Parameter
 */
class ParameterStaxMarshaller {

    public void marshall(Parameter _parameter, Request<?> request, String _prefix) {
        String prefix;
        if (_parameter.getParameterName() != null) {
            prefix = _prefix + "ParameterName";
            String parameterName = _parameter.getParameterName();
            request.addParameter(prefix, StringUtils.fromString(parameterName));
        }
        if (_parameter.getParameterValue() != null) {
            prefix = _prefix + "ParameterValue";
            String parameterValue = _parameter.getParameterValue();
            request.addParameter(prefix, StringUtils.fromString(parameterValue));
        }
        if (_parameter.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _parameter.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_parameter.getSource() != null) {
            prefix = _prefix + "Source";
            String source = _parameter.getSource();
            request.addParameter(prefix, StringUtils.fromString(source));
        }
        if (_parameter.getApplyType() != null) {
            prefix = _prefix + "ApplyType";
            String applyType = _parameter.getApplyType();
            request.addParameter(prefix, StringUtils.fromString(applyType));
        }
        if (_parameter.getDataType() != null) {
            prefix = _prefix + "DataType";
            String dataType = _parameter.getDataType();
            request.addParameter(prefix, StringUtils.fromString(dataType));
        }
        if (_parameter.getAllowedValues() != null) {
            prefix = _prefix + "AllowedValues";
            String allowedValues = _parameter.getAllowedValues();
            request.addParameter(prefix, StringUtils.fromString(allowedValues));
        }
        if (_parameter.getIsModifiable() != null) {
            prefix = _prefix + "IsModifiable";
            Boolean isModifiable = _parameter.getIsModifiable();
            request.addParameter(prefix, StringUtils.fromBoolean(isModifiable));
        }
        if (_parameter.getMinimumEngineVersion() != null) {
            prefix = _prefix + "MinimumEngineVersion";
            String minimumEngineVersion = _parameter.getMinimumEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(minimumEngineVersion));
        }
        if (_parameter.getApplyMethod() != null) {
            prefix = _prefix + "ApplyMethod";
            String applyMethod = _parameter.getApplyMethod();
            request.addParameter(prefix, StringUtils.fromString(applyMethod));
        }
        if (_parameter.getSupportedEngineModes() != null) {
            prefix = _prefix + "SupportedEngineModes";
            java.util.List<String> supportedEngineModes = _parameter.getSupportedEngineModes();
            int supportedEngineModesIndex = 1;
            String supportedEngineModesPrefix = prefix;
            for (String supportedEngineModesItem : supportedEngineModes) {
                prefix = supportedEngineModesPrefix + ".member." + supportedEngineModesIndex;
                if (supportedEngineModesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(supportedEngineModesItem));
                }
                supportedEngineModesIndex++;
            }
            prefix = supportedEngineModesPrefix;
        }
    }

    private static ParameterStaxMarshaller instance;

    public static ParameterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterStaxMarshaller();
        return instance;
    }
}
