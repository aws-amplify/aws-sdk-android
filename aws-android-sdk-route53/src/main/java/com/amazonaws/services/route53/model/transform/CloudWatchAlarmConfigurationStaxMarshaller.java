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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CloudWatchAlarmConfiguration
 */
class CloudWatchAlarmConfigurationStaxMarshaller {

    public void marshall(CloudWatchAlarmConfiguration _cloudWatchAlarmConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_cloudWatchAlarmConfiguration.getEvaluationPeriods() != null) {
            prefix = _prefix + "EvaluationPeriods";
            Integer evaluationPeriods = _cloudWatchAlarmConfiguration.getEvaluationPeriods();
            request.addParameter(prefix, StringUtils.fromInteger(evaluationPeriods));
        }
        if (_cloudWatchAlarmConfiguration.getThreshold() != null) {
            prefix = _prefix + "Threshold";
            Double threshold = _cloudWatchAlarmConfiguration.getThreshold();
            request.addParameter(prefix, StringUtils.fromDouble(threshold));
        }
        if (_cloudWatchAlarmConfiguration.getComparisonOperator() != null) {
            prefix = _prefix + "ComparisonOperator";
            String comparisonOperator = _cloudWatchAlarmConfiguration.getComparisonOperator();
            request.addParameter(prefix, StringUtils.fromString(comparisonOperator));
        }
        if (_cloudWatchAlarmConfiguration.getPeriod() != null) {
            prefix = _prefix + "Period";
            Integer period = _cloudWatchAlarmConfiguration.getPeriod();
            request.addParameter(prefix, StringUtils.fromInteger(period));
        }
        if (_cloudWatchAlarmConfiguration.getMetricName() != null) {
            prefix = _prefix + "MetricName";
            String metricName = _cloudWatchAlarmConfiguration.getMetricName();
            request.addParameter(prefix, StringUtils.fromString(metricName));
        }
        if (_cloudWatchAlarmConfiguration.getNamespace() != null) {
            prefix = _prefix + "Namespace";
            String namespace = _cloudWatchAlarmConfiguration.getNamespace();
            request.addParameter(prefix, StringUtils.fromString(namespace));
        }
        if (_cloudWatchAlarmConfiguration.getStatistic() != null) {
            prefix = _prefix + "Statistic";
            String statistic = _cloudWatchAlarmConfiguration.getStatistic();
            request.addParameter(prefix, StringUtils.fromString(statistic));
        }
        if (_cloudWatchAlarmConfiguration.getDimensions() != null) {
            prefix = _prefix + "Dimensions";
            java.util.List<Dimension> dimensions = _cloudWatchAlarmConfiguration.getDimensions();
            int dimensionsIndex = 1;
            String dimensionsPrefix = prefix;
            for (Dimension dimensionsItem : dimensions) {
                prefix = dimensionsPrefix + "." + dimensionsIndex;
                if (dimensionsItem != null) {
                    DimensionStaxMarshaller.getInstance().marshall(dimensionsItem, request,
                            prefix + ".");
                }
                dimensionsIndex++;
            }
            prefix = dimensionsPrefix;
        }
    }

    private static CloudWatchAlarmConfigurationStaxMarshaller instance;

    public static CloudWatchAlarmConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CloudWatchAlarmConfigurationStaxMarshaller();
        return instance;
    }
}
