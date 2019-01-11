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
 * StAX marshaller for POJO ScalingPolicy
 */
class ScalingPolicyStaxMarshaller {

    public void marshall(ScalingPolicy _scalingPolicy, Request<?> request, String _prefix) {
        String prefix;
        if (_scalingPolicy.getAutoScalingGroupName() != null) {
            prefix = _prefix + "AutoScalingGroupName";
            String autoScalingGroupName = _scalingPolicy.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (_scalingPolicy.getPolicyName() != null) {
            prefix = _prefix + "PolicyName";
            String policyName = _scalingPolicy.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (_scalingPolicy.getPolicyARN() != null) {
            prefix = _prefix + "PolicyARN";
            String policyARN = _scalingPolicy.getPolicyARN();
            request.addParameter(prefix, StringUtils.fromString(policyARN));
        }
        if (_scalingPolicy.getPolicyType() != null) {
            prefix = _prefix + "PolicyType";
            String policyType = _scalingPolicy.getPolicyType();
            request.addParameter(prefix, StringUtils.fromString(policyType));
        }
        if (_scalingPolicy.getAdjustmentType() != null) {
            prefix = _prefix + "AdjustmentType";
            String adjustmentType = _scalingPolicy.getAdjustmentType();
            request.addParameter(prefix, StringUtils.fromString(adjustmentType));
        }
        if (_scalingPolicy.getMinAdjustmentStep() != null) {
            prefix = _prefix + "MinAdjustmentStep";
            Integer minAdjustmentStep = _scalingPolicy.getMinAdjustmentStep();
            request.addParameter(prefix, StringUtils.fromInteger(minAdjustmentStep));
        }
        if (_scalingPolicy.getMinAdjustmentMagnitude() != null) {
            prefix = _prefix + "MinAdjustmentMagnitude";
            Integer minAdjustmentMagnitude = _scalingPolicy.getMinAdjustmentMagnitude();
            request.addParameter(prefix, StringUtils.fromInteger(minAdjustmentMagnitude));
        }
        if (_scalingPolicy.getScalingAdjustment() != null) {
            prefix = _prefix + "ScalingAdjustment";
            Integer scalingAdjustment = _scalingPolicy.getScalingAdjustment();
            request.addParameter(prefix, StringUtils.fromInteger(scalingAdjustment));
        }
        if (_scalingPolicy.getCooldown() != null) {
            prefix = _prefix + "Cooldown";
            Integer cooldown = _scalingPolicy.getCooldown();
            request.addParameter(prefix, StringUtils.fromInteger(cooldown));
        }
        if (_scalingPolicy.getStepAdjustments() != null) {
            prefix = _prefix + "StepAdjustments";
            java.util.List<StepAdjustment> stepAdjustments = _scalingPolicy.getStepAdjustments();
            int stepAdjustmentsIndex = 1;
            String stepAdjustmentsPrefix = prefix;
            for (StepAdjustment stepAdjustmentsItem : stepAdjustments) {
                prefix = stepAdjustmentsPrefix + ".member." + stepAdjustmentsIndex;
                if (stepAdjustmentsItem != null) {
                    StepAdjustmentStaxMarshaller.getInstance().marshall(stepAdjustmentsItem,
                            request, prefix + ".");
                }
                stepAdjustmentsIndex++;
            }
            prefix = stepAdjustmentsPrefix;
        }
        if (_scalingPolicy.getMetricAggregationType() != null) {
            prefix = _prefix + "MetricAggregationType";
            String metricAggregationType = _scalingPolicy.getMetricAggregationType();
            request.addParameter(prefix, StringUtils.fromString(metricAggregationType));
        }
        if (_scalingPolicy.getEstimatedInstanceWarmup() != null) {
            prefix = _prefix + "EstimatedInstanceWarmup";
            Integer estimatedInstanceWarmup = _scalingPolicy.getEstimatedInstanceWarmup();
            request.addParameter(prefix, StringUtils.fromInteger(estimatedInstanceWarmup));
        }
        if (_scalingPolicy.getAlarms() != null) {
            prefix = _prefix + "Alarms";
            java.util.List<Alarm> alarms = _scalingPolicy.getAlarms();
            int alarmsIndex = 1;
            String alarmsPrefix = prefix;
            for (Alarm alarmsItem : alarms) {
                prefix = alarmsPrefix + ".member." + alarmsIndex;
                if (alarmsItem != null) {
                    AlarmStaxMarshaller.getInstance().marshall(alarmsItem, request, prefix + ".");
                }
                alarmsIndex++;
            }
            prefix = alarmsPrefix;
        }
        if (_scalingPolicy.getTargetTrackingConfiguration() != null) {
            prefix = _prefix + "TargetTrackingConfiguration";
            TargetTrackingConfiguration targetTrackingConfiguration = _scalingPolicy
                    .getTargetTrackingConfiguration();
            TargetTrackingConfigurationStaxMarshaller.getInstance().marshall(
                    targetTrackingConfiguration, request, prefix + ".");
        }
    }

    private static ScalingPolicyStaxMarshaller instance;

    public static ScalingPolicyStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ScalingPolicyStaxMarshaller();
        return instance;
    }
}
