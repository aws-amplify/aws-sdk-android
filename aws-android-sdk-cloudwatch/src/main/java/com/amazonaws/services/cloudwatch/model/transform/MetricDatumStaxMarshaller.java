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
 * StAX marshaller for POJO MetricDatum
 */
class MetricDatumStaxMarshaller {

    public void marshall(MetricDatum _metricDatum, Request<?> request, String _prefix) {
        String prefix;
        if (_metricDatum.getMetricName() != null) {
            prefix = _prefix + "MetricName";
            String metricName = _metricDatum.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (_metricDatum.getDimensions() != null) {
            prefix = _prefix + "Dimensions";
            java.util.List<Dimension> dimensions = _metricDatum.getDimensions();
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
        if (_metricDatum.getTimestamp() != null) {
            prefix = _prefix + "Timestamp";
            java.util.Date timestamp = _metricDatum.getTimestamp();
            request.addParameter(prefix, StringUtils.fromDate(timestamp));
        }
        if (_metricDatum.getValue() != null) {
            prefix = _prefix + "Value";
            Double value = _metricDatum.getValue();
            request.addParameter(prefix, StringUtils.fromDouble(value));
        }
        if (_metricDatum.getStatisticValues() != null) {
            prefix = _prefix + "StatisticValues";
            StatisticSet statisticValues = _metricDatum.getStatisticValues();
            StatisticSetStaxMarshaller.getInstance().marshall(statisticValues, request,
                    prefix + ".");
        }
        if (_metricDatum.getUnit() != null) {
            prefix = _prefix + "Unit";
            String unit = _metricDatum.getUnit();
            request.addParameter(prefix, StringUtils.fromString(unit));
        }
    }

    private static MetricDatumStaxMarshaller instance;

    public static MetricDatumStaxMarshaller getInstance() {
        if (instance == null)
            instance = new MetricDatumStaxMarshaller();
        return instance;
    }
}
