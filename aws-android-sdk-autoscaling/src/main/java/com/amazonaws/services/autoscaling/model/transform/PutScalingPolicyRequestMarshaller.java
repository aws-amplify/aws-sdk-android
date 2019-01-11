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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for PutScalingPolicyRequest
 */
public class PutScalingPolicyRequestMarshaller implements
        Marshaller<Request<PutScalingPolicyRequest>, PutScalingPolicyRequest> {

    public Request<PutScalingPolicyRequest> marshall(PutScalingPolicyRequest putScalingPolicyRequest) {
        if (putScalingPolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PutScalingPolicyRequest)");
        }

        Request<PutScalingPolicyRequest> request = new DefaultRequest<PutScalingPolicyRequest>(
                putScalingPolicyRequest, "AmazonAutoScaling");
        request.addParameter("Action", "PutScalingPolicy");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (putScalingPolicyRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = putScalingPolicyRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (putScalingPolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = putScalingPolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (putScalingPolicyRequest.getPolicyType() != null) {
            prefix = "PolicyType";
            String policyType = putScalingPolicyRequest.getPolicyType();
            request.addParameter(prefix, StringUtils.fromString(policyType));
        }
        if (putScalingPolicyRequest.getAdjustmentType() != null) {
            prefix = "AdjustmentType";
            String adjustmentType = putScalingPolicyRequest.getAdjustmentType();
            request.addParameter(prefix, StringUtils.fromString(adjustmentType));
        }
        if (putScalingPolicyRequest.getMinAdjustmentStep() != null) {
            prefix = "MinAdjustmentStep";
            Integer minAdjustmentStep = putScalingPolicyRequest.getMinAdjustmentStep();
            request.addParameter(prefix, StringUtils.fromInteger(minAdjustmentStep));
        }
        if (putScalingPolicyRequest.getMinAdjustmentMagnitude() != null) {
            prefix = "MinAdjustmentMagnitude";
            Integer minAdjustmentMagnitude = putScalingPolicyRequest.getMinAdjustmentMagnitude();
            request.addParameter(prefix, StringUtils.fromInteger(minAdjustmentMagnitude));
        }
        if (putScalingPolicyRequest.getScalingAdjustment() != null) {
            prefix = "ScalingAdjustment";
            Integer scalingAdjustment = putScalingPolicyRequest.getScalingAdjustment();
            request.addParameter(prefix, StringUtils.fromInteger(scalingAdjustment));
        }
        if (putScalingPolicyRequest.getCooldown() != null) {
            prefix = "Cooldown";
            Integer cooldown = putScalingPolicyRequest.getCooldown();
            request.addParameter(prefix, StringUtils.fromInteger(cooldown));
        }
        if (putScalingPolicyRequest.getMetricAggregationType() != null) {
            prefix = "MetricAggregationType";
            String metricAggregationType = putScalingPolicyRequest.getMetricAggregationType();
            request.addParameter(prefix, StringUtils.fromString(metricAggregationType));
        }
        if (putScalingPolicyRequest.getStepAdjustments() != null) {
            prefix = "StepAdjustments";
            java.util.List<StepAdjustment> stepAdjustments = putScalingPolicyRequest
                    .getStepAdjustments();
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
        if (putScalingPolicyRequest.getEstimatedInstanceWarmup() != null) {
            prefix = "EstimatedInstanceWarmup";
            Integer estimatedInstanceWarmup = putScalingPolicyRequest.getEstimatedInstanceWarmup();
            request.addParameter(prefix, StringUtils.fromInteger(estimatedInstanceWarmup));
        }
        if (putScalingPolicyRequest.getTargetTrackingConfiguration() != null) {
            prefix = "TargetTrackingConfiguration";
            TargetTrackingConfiguration targetTrackingConfiguration = putScalingPolicyRequest
                    .getTargetTrackingConfiguration();
            TargetTrackingConfigurationStaxMarshaller.getInstance().marshall(
                    targetTrackingConfiguration, request, prefix + ".");
        }

        return request;
    }
}
