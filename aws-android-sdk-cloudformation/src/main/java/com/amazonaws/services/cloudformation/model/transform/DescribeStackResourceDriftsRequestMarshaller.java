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
 * StAX request marshaller for DescribeStackResourceDriftsRequest
 */
public class DescribeStackResourceDriftsRequestMarshaller implements
        Marshaller<Request<DescribeStackResourceDriftsRequest>, DescribeStackResourceDriftsRequest> {

    public Request<DescribeStackResourceDriftsRequest> marshall(
            DescribeStackResourceDriftsRequest describeStackResourceDriftsRequest) {
        if (describeStackResourceDriftsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeStackResourceDriftsRequest)");
        }

        Request<DescribeStackResourceDriftsRequest> request = new DefaultRequest<DescribeStackResourceDriftsRequest>(
                describeStackResourceDriftsRequest, "AWSCloudFormation");
        request.addParameter("Action", "DescribeStackResourceDrifts");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (describeStackResourceDriftsRequest.getStackName() != null) {
            prefix = "StackName";
            String stackName = describeStackResourceDriftsRequest.getStackName();
            request.addParameter(prefix, StringUtils.fromString(stackName));
        }
        if (describeStackResourceDriftsRequest.getStackResourceDriftStatusFilters() != null) {
            prefix = "StackResourceDriftStatusFilters";
            java.util.List<String> stackResourceDriftStatusFilters = describeStackResourceDriftsRequest
                    .getStackResourceDriftStatusFilters();
            int stackResourceDriftStatusFiltersIndex = 1;
            String stackResourceDriftStatusFiltersPrefix = prefix;
            for (String stackResourceDriftStatusFiltersItem : stackResourceDriftStatusFilters) {
                prefix = stackResourceDriftStatusFiltersPrefix + ".member."
                        + stackResourceDriftStatusFiltersIndex;
                if (stackResourceDriftStatusFiltersItem != null) {
                    request.addParameter(prefix,
                            StringUtils.fromString(stackResourceDriftStatusFiltersItem));
                }
                stackResourceDriftStatusFiltersIndex++;
            }
            prefix = stackResourceDriftStatusFiltersPrefix;
        }
        if (describeStackResourceDriftsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeStackResourceDriftsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeStackResourceDriftsRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = describeStackResourceDriftsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }

        return request;
    }
}
