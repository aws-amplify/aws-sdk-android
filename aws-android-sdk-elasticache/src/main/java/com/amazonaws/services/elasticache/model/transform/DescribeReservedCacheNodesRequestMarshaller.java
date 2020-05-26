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
 * StAX request marshaller for DescribeReservedCacheNodesRequest
 */
public class DescribeReservedCacheNodesRequestMarshaller implements
        Marshaller<Request<DescribeReservedCacheNodesRequest>, DescribeReservedCacheNodesRequest> {

    public Request<DescribeReservedCacheNodesRequest> marshall(
            DescribeReservedCacheNodesRequest describeReservedCacheNodesRequest) {
        if (describeReservedCacheNodesRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReservedCacheNodesRequest)");
        }

        Request<DescribeReservedCacheNodesRequest> request = new DefaultRequest<DescribeReservedCacheNodesRequest>(
                describeReservedCacheNodesRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeReservedCacheNodes");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeReservedCacheNodesRequest.getReservedCacheNodeId() != null) {
            prefix = "ReservedCacheNodeId";
            String reservedCacheNodeId = describeReservedCacheNodesRequest.getReservedCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodeId));
        }
        if (describeReservedCacheNodesRequest.getReservedCacheNodesOfferingId() != null) {
            prefix = "ReservedCacheNodesOfferingId";
            String reservedCacheNodesOfferingId = describeReservedCacheNodesRequest
                    .getReservedCacheNodesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodesOfferingId));
        }
        if (describeReservedCacheNodesRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = describeReservedCacheNodesRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (describeReservedCacheNodesRequest.getDuration() != null) {
            prefix = "Duration";
            String duration = describeReservedCacheNodesRequest.getDuration();
            request.addParameter(prefix, StringUtils.fromString(duration));
        }
        if (describeReservedCacheNodesRequest.getProductDescription() != null) {
            prefix = "ProductDescription";
            String productDescription = describeReservedCacheNodesRequest.getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (describeReservedCacheNodesRequest.getOfferingType() != null) {
            prefix = "OfferingType";
            String offeringType = describeReservedCacheNodesRequest.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (describeReservedCacheNodesRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeReservedCacheNodesRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeReservedCacheNodesRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeReservedCacheNodesRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
