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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeOptionGroupsRequest
 */
public class DescribeOptionGroupsRequestMarshaller implements
        Marshaller<Request<DescribeOptionGroupsRequest>, DescribeOptionGroupsRequest> {

    public Request<DescribeOptionGroupsRequest> marshall(
            DescribeOptionGroupsRequest describeOptionGroupsRequest) {
        if (describeOptionGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeOptionGroupsRequest)");
        }

        Request<DescribeOptionGroupsRequest> request = new DefaultRequest<DescribeOptionGroupsRequest>(
                describeOptionGroupsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeOptionGroups");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeOptionGroupsRequest.getOptionGroupName() != null) {
            prefix = "OptionGroupName";
            String optionGroupName = describeOptionGroupsRequest.getOptionGroupName();
            request.addParameter(prefix, StringUtils.fromString(optionGroupName));
        }
        if (describeOptionGroupsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeOptionGroupsRequest.getFilters();
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
        if (describeOptionGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeOptionGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeOptionGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeOptionGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeOptionGroupsRequest.getEngineName() != null) {
            prefix = "EngineName";
            String engineName = describeOptionGroupsRequest.getEngineName();
            request.addParameter(prefix, StringUtils.fromString(engineName));
        }
        if (describeOptionGroupsRequest.getMajorEngineVersion() != null) {
            prefix = "MajorEngineVersion";
            String majorEngineVersion = describeOptionGroupsRequest.getMajorEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(majorEngineVersion));
        }

        return request;
    }
}
