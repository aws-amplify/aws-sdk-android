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
 * StAX request marshaller for ListStacksRequest
 */
public class ListStacksRequestMarshaller implements
        Marshaller<Request<ListStacksRequest>, ListStacksRequest> {

    public Request<ListStacksRequest> marshall(ListStacksRequest listStacksRequest) {
        if (listStacksRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListStacksRequest)");
        }

        Request<ListStacksRequest> request = new DefaultRequest<ListStacksRequest>(
                listStacksRequest, "AWSCloudFormation");
        request.addParameter("Action", "ListStacks");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listStacksRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listStacksRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listStacksRequest.getStackStatusFilter() != null) {
            prefix = "StackStatusFilter";
            java.util.List<String> stackStatusFilter = listStacksRequest.getStackStatusFilter();
            int stackStatusFilterIndex = 1;
            String stackStatusFilterPrefix = prefix;
            for (String stackStatusFilterItem : stackStatusFilter) {
                prefix = stackStatusFilterPrefix + ".member." + stackStatusFilterIndex;
                if (stackStatusFilterItem != null) {
                    request.addParameter(prefix, StringUtils.fromString(stackStatusFilterItem));
                }
                stackStatusFilterIndex++;
            }
            prefix = stackStatusFilterPrefix;
        }

        return request;
    }
}
