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
 * StAX request marshaller for DescribeEngineDefaultClusterParametersRequest
 */
public class DescribeEngineDefaultClusterParametersRequestMarshaller
        implements
        Marshaller<Request<DescribeEngineDefaultClusterParametersRequest>, DescribeEngineDefaultClusterParametersRequest> {

    public Request<DescribeEngineDefaultClusterParametersRequest> marshall(
            DescribeEngineDefaultClusterParametersRequest describeEngineDefaultClusterParametersRequest) {
        if (describeEngineDefaultClusterParametersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeEngineDefaultClusterParametersRequest)");
        }

        Request<DescribeEngineDefaultClusterParametersRequest> request = new DefaultRequest<DescribeEngineDefaultClusterParametersRequest>(
                describeEngineDefaultClusterParametersRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeEngineDefaultClusterParameters");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeEngineDefaultClusterParametersRequest.getDBParameterGroupFamily() != null) {
            prefix = "DBParameterGroupFamily";
            String dBParameterGroupFamily = describeEngineDefaultClusterParametersRequest
                    .getDBParameterGroupFamily();
            request.addParameter(prefix, StringUtils.fromString(dBParameterGroupFamily));
        }
        if (describeEngineDefaultClusterParametersRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeEngineDefaultClusterParametersRequest
                    .getFilters();
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
        if (describeEngineDefaultClusterParametersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeEngineDefaultClusterParametersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeEngineDefaultClusterParametersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeEngineDefaultClusterParametersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
