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
 * StAX request marshaller for ListConfigurationSetsRequest
 */
public class ListConfigurationSetsRequestMarshaller implements
        Marshaller<Request<ListConfigurationSetsRequest>, ListConfigurationSetsRequest> {

    public Request<ListConfigurationSetsRequest> marshall(
            ListConfigurationSetsRequest listConfigurationSetsRequest) {
        if (listConfigurationSetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListConfigurationSetsRequest)");
        }

        Request<ListConfigurationSetsRequest> request = new DefaultRequest<ListConfigurationSetsRequest>(
                listConfigurationSetsRequest, "AmazonSimpleEmailService");
        request.addParameter("Action", "ListConfigurationSets");
        request.addParameter("Version", "2010-12-01");

        String prefix;
        if (listConfigurationSetsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = listConfigurationSetsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (listConfigurationSetsRequest.getMaxItems() != null) {
            prefix = "MaxItems";
            Integer maxItems = listConfigurationSetsRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromInteger(maxItems));
        }

        return request;
    }
}
