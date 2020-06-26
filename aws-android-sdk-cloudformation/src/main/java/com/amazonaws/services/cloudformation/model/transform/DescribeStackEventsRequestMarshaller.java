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

package com.amazonaws.services.cloudformation.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.cloudformation.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeStackEventsRequest
 */
public class DescribeStackEventsRequestMarshaller implements
        Marshaller<Request<DescribeStackEventsRequest>, DescribeStackEventsRequest> {

    public Request<DescribeStackEventsRequest> marshall(
            DescribeStackEventsRequest describeStackEventsRequest) {
        if (describeStackEventsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeStackEventsRequest)");
        }

        Request<DescribeStackEventsRequest> request = new DefaultRequest<DescribeStackEventsRequest>(
                describeStackEventsRequest, "AWSCloudFormation");
        request.addParameter("Action", "DescribeStackEvents");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (describeStackEventsRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = describeStackEventsRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (describeStackEventsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeStackEventsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
