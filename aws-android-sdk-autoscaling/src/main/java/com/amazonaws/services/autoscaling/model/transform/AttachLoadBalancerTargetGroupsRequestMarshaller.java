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
 * StAX request marshaller for AttachLoadBalancerTargetGroupsRequest
 */
public class AttachLoadBalancerTargetGroupsRequestMarshaller
        implements
        Marshaller<Request<AttachLoadBalancerTargetGroupsRequest>, AttachLoadBalancerTargetGroupsRequest> {

    public Request<AttachLoadBalancerTargetGroupsRequest> marshall(
            AttachLoadBalancerTargetGroupsRequest attachLoadBalancerTargetGroupsRequest) {
        if (attachLoadBalancerTargetGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(AttachLoadBalancerTargetGroupsRequest)");
        }

        Request<AttachLoadBalancerTargetGroupsRequest> request = new DefaultRequest<AttachLoadBalancerTargetGroupsRequest>(
                attachLoadBalancerTargetGroupsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "AttachLoadBalancerTargetGroups");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (attachLoadBalancerTargetGroupsRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = attachLoadBalancerTargetGroupsRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (attachLoadBalancerTargetGroupsRequest.getTargetGroupARNs() != null) {
            prefix = "TargetGroupARNs";
            java.util.List<String> targetGroupARNs = attachLoadBalancerTargetGroupsRequest
                    .getTargetGroupARNs();
            int targetGroupARNsIndex = 1;
            String targetGroupARNsPrefix = prefix;
            for (String targetGroupARNsItem : targetGroupARNs) {
                prefix = targetGroupARNsPrefix + ".member." + targetGroupARNsIndex;
                if (targetGroupARNsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(targetGroupARNsItem));
                }
                targetGroupARNsIndex++;
            }
            prefix = targetGroupARNsPrefix;
        }

        return request;
    }
}
