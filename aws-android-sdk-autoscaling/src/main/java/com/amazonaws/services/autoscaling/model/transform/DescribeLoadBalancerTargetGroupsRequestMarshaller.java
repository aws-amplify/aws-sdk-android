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
 * StAX request marshaller for DescribeLoadBalancerTargetGroupsRequest
 */
public class DescribeLoadBalancerTargetGroupsRequestMarshaller
        implements
        Marshaller<Request<DescribeLoadBalancerTargetGroupsRequest>, DescribeLoadBalancerTargetGroupsRequest> {

    public Request<DescribeLoadBalancerTargetGroupsRequest> marshall(
            DescribeLoadBalancerTargetGroupsRequest describeLoadBalancerTargetGroupsRequest) {
        if (describeLoadBalancerTargetGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLoadBalancerTargetGroupsRequest)");
        }

        Request<DescribeLoadBalancerTargetGroupsRequest> request = new DefaultRequest<DescribeLoadBalancerTargetGroupsRequest>(
                describeLoadBalancerTargetGroupsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLoadBalancerTargetGroups");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeLoadBalancerTargetGroupsRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describeLoadBalancerTargetGroupsRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describeLoadBalancerTargetGroupsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeLoadBalancerTargetGroupsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeLoadBalancerTargetGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeLoadBalancerTargetGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
