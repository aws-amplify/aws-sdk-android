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
 * StAX marshaller for POJO TargetTrackingConfiguration
 */
class TargetTrackingConfigurationStaxMarshaller {

    public void marshall(TargetTrackingConfiguration _targetTrackingConfiguration,
            Request<?> request, String _prefix) {
        String prefix;
        if (_targetTrackingConfiguration.getPredefinedMetricSpecification() != null) {
            prefix = _prefix + "PredefinedMetricSpecification";
            PredefinedMetricSpecification predefinedMetricSpecification = _targetTrackingConfiguration
                    .getPredefinedMetricSpecification();
            PredefinedMetricSpecificationStaxMarshaller.getInstance().marshall(
                    predefinedMetricSpecification, request, prefix + ".");
        }
        if (_targetTrackingConfiguration.getCustomizedMetricSpecification() != null) {
            prefix = _prefix + "CustomizedMetricSpecification";
            CustomizedMetricSpecification customizedMetricSpecification = _targetTrackingConfiguration
                    .getCustomizedMetricSpecification();
            CustomizedMetricSpecificationStaxMarshaller.getInstance().marshall(
                    customizedMetricSpecification, request, prefix + ".");
        }
        if (_targetTrackingConfiguration.getTargetValue() != null) {
            prefix = _prefix + "TargetValue";
            Double targetValue = _targetTrackingConfiguration.getTargetValue();
            request.addParameter(prefix, StringUtils.fromDouble(targetValue));
        }
        if (_targetTrackingConfiguration.getDisableScaleIn() != null) {
            prefix = _prefix + "DisableScaleIn";
            Boolean disableScaleIn = _targetTrackingConfiguration.getDisableScaleIn();
            request.addParameter(prefix, StringUtils.fromBoolean(disableScaleIn));
        }
    }

    private static TargetTrackingConfigurationStaxMarshaller instance;

    public static TargetTrackingConfigurationStaxMarshaller getInstance() {
        if (instance == null)
            instance = new TargetTrackingConfigurationStaxMarshaller();
        return instance;
    }
}
