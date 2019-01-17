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
 * StAX request marshaller for DescribeScheduledActionsRequest
 */
public class DescribeScheduledActionsRequestMarshaller implements
        Marshaller<Request<DescribeScheduledActionsRequest>, DescribeScheduledActionsRequest> {

    public Request<DescribeScheduledActionsRequest> marshall(
            DescribeScheduledActionsRequest describeScheduledActionsRequest) {
        if (describeScheduledActionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeScheduledActionsRequest)");
        }

        Request<DescribeScheduledActionsRequest> request = new DefaultRequest<DescribeScheduledActionsRequest>(
                describeScheduledActionsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeScheduledActions");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeScheduledActionsRequest.getAutoScalingGroupName() != null) {
            prefix = "AutoScalingGroupName";
            String autoScalingGroupName = describeScheduledActionsRequest.getAutoScalingGroupName();
            request.addParameter(prefix, StringUtils.fromString(autoScalingGroupName));
        }
        if (describeScheduledActionsRequest.getScheduledActionNames() != null) {
            prefix = "ScheduledActionNames";
            java.util.List<String> scheduledActionNames = describeScheduledActionsRequest
                    .getScheduledActionNames();
            int scheduledActionNamesIndex = 1;
            String scheduledActionNamesPrefix = prefix;
            for (String scheduledActionNamesItem : scheduledActionNames) {
                prefix = scheduledActionNamesPrefix + ".member." + scheduledActionNamesIndex;
                if (scheduledActionNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(scheduledActionNamesItem));
                }
                scheduledActionNamesIndex++;
            }
            prefix = scheduledActionNamesPrefix;
        }
        if (describeScheduledActionsRequest.getStartTime() != null) {
            prefix = "StartTime";
            java.util.Date startTime = describeScheduledActionsRequest.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (describeScheduledActionsRequest.getEndTime() != null) {
            prefix = "EndTime";
            java.util.Date endTime = describeScheduledActionsRequest.getEndTime();
            request.addParameter(prefix, StringUtils.fromDate(endTime));
        }
        if (describeScheduledActionsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeScheduledActionsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeScheduledActionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeScheduledActionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
