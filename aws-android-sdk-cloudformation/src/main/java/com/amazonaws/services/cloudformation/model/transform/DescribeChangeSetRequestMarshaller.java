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
 * StAX request marshaller for DescribeChangeSetRequest
 */
public class DescribeChangeSetRequestMarshaller implements
        Marshaller<Request<DescribeChangeSetRequest>, DescribeChangeSetRequest> {

    public Request<DescribeChangeSetRequest> marshall(
            DescribeChangeSetRequest describeChangeSetRequest) {
        if (describeChangeSetRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeChangeSetRequest)");
        }

        Request<DescribeChangeSetRequest> request = new DefaultRequest<DescribeChangeSetRequest>(
                describeChangeSetRequest, "AWSCloudFormation");
        request.addParameter("Action", "DescribeChangeSet");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (describeChangeSetRequest.getChangeSetName() != null) {
            prefix = "ChangeSetName";
            String changeSetName = describeChangeSetRequest.getChangeSetName();
            request.addParameter(prefix, StringUtils.fromString(changeSetName));
        }
        if (describeChangeSetRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = describeChangeSetRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (describeChangeSetRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeChangeSetRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
