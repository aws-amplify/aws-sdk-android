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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for DescribeCacheSubnetGroupsRequest
 */
public class DescribeCacheSubnetGroupsRequestMarshaller implements
        Marshaller<Request<DescribeCacheSubnetGroupsRequest>, DescribeCacheSubnetGroupsRequest> {

    public Request<DescribeCacheSubnetGroupsRequest> marshall(
            DescribeCacheSubnetGroupsRequest describeCacheSubnetGroupsRequest) {
        if (describeCacheSubnetGroupsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeCacheSubnetGroupsRequest)");
        }

        Request<DescribeCacheSubnetGroupsRequest> request = new DefaultRequest<DescribeCacheSubnetGroupsRequest>(
                describeCacheSubnetGroupsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeCacheSubnetGroups");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeCacheSubnetGroupsRequest.getCacheSubnetGroupName() != null) {
            prefix = "CacheSubnetGroupName";
            String cacheSubnetGroupName = describeCacheSubnetGroupsRequest
                    .getCacheSubnetGroupName();
            request.addParameter(prefix, StringUtils.fromString(cacheSubnetGroupName));
        }
        if (describeCacheSubnetGroupsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeCacheSubnetGroupsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeCacheSubnetGroupsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeCacheSubnetGroupsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
