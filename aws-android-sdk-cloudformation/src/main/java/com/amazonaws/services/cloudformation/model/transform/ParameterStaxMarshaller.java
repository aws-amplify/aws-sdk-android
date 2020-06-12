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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Parameter
 */
class ParameterStaxMarshaller {

    public void marshall(Parameter _parameter, Request<?> request, String _prefix) {
        String prefix;
        if (_parameter.getParameterKey() != null) {
            prefix = _prefix + "ParameterKey";
            String parameterKey = _parameter.getParameterKey();
            request.addParameter(prefix, StringUtils.fromString(parameterKey));
        }
        if (_parameter.getParameterValue() != null) {
            prefix = _prefix + "ParameterValue";
            String parameterValue = _parameter.getParameterValue();
            request.addParameter(prefix, StringUtils.fromString(parameterValue));
        }
        if (_parameter.getUsePreviousValue() != null) {
            prefix = _prefix + "UsePreviousValue";
            Boolean usePreviousValue = _parameter.getUsePreviousValue();
            request.addParameter(prefix, StringUtils.fromBoolean(usePreviousValue));
        }
        if (_parameter.getResolvedValue() != null) {
            prefix = _prefix + "ResolvedValue";
            String resolvedValue = _parameter.getResolvedValue();
            request.addParameter(prefix, StringUtils.fromString(resolvedValue));
        }
    }

    private static ParameterStaxMarshaller instance;

    public static ParameterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterStaxMarshaller();
        return instance;
    }
}
