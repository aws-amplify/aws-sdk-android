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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeInstanceRefreshesRequest
 */
public class DescribeInstanceRefreshesRequestMarshaller implements
        Marshaller<Request<DescribeInstanceRefreshesRequest>, DescribeInstanceRefreshesRequest> {

    public Request<DescribeInstanceRefreshesRequest> marshall(
            DescribeInstanceRefreshesRequest describeInstanceRefreshesRequest) {
        if (describeInstanceRefreshesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeInstanceRefreshesRequest)");
        }

        Request<DescribeInstanceRefreshesRequest> request = new DefaultRequest<DescribeInstanceRefreshesRequest>(
                describeInstanceRefreshesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeInstanceRefreshes");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeInstanceRefreshesRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describeInstanceRefreshesRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describeInstanceRefreshesRequest.getInstanceRefreshIds() != null) {
            prefix = "InstanceRefreshIds";
            java.util.List<String> instanceRefreshIds = describeInstanceRefreshesRequest
                    .getInstanceRefreshIds();
            int instanceRefreshIdsIndex = 1;
            String instanceRefreshIdsPrefix = prefix;
            for (String instanceRefreshIdsItem : instanceRefreshIds) {
                prefix = instanceRefreshIdsPrefix + ".member." + instanceRefreshIdsIndex;
                if (instanceRefreshIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(instanceRefreshIdsItem));
                }
                instanceRefreshIdsIndex++;
            }
            prefix = instanceRefreshIdsPrefix;
        }
        if (describeInstanceRefreshesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeInstanceRefreshesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeInstanceRefreshesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeInstanceRefreshesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
