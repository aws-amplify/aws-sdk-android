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
 * StAX request marshaller for DescribeDBEngineVersionsRequest
 */
public class DescribeDBEngineVersionsRequestMarshaller implements
        Marshaller<Request<DescribeDBEngineVersionsRequest>, DescribeDBEngineVersionsRequest> {

    public Request<DescribeDBEngineVersionsRequest> marshall(
            DescribeDBEngineVersionsRequest describeDBEngineVersionsRequest) {
        if (describeDBEngineVersionsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeDBEngineVersionsRequest)");
        }

        Request<DescribeDBEngineVersionsRequest> request = new DefaultRequest<DescribeDBEngineVersionsRequest>(
                describeDBEngineVersionsRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeDBEngineVersions");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeDBEngineVersionsRequest.getEngine() != null) {
            prefix = "Engine";
            String engine = describeDBEngineVersionsRequest.getEngine();
            request.addParameter(prefix, StringUtils.fromString(engine));
        }
        if (describeDBEngineVersionsRequest.getEngineVersion() != null) {
            prefix = "EngineVersion";
            String engineVersion = describeDBEngineVersionsRequest.getEngineVersion();
            request.addParameter(prefix, StringUtils.fromString(engineVersion));
        }
        if (describeDBEngineVersionsRequest.getDBParameterGroupFamily() != null) {
            prefix = "DBParameterGroupFamily";
            String dBParameterGroupFamily = describeDBEngineVersionsRequest
                    .getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
        }
        if (describeDBEngineVersionsRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeDBEngineVersionsRequest.getFilters();
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
        if (describeDBEngineVersionsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeDBEngineVersionsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeDBEngineVersionsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeDBEngineVersionsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }
        if (describeDBEngineVersionsRequest.getDefaultOnly() != null) {
            prefix = "DefaultOnly";
            Boolean defaultOnly = describeDBEngineVersionsRequest.getDefaultOnly();
            request.addParameter(prefix, StringUtils.fromBoolean(defaultOnly));
        }
        if (describeDBEngineVersionsRequest.getListSupportedCharacterSets() != null) {
            prefix = "ListSupportedCharacterSets";
            Boolean listSupportedCharacterSets = describeDBEngineVersionsRequest
                    .getListSupportedCharacterSets();
            request.addParameter(prefix, StringUtils.fromBoolean(listSupportedCharacterSets));
        }
        if (describeDBEngineVersionsRequest.getListSupportedTimezones() != null) {
            prefix = "ListSupportedTimezones";
            Boolean listSupportedTimezones = describeDBEngineVersionsRequest
                    .getListSupportedTimezones();
            request.addParameter(prefix, StringUtils.fromBoolean(listSupportedTimezones));
        }
        if (describeDBEngineVersionsRequest.getIncludeAll() != null) {
            prefix = "IncludeAll";
            Boolean includeAll = describeDBEngineVersionsRequest.getIncludeAll();
            request.addParameter(prefix, StringUtils.fromBoolean(includeAll));
        }

        return request;
    }
}
