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
 * StAX request marshaller for DescribeAutoScalingNotificationTypesRequest
 */
public class DescribeAutoScalingNotificationTypesRequestMarshaller
        implements
        Marshaller<Request<DescribeAutoScalingNotificationTypesRequest>, DescribeAutoScalingNotificationTypesRequest> {

    public Request<DescribeAutoScalingNotificationTypesRequest> marshall(
            DescribeAutoScalingNotificationTypesRequest describeAutoScalingNotificationTypesRequest) {
        if (describeAutoScalingNotificationTypesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeAutoScalingNotificationTypesRequest)");
        }

        Request<DescribeAutoScalingNotificationTypesRequest> request = new DefaultRequest<DescribeAutoScalingNotificationTypesRequest>(
                describeAutoScalingNotificationTypesRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeAutoScalingNotificationTypes");
        request.addParameter("Version", "2011-01-01");

        String prefix;

        return request;
    }
}
