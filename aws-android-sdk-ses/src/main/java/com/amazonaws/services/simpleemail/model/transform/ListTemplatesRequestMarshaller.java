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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListTemplatesRequest
 */
public class ListTemplatesRequestMarshaller implements
        Marshaller<Request<ListTemplatesRequest>, ListTemplatesRequest> {

    public Request<ListTemplatesRequest> marshall(ListTemplatesRequest listTemplatesRequest) {
        if (listTemplatesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListTemplatesRequest)");
        }

        Request<ListTemplatesRequest> request = new DefaultRequest<ListTemplatesRequest>(
                listTemplatesRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "ListTemplates");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (listTemplatesRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listTemplatesRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listTemplatesRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listTemplatesRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
