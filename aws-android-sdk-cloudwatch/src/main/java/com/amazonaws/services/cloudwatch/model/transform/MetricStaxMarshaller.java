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
 * StAX marshaller for POJO Metric
 */
class MetricStaxMarshaller {

    public void marshall(Metric _metric, Request<?> request, String _prefix) {
        String prefix;
        if (_metric.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _metric.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_metric.getMetricName() != null) {
            prefix = _prefix + "MetricName";
            String metricName = _metric.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (_metric.getDimensions() != null) {
            prefix = _prefix + "Dimensions";
            java.util.List<Dimension> dimensions = _metric.getDimensions();
            int dimensionsIndex = 1;
            String dimensionsPrefix = prefix;
            for (Dimension dimensionsItem : dimensions) {
                prefix = dimensionsPrefix + ".member." + dimensionsIndex;
                if (dimensionsItem != null) {
                    DimensionStaxMarshaller.getInstance().marshall(dimensionsItem, request,
                            prefix + ".");
                }
                dimensionsIndex++;
            }
            prefix = dimensionsPrefix;
        }
    }

    private static MetricStaxMarshaller instance;

    public static MetricStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MetricStaxMarshaller();
        return instance;
    }
}
