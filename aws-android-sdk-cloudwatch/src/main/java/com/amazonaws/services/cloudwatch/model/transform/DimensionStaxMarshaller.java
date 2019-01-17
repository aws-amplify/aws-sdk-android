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

package com.amazonaws.services.cloudwatch.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.cloudwatch.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO Dimension
 */
class DimensionStaxMarshaller {

    public void marshall(Dimension _dimension, Request<?> request, String _prefix) {
        String prefix;
        if (_dimension.getName() != null) {
            prefix = _prefix + "Name";
            String name = _dimension.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_dimension.getValue() != null) {
            prefix = _prefix + "Value";
            String value = _dimension.getValue();
            request.addParameter(prefix, StringUtils.fromString(value));
        }
    }

    private static DimensionStaxMarshaller instance;

    public static DimensionStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DimensionStaxMarshaller();
        return instance;
    }
}
