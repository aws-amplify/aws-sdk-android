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
 * StAX request marshaller for ListStackSetsRequest
 */
public class ListStackSetsRequestMarshaller implements
        Marshaller<Request<ListStackSetsRequest>, ListStackSetsRequest> {

    public Request<ListStackSetsRequest> marshall(ListStackSetsRequest listStackSetsRequest) {
        if (listStackSetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListStackSetsRequest)");
        }

        Request<ListStackSetsRequest> request = new DefaultRequest<ListStackSetsRequest>(
                listStackSetsRequest, "AWSCloudFormation");
        request.addParameter("Action", "ListStackSets");
        request.addParameter("Version", "2010-05-15");

        String prefix;
        if (listStackSetsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listStackSetsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listStackSetsRequest.getMaxResults() != null) {
            prefix = "MaxResults";
            Integer maxResults = listStackSetsRequest.getMaxResults();
            request.addParameter(prefix, StringUtils.fromInteger(maxResults));
        }
        if (listStackSetsRequest.getStatus() != null) {
            prefix = "Status";
            String status = listStackSetsRequest.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }

        return request;
    }
}
