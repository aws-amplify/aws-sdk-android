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
 * StAX marshaller for POJO PropertyDifference
 */
class PropertyDifferenceStaxMarshaller {

    public void marshall(PropertyDifference _propertyDifference, Request<?> request, String _prefix) {
        String prefix;
        if (_propertyDifference.getPropertyPath() != null) {
            prefix = _prefix + "PropertyPath";
            String propertyPath = _propertyDifference.getPropertyPath();
            request.addParameter(prefix, StringUtils.fromString(propertyPath));
        }
        if (_propertyDifference.getExpectedValue() != null) {
            prefix = _prefix + "ExpectedValue";
            String expectedValue = _propertyDifference.getExpectedValue();
            request.addParameter(prefix, StringUtils.fromString(expectedValue));
        }
        if (_propertyDifference.getActualValue() != null) {
            prefix = _prefix + "ActualValue";
            String actualValue = _propertyDifference.getActualValue();
            request.addParameter(prefix, StringUtils.fromString(actualValue));
        }
        if (_propertyDifference.getDifferenceType() != null) {
            prefix = _prefix + "DifferenceType";
            String differenceType = _propertyDifference.getDifferenceType();
            request.addParameter(prefix, StringUtils.fromString(differenceType));
        }
    }

    private static PropertyDifferenceStaxMarshaller instance;

    public static PropertyDifferenceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PropertyDifferenceStaxMarshaller();
        return instance;
    }
}
