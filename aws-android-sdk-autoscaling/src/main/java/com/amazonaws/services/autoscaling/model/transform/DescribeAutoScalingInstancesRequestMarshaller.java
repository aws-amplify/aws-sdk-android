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
 * StAX request marshaller for DescribeAutoScalingInstancesRequest
 */
public class DescribeAutoScalingInstancesRequestMarshaller
        implements
        Marshaller<Request<DescribeAutoScalingInstancesRequest>, DescribeAutoScalingInstancesRequest> {

    public Request<DescribeAutoScalingInstancesRequest> marshall(
            DescribeAutoScalingInstancesRequest describeAutoScalingInstancesRequest) {
        if (describeAutoScalingInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAutoScalingInstancesRequest)");
        }

        Request<DescribeAutoScalingInstancesRequest> request = new DefaultRequest<DescribeAutoScalingInstancesRequest>(
                describeAutoScalingInstancesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeAutoScalingInstances");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeAutoScalingInstancesRequest.getInstanceIds() != null) {
            prefix = "InstanceIds";
            java.util.List<String> instanceIds = describeAutoScalingInstancesRequest
                    .getInstanceIds();
            int instanceIdsIndex = 1;
            String instanceIdsPrefix = prefix;
            for (String instanceIdsItem : instanceIds) {
                prefix = instanceIdsPrefix + ".member." + instanceIdsIndex;
                if (instanceIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(instanceIdsItem));
                }
                instanceIdsIndex++;
            }
            prefix = instanceIdsPrefix;
        }
        if (describeAutoScalingInstancesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeAutoScalingInstancesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeAutoScalingInstancesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeAutoScalingInstancesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
