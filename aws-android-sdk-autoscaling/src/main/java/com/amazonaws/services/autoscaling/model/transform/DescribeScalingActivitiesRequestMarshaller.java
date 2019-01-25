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
 * StAX request marshaller for DescribeScalingActivitiesRequest
 */
public class DescribeScalingActivitiesRequestMarshaller implements
        Marshaller<Request<DescribeScalingActivitiesRequest>, DescribeScalingActivitiesRequest> {

    public Request<DescribeScalingActivitiesRequest> marshall(
            DescribeScalingActivitiesRequest describeScalingActivitiesRequest) {
        if (describeScalingActivitiesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeScalingActivitiesRequest)");
        }

        Request<DescribeScalingActivitiesRequest> request = new DefaultRequest<DescribeScalingActivitiesRequest>(
                describeScalingActivitiesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeScalingActivities");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeScalingActivitiesRequest.getActivityIds() != null) {
            prefix = "ActivityIds";
            java.util.List<String> activityIds = describeScalingActivitiesRequest.getActivityIds();
            int activityIdsIndex = 1;
            String activityIdsPrefix = prefix;
            for (String activityIdsItem : activityIds) {
                prefix = activityIdsPrefix + ".member." + activityIdsIndex;
                if (activityIdsItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(activityIdsItem));
                }
                activityIdsIndex++;
            }
            prefix = activityIdsPrefix;
        }
        if (describeScalingActivitiesRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describeScalingActivitiesRequest
                    .getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describeScalingActivitiesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeScalingActivitiesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeScalingActivitiesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeScalingActivitiesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
