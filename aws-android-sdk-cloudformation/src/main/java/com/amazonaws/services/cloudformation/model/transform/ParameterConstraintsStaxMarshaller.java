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
 * StAX marshaller for POJO ParameterConstraints
 */
class ParameterConstraintsStaxMarshaller {

    public void marshall(ParameterConstraints _parameterConstraints, Request<?> request,
            String _prefix) {
        String prefix;
        if (_parameterConstraints.getAllowedValues() != null) {
            prefix = _prefix + "AllowedValues";
            java.util.List<String> allowedValues = _parameterConstraints.getAllowedValues();
            int allowedValuesIndex = 1;
            String allowedValuesPrefix = prefix;
            for (String allowedValuesItem : allowedValues) {
                prefix = allowedValuesPrefix + ".member." + allowedValuesIndex;
                if (allowedValuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(allowedValuesItem));
                }
                allowedValuesIndex++;
            }
            prefix = allowedValuesPrefix;
        }
    }

    private static ParameterConstraintsStaxMarshaller instance;

    public static ParameterConstraintsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ParameterConstraintsStaxMarshaller();
        return instance;
    }
}
