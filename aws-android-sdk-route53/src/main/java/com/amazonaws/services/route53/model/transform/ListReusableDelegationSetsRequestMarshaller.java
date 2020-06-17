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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for ListReusableDelegationSetsRequest
 */
public class ListReusableDelegationSetsRequestMarshaller implements
        Marshaller<Request<ListReusableDelegationSetsRequest>, ListReusableDelegationSetsRequest> {

    public Request<ListReusableDelegationSetsRequest> marshall(
            ListReusableDelegationSetsRequest listReusableDelegationSetsRequest) {
        if (listReusableDelegationSetsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(ListReusableDelegationSetsRequest)");
        }

        Request<ListReusableDelegationSetsRequest> request = new DefaultRequest<ListReusableDelegationSetsRequest>(
                listReusableDelegationSetsRequest, "AmazonRoute53");
        request.addParameter("Action", "ListReusableDelegationSets");
        request.addParameter("Version", "2013-04-01");

        String prefix;
        if (listReusableDelegationSetsRequest.getMarker() != null) {
            prefix = "marker";
            String marker = listReusableDelegationSetsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (listReusableDelegationSetsRequest.getMaxItems() != null) {
            prefix = "maxitems";
            String maxItems = listReusableDelegationSetsRequest.getMaxItems();
            request.addParameter(prefix, StringUtils.fromString(maxItems));
        }

        return request;
    }
}
