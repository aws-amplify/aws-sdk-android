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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO NodeConfigurationOptionsFilter
 */
class NodeConfigurationOptionsFilterStaxMarshaller {

    public void marshall(NodeConfigurationOptionsFilter _nodeConfigurationOptionsFilter,
            Request<?> request, String _prefix) {
        String prefix;
        if (_nodeConfigurationOptionsFilter.getName() != null) {
            prefix = _prefix + "Name";
            String name = _nodeConfigurationOptionsFilter.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_nodeConfigurationOptionsFilter.getOperator() != null) {
            prefix = _prefix + "Operator";
            String operator = _nodeConfigurationOptionsFilter.getOperator();
            request.addParameter(prefix, StringUtils.fromString(operator));
        }
        if (_nodeConfigurationOptionsFilter.getValues() != null) {
            prefix = _prefix + "Value";
            java.util.List<String> values = _nodeConfigurationOptionsFilter.getValues();
            int valuesIndex = 1;
            String valuesPrefix = prefix;
            for (String valuesItem : values) {
                prefix = valuesPrefix + "." + valuesIndex;
                if (valuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(valuesItem));
                }
                valuesIndex++;
            }
            prefix = valuesPrefix;
        }
    }

    private static NodeConfigurationOptionsFilterStaxMarshaller instance;

    public static NodeConfigurationOptionsFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new NodeConfigurationOptionsFilterStaxMarshaller();
        return instance;
    }
}
