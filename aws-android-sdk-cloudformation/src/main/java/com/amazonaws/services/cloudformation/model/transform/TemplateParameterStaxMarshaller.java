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
 * StAX marshaller for POJO TemplateParameter
 */
class TemplateParameterStaxMarshaller {

    public void marshall(TemplateParameter _templateParameter, Request<?> request, String _prefix) {
        String prefix;
        if (_templateParameter.getParameterKey() != null) {
            prefix = _prefix + "ParameterKey";
            String parameterKey = _templateParameter.getParameterKey();
            request.addParameter(prefix, StringUtils.fromString(parameterKey));
        }
        if (_templateParameter.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _templateParameter.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_templateParameter.getNoEcho() != null) {
            prefix = _prefix + "NoEcho";
            Boolean noEcho = _templateParameter.getNoEcho();
            request.addParameter(prefix, StringUtils.fromBoolean(noEcho));
        }
        if (_templateParameter.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _templateParameter.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static TemplateParameterStaxMarshaller instance;

    public static TemplateParameterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TemplateParameterStaxMarshaller();
        return instance;
    }
}
