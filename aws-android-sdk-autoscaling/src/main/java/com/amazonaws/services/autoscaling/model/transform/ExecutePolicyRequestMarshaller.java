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
 * StAX request marshaller for ExecutePolicyRequest
 */
public class ExecutePolicyRequestMarshaller implements
        Marshaller<Request<ExecutePolicyRequest>, ExecutePolicyRequest> {

    public Request<ExecutePolicyRequest> marshall(ExecutePolicyRequest executePolicyRequest) {
        if (executePolicyRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ExecutePolicyRequest)");
        }

        Request<ExecutePolicyRequest> request = new DefaultRequest<ExecutePolicyRequest>(
                executePolicyRequest, "AmazonAutoScaling");
        request.addParameter("Action", "ExecutePolicy");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (executePolicyRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = executePolicyRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (executePolicyRequest.getPolicyName() != null) {
            prefix = "PolicyName";
            String policyName = executePolicyRequest.getPolicyName();
            request.addParameter(prefix, StringUtils.fromString(policyName));
        }
        if (executePolicyRequest.getHonorCooldown() != null) {
            prefix = "HonorCooldown";
            Boolean honorCooldown = executePolicyRequest.getHonorCooldown();
            request.addParameter(prefix, StringUtils.fromBoolean(honorCooldown));
        }
        if (executePolicyRequest.getMetricValue() != null) {
            prefix = "MetricValue";
            Double metricValue = executePolicyRequest.getMetricValue();
            request.addParameter(prefix, StringUtils.fromDouble(metricValue));
        }
        if (executePolicyRequest.getBreachThreshold() != null) {
            prefix = "BreachThreshold";
            Double breachThreshold = executePolicyRequest.getBreachThreshold();
            request.addParameter(prefix, StringUtils.fromDouble(breachThreshold));
        }

        return request;
    }
}
