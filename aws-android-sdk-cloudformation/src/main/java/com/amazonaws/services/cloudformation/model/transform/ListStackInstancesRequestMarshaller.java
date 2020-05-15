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
 * StAX request marshaller for ListStackInstancesRequest
 */
public class ListStackInstancesRequestMarshaller implements
        Marshaller<Request<ListStackInstancesRequest>, ListStackInstancesRequest> {

    public Request<ListStackInstancesRequest> marshall(
            ListStackInstancesRequest listStackInstancesRequest) {
        if (listStackInstancesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListStackInstancesRequest)");
        }

        Request<ListStackInstancesRequest> request = new DefaultRequest<ListStackInstancesRequest>(
                listStackInstancesRequest, "AWSCloudFormation");
        request.addParameter("Action", "ListStackInstances");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listStackInstancesRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = listStackInstancesRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (listStackInstancesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listStackInstancesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listStackInstancesRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = listStackInstancesRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }
        if (listStackInstancesRequest.getStackInstanceAccount() != null) {
            prefix = "StackInstanceAccount";
            String stackInstanceAccount = listStackInstancesRequest.getStackInstanceAccount();
            request.addParameter(prefix, StringUtils.fromString(stackInstanceAccount));
        }
        if (listStackInstancesRequest.getStackInstanceRegion() != null) {
            prefix = "StackInstanceRegion";
            String stackInstanceRegion = listStackInstancesRequest.getStackInstanceRegion();
            request.addParameter(prefix, StringUtils.fromString(stackInstanceRegion));
        }

        return request;
    }
}
