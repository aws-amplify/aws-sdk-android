/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX request marshaller for DescribeLoadBalancersRequest
 */
public class DescribeLoadBalancersRequestMarshaller implements
        Marshaller<Request<DescribeLoadBalancersRequest>, DescribeLoadBalancersRequest> {

    public Request<DescribeLoadBalancersRequest> marshall(
            DescribeLoadBalancersRequest describeLoadBalancersRequest) {
        if (describeLoadBalancersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeLoadBalancersRequest)");
        }

        Request<DescribeLoadBalancersRequest> request = new DefaultRequest<DescribeLoadBalancersRequest>(
                describeLoadBalancersRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeLoadBalancers");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeLoadBalancersRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describeLoadBalancersRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describeLoadBalancersRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeLoadBalancersRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeLoadBalancersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeLoadBalancersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
