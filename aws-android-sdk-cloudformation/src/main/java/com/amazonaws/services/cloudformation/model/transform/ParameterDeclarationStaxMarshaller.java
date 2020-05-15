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
 * StAX marshaller for POJO ParameterDeclaration
 */
class ParameterDeclarationStaxMarshaller {

    public void marshall(ParameterDeclaration _parameterDeclaration, Request<?> request,
            String _prefix) {
        String prefix;
        if (_parameterDeclaration.getParameterKey() != null) {
            prefix = _prefix + "ParameterKey";
            String parameterKey = _parameterDeclaration.getParameterKey();
            request.addParameter(prefix, StringUtils.fromString(parameterKey));
        }
        if (_parameterDeclaration.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _parameterDeclaration.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_parameterDeclaration.getParameterType() != null) {
            prefix = _prefix + "ParameterType";
            String parameterType = _parameterDeclaration.getParameterType();
            request.addParameter(prefix, StringUtils.fromString(parameterType));
        }
        if (_parameterDeclaration.getNoEcho() != null) {
            prefix = _prefix + "NoEcho";
            Boolean noEcho = _parameterDeclaration.getNoEcho();
            request.addParameter(prefix, StringUtils.fromBoolean(noEcho));
        }
        if (_parameterDeclaration.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _parameterDeclaration.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
        if (_parameterDeclaration.getParameterConstraints() != null) {
            prefix = _prefix + "ParameterConstraints";
            ParameterConstraints parameterConstraints = _parameterDeclaration
                    .getParameterConstraints();
            ParameterConstraintsStaxMarshaller.getInstance().marshall(parameterConstraints,
                    request, prefix + ".");
        }
    }

    private static ParameterDeclarationStaxMarshaller instance;

    public static ParameterDeclarationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterDeclarationStaxMarshaller();
        return instance;
    }
}
