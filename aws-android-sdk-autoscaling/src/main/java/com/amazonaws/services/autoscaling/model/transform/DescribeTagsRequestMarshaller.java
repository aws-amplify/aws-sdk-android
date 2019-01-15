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

package com.amazonaws.services.autoscaling.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.autoscaling.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeTagsRequest
 */
public class DescribeTagsRequestMarshaller implements
        Marshaller<Request<DescribeTagsRequest>, DescribeTagsRequest> {

    public Request<DescribeTagsRequest> marshall(DescribeTagsRequest describeTagsRequest) {
        if (describeTagsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeTagsRequest)");
        }

        Request<DescribeTagsRequest> request = new DefaultRequest<DescribeTagsRequest>(
                describeTagsRequest, "AmazonAutoScaling");
        request.addParameter("Action", "DescribeTags");
        request.addParameter("Version", "2011-01-01");

        String prefix;
        if (describeTagsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeTagsRequest.getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (Filter filtersItem : filters) {
                prefix = filtersPrefix + ".member." + filtersIndex;
                if (filtersItem != null) {
                    FilterStaxMarshaller.getInstance().marshall(filtersItem, request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeTagsRequest.getNextToken() != null) {
            prefix = "NextToken";
            String nextToken = describeTagsRequest.getNextToken();
            request.addParameter(prefix, StringUtils.fromString(nextToken));
        }
        if (describeTagsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeTagsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }

        return request;
    }
}
