/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Filter
 */
class FilterStaxMarshaller {

    public void marshall(Filter _filter, Request<?> request, String _prefix) {
        String prefix;
        if (_filter.getName() != null) {
            prefix = _prefix + "Name";
            String name = _filter.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_filter.getValues() != null) {
            prefix = _prefix + "Values";
            java.util.List<String> values = _filter.getValues();
            int valuesIndex = 1;
            String valuesPrefix = prefix;
            for (String valuesItem : values) {
                prefix = valuesPrefix + ".member." + valuesIndex;
                if (valuesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(valuesItem));
                }
                valuesIndex++;
            }
            prefix = valuesPrefix;
        }
    }

    private static FilterStaxMarshaller instance;

    public static FilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new FilterStaxMarshaller();
        return instance;
    }
}
