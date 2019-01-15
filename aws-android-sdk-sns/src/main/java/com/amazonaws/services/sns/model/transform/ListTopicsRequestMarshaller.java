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

package com.amazonaws.services.sns.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.sns.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListTopicsRequest
 */
public class ListTopicsRequestMarshaller implements
        Marshaller<Request<ListTopicsRequest>, ListTopicsRequest> {

    public Request<ListTopicsRequest> marshall(ListTopicsRequest listTopicsRequest) {
        if (listTopicsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTopicsRequest)");
        }

        Request<ListTopicsRequest> request = new DefaultRequest<ListTopicsRequest>(
                listTopicsRequest, "AmazonSNS");
        request.addParameter("Action", "ListTopics");
        request.addParameter("Version", "2010-03-31");

        String prefix;
        if (listTopicsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listTopicsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }

        return request;
    }
}
