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
 * StAX request marshaller for DescribeNotificationConfigurationsRequest
 */
public class DescribeNotificationConfigurationsRequestMarshaller
        implements
        Marshaller<Request<DescribeNotificationConfigurationsRequest>, DescribeNotificationConfigurationsRequest> {

    public Request<DescribeNotificationConfigurationsRequest> marshall(
            DescribeNotificationConfigurationsRequest describeNotificationConfigurationsRequest) {
        if (describeNotificationConfigurationsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeNotificationConfigurationsRequest)");
        }

        Request<DescribeNotificationConfigurationsRequest> request = new DefaultRequest<DescribeNotificationConfigurationsRequest>(
                describeNotificationConfigurationsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeNotificationConfigurations");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeNotificationConfigurationsRequest.getAutoScalingGroupNames() != null) {
            prefix = "AutoScalingGroupNames";
            java.util.List<String> autoScalingGroupNames = describeNotificationConfigurationsRequest
                    .getAutoScalingGroupNames();
            int autoScalingGroupNamesIndex = 1;
            String autoScalingGroupNamesPrefix = prefix;
            for (String autoScalingGroupNamesItem : autoScalingGroupNames) {
                prefix = autoScalingGroupNamesPrefix + ".member." + autoScalingGroupNamesIndex;
                if (autoScalingGroupNamesItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(autoScalingGroupNamesItem));
                }
                autoScalingGroupNamesIndex++;
            }
            prefix = autoScalingGroupNamesPrefix;
        }
        if (describeNotificationConfigurationsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeNotificationConfigurationsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeNotificationConfigurationsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeNotificationConfigurationsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
