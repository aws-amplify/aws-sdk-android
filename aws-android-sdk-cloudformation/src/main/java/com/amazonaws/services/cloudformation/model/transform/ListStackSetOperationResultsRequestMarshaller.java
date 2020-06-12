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
 * StAX request marshaller for ListStackSetOperationResultsRequest
 */
public class ListStackSetOperationResultsRequestMarshaller
        implements
        Marshaller<Request<ListStackSetOperationResultsRequest>, ListStackSetOperationResultsRequest> {

    public Request<ListStackSetOperationResultsRequest> marshall(
            ListStackSetOperationResultsRequest listStackSetOperationResultsRequest) {
        if (listStackSetOperationResultsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListStackSetOperationResultsRequest)");
        }

        Request<ListStackSetOperationResultsRequest> request = new DefaultRequest<ListStackSetOperationResultsRequest>(
                listStackSetOperationResultsRequest, "AWSCloudFormation");
        request.addParameter("Action", "ListStackSetOperationResults");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listStackSetOperationResultsRequest.getStackSetName() != null) {
            prefix = "StackSetName";
            String stackSetName = listStackSetOperationResultsRequest.getStackSetName();
            request.addParameter(prefix, StringUtils.fromString(stackSetName));
        }
        if (listStackSetOperationResultsRequest.getOperationId() != null) {
            prefix = "OperationId";
            String operationId = listStackSetOperationResultsRequest.getOperationId();
            request.addParameter(prefix, StringUtils.fromString(operationId));
        }
        if (listStackSetOperationResultsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listStackSetOperationResultsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listStackSetOperationResultsRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = listStackSetOperationResultsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }

        return request;
    }
}
