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
 * StAX marshaller for POJO CustomizedMetricSpecification
 */
class CustomizedMetricSpecificationStaxMarshaller {

    public void marshall(CustomizedMetricSpecification _customizedMetricSpecification,
            Request<?> request, String _prefix) {
        String prefix;
        if (_customizedMetricSpecification.getMetricName() != null) {
            prefix = _prefix + "MetricName";
            String metricName = _customizedMetricSpecification.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (_customizedMetricSpecification.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _customizedMetricSpecification.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_customizedMetricSpecification.getDimensions() != null) {
            prefix = _prefix + "Dimensions";
            java.util.List<MetricDimension> dimensions = _customizedMetricSpecification
                    .getDimensions();
            int dimensionsIndex = 1;
            String dimensionsPrefix = prefix;
            for (MetricDimension dimensionsItem : dimensions) {
                prefix = dimensionsPrefix + ".member." + dimensionsIndex;
                if (dimensionsItem != null) {
                    MetricDimensionStaxMarshaller.getInstance().marshall(dimensionsItem, request,
                            prefix + ".");
                }
                dimensionsIndex++;
            }
            prefix = dimensionsPrefix;
        }
        if (_customizedMetricSpecification.getStatistic() != null) {
            prefix = _prefix + "Statistic";
            String statistic = _customizedMetricSpecification.getStatistic();
            request.addParameter(prefix, StringUtils.fromString(statistic));
        }
        if (_customizedMetricSpecification.getUnit() != null) {
            prefix = _prefix + "Unit";
            String unit = _customizedMetricSpecification.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }
    }

    private static CustomizedMetricSpecificationStaxMarshaller instance;

    public static CustomizedMetricSpecificationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomizedMetricSpecificationStaxMarshaller();
        return instance;
    }
}
