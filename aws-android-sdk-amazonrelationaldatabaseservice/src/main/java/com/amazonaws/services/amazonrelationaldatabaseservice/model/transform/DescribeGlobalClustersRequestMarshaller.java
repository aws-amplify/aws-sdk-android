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
 * StAX request marshaller for DescribeGlobalClustersRequest
 */
public class DescribeGlobalClustersRequestMarshaller implements
        Marshaller<Request<DescribeGlobalClustersRequest>, DescribeGlobalClustersRequest> {

    public Request<DescribeGlobalClustersRequest> marshall(
            DescribeGlobalClustersRequest describeGlobalClustersRequest) {
        if (describeGlobalClustersRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeGlobalClustersRequest)");
        }

        Request<DescribeGlobalClustersRequest> request = new DefaultRequest<DescribeGlobalClustersRequest>(
                describeGlobalClustersRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "DescribeGlobalClusters");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (describeGlobalClustersRequest.getGlobalClusterIdentifier() != null) {
            prefix = "GlobalClusterIdentifier";
            String globalClusterIdentifier = describeGlobalClustersRequest
                    .getGlobalClusterIdentifier();
            request.addParameter(prefix, StringUtils.fromString(globalClusterIdentifier));
        }
        if (describeGlobalClustersRequest.getFilters() != null) {
            prefix = "Filters";
            java.util.List<Filter> filters = describeGlobalClustersRequest.getFilters();
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
        if (describeGlobalClustersRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeGlobalClustersRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeGlobalClustersRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeGlobalClustersRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
