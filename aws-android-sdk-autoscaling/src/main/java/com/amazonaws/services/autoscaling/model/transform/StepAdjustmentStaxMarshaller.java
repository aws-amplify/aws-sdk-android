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
 * StAX marshaller for POJO StepAdjustment
 */
class StepAdjustmentStaxMarshaller {

    public void marshall(StepAdjustment _stepAdjustment, Request<?> request, String _prefix) {
        String prefix;
        if (_stepAdjustment.getMetricIntervalLowerBound() != null) {
            prefix = _prefix + "MetricIntervalLowerBound";
            Double metricIntervalLowerBound = _stepAdjustment.getMetricIntervalLowerBound();
            request.addParameter(prefix, StringUtils.fromDouble(metricIntervalLowerBound));
        }
        if (_stepAdjustment.getMetricIntervalUpperBound() != null) {
            prefix = _prefix + "MetricIntervalUpperBound";
            Double metricIntervalUpperBound = _stepAdjustment.getMetricIntervalUpperBound();
            request.addParameter(prefix, StringUtils.fromDouble(metricIntervalUpperBound));
        }
        if (_stepAdjustment.getScalingAdjustment() != null) {
            prefix = _prefix + "ScalingAdjustment";
            Integer scalingAdjustment = _stepAdjustment.getScalingAdjustment();
            request.addParameter(prefix, StringUtils.fromInteger(scalingAdjustment));
        }
    }

    private static StepAdjustmentStaxMarshaller instance;

    public static StepAdjustmentStaxMarshaller getInstance() {
        if (instance == null)
            instance = new StepAdjustmentStaxMarshaller();
        return instance;
    }
}
