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
 * StAX request marshaller for DescribeReservedCacheNodesOfferingsRequest
 */
public class DescribeReservedCacheNodesOfferingsRequestMarshaller
        implements
        Marshaller<Request<DescribeReservedCacheNodesOfferingsRequest>, DescribeReservedCacheNodesOfferingsRequest> {

    public Request<DescribeReservedCacheNodesOfferingsRequest> marshall(
            DescribeReservedCacheNodesOfferingsRequest describeReservedCacheNodesOfferingsRequest) {
        if (describeReservedCacheNodesOfferingsRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(DescribeReservedCacheNodesOfferingsRequest)");
        }

        Request<DescribeReservedCacheNodesOfferingsRequest> request = new DefaultRequest<DescribeReservedCacheNodesOfferingsRequest>(
                describeReservedCacheNodesOfferingsRequest, "AmazonElastiCache");
        request.addParameter("Action", "DescribeReservedCacheNodesOfferings");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (describeReservedCacheNodesOfferingsRequest.getReservedCacheNodesOfferingId() != null) {
            prefix = "ReservedCacheNodesOfferingId";
            String reservedCacheNodesOfferingId = describeReservedCacheNodesOfferingsRequest
                    .getReservedCacheNodesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodesOfferingId));
        }
        if (describeReservedCacheNodesOfferingsRequest.getCacheNodeType() != null) {
            prefix = "CacheNodeType";
            String cacheNodeType = describeReservedCacheNodesOfferingsRequest.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (describeReservedCacheNodesOfferingsRequest.getDuration() != null) {
            prefix = "Duration";
            String duration = describeReservedCacheNodesOfferingsRequest.getDuration();
            request.addParameter(prefix, StringUtils.fromString(duration));
        }
        if (describeReservedCacheNodesOfferingsRequest.getProductDescription() != null) {
            prefix = "ProductDescription";
            String productDescription = describeReservedCacheNodesOfferingsRequest
                    .getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (describeReservedCacheNodesOfferingsRequest.getOfferingType() != null) {
            prefix = "OfferingType";
            String offeringType = describeReservedCacheNodesOfferingsRequest.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (describeReservedCacheNodesOfferingsRequest.getMaxRecords() != null) {
            prefix = "MaxRecords";
            Integer maxRecords = describeReservedCacheNodesOfferingsRequest.getMaxRecords();
            request.addParameter(prefix, StringUtils.fromInteger(maxRecords));
        }
        if (describeReservedCacheNodesOfferingsRequest.getMarker() != null) {
            prefix = "Marker";
            String marker = describeReservedCacheNodesOfferingsRequest.getMarker();
            request.addParameter(prefix, StringUtils.fromString(marker));
        }

        return request;
    }
}
