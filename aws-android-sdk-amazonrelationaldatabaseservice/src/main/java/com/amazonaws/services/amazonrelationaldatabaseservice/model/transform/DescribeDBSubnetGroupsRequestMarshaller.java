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

package com.amazonaws.services.amazonrelationaldatabaseservice.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeDBSubnetGroupsRequest
 */
public class DescribeDBSubnetGroupsRequestMarshaller implements
        Marshaller<Request<DescribeDBSubnetGroupsRequest>, DescribeDBSubnetGroupsRequest> {

    public Request<DescribeDBSubnetGroupsRequest> marshall(
            DescribeDBSubnetGroupsRequest describeDBSubnetGroupsRequest) {
        if (describeDBSubnetGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBSubnetGroupsRequest)");
        }

        Request<DescribeDBSubnetGroupsRequest> request = new DefaultRequest<DescribeDBSubnetGroupsRequest>(
                describeDBSubnetGroupsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBSubnetGroups");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBSubnetGroupsRequest.getDBSubnetGroupName() != null) {
            prefix = "DBSubnetGroupName";
            String dBSubnetGroupName = describeDBSubnetGroupsRequest.getDBSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(dBSubnetGroupName));
        }
        if (describeDBSubnetGroupsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBSubnetGroupsRequest.getFilters();
            int filtersIndex = 1;
            String filtersPrefix = prefix;
            for (Filter filtersItem : filters) {
                prefix = filtersPrefix + "." + filtersIndex;
                if (filtersItem != null) {
                    FilterStaxMarshaller.getInstance().marshall(filtersItem, request, prefix + ".");
                }
                filtersIndex++;
            }
            prefix = filtersPrefix;
        }
        if (describeDBSubnetGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBSubnetGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBSubnetGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBSubnetGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
