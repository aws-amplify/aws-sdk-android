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
 * StAX marshaller for POJO AvailableProcessorFeature
 */
class AvailableProcessorFeatureStaxMarshaller {

    public void marshall(AvailableProcessorFeature _availableProcessorFeature, Request<?> request,
            String _prefix) {
        String prefix;
        if (_availableProcessorFeature.getName() != null) {
            prefix = _prefix + "Name";
            String name = _availableProcessorFeature.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_availableProcessorFeature.getDefaultValue() != null) {
            prefix = _prefix + "DefaultValue";
            String defaultValue = _availableProcessorFeature.getDefaultValue();
            request.addParameter(prefix, StringUtils.fromString(defaultValue));
        }
        if (_availableProcessorFeature.getAllowedValues() != null) {
            prefix = _prefix + "AllowedValues";
            String allowedValues = _availableProcessorFeature.getAllowedValues();
            request.addParameter(prefix, StringUtils.fromString(allowedValues));
        }
    }

    private static AvailableProcessorFeatureStaxMarshaller instance;

    public static AvailableProcessorFeatureStaxMarshaller getInstance() {
        if (instance == null)
            instance = new AvailableProcessorFeatureStaxMarshaller();
        return instance;
    }
}
