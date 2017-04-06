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
package com.amazonaws.services.ec2.model.transform;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.internal.ListWithAutoConstructFlag;
import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * Describe Spot Fleet Requests Request Marshaller
 */
public class DescribeSpotFleetRequestsRequestMarshaller implements Marshaller<Request<DescribeSpotFleetRequestsRequest>, DescribeSpotFleetRequestsRequest> {

    public Request<DescribeSpotFleetRequestsRequest> marshall(DescribeSpotFleetRequestsRequest describeSpotFleetRequestsRequest) {

        if (describeSpotFleetRequestsRequest == null) {
            throw new AmazonClientException("Invalid argument passed to marshall(...)");
        }

        Request<DescribeSpotFleetRequestsRequest> request = new DefaultRequest<DescribeSpotFleetRequestsRequest>(describeSpotFleetRequestsRequest, "AmazonEC2");
        request.addParameter("Action", "DescribeSpotFleetRequests");
        request.addParameter("Version", "2015-10-01");

        java.util.List<String> spotFleetRequestIdsList = describeSpotFleetRequestsRequest.getSpotFleetRequestIds();
        int spotFleetRequestIdsListIndex = 1;

        for (String spotFleetRequestIdsListValue : spotFleetRequestIdsList) {
            if (spotFleetRequestIdsListValue != null) {
                request.addParameter("SpotFleetRequestId." + spotFleetRequestIdsListIndex, StringUtils.fromString(spotFleetRequestIdsListValue));
            }

            spotFleetRequestIdsListIndex++;
        }
        if (describeSpotFleetRequestsRequest.getNextToken() != null) {
            request.addParameter("NextToken", StringUtils.fromString(describeSpotFleetRequestsRequest.getNextToken()));
        }
        if (describeSpotFleetRequestsRequest.getMaxResults() != null) {
            request.addParameter("MaxResults", StringUtils.fromInteger(describeSpotFleetRequestsRequest.getMaxResults()));
        }

        return request;
    }
}
