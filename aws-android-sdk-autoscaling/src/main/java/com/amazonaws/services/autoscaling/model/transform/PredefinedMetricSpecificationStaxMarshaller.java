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
 * StAX marshaller for POJO PredefinedMetricSpecification
 */
class PredefinedMetricSpecificationStaxMarshaller {

    public void marshall(PredefinedMetricSpecification _predefinedMetricSpecification,
            Request<?> request, String _prefix) {
        String prefix;
        if (_predefinedMetricSpecification.getPredefinedMetricType() != null) {
            prefix = _prefix + "PredefinedMetricType";
            String predefinedMetricType = _predefinedMetricSpecification.getPredefinedMetricType();
            request.addParameter(prefix, StringUtils.fromString(predefinedMetricType));
        }
        if (_predefinedMetricSpecification.getResourceLabel() != null) {
            prefix = _prefix + "ResourceLabel";
            String resourceLabel = _predefinedMetricSpecification.getResourceLabel();
            request.addParameter(prefix, StringUtils.fromString(resourceLabel));
        }
    }

    private static PredefinedMetricSpecificationStaxMarshaller instance;

    public static PredefinedMetricSpecificationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new PredefinedMetricSpecificationStaxMarshaller();
        return instance;
    }
}
