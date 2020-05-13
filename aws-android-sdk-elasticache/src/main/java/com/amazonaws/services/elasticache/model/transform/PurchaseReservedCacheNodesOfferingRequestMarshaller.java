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
 * StAX request marshaller for PurchaseReservedCacheNodesOfferingRequest
 */
public class PurchaseReservedCacheNodesOfferingRequestMarshaller
        implements
        Marshaller<Request<PurchaseReservedCacheNodesOfferingRequest>, PurchaseReservedCacheNodesOfferingRequest> {

    public Request<PurchaseReservedCacheNodesOfferingRequest> marshall(
            PurchaseReservedCacheNodesOfferingRequest purchaseReservedCacheNodesOfferingRequest) {
        if (purchaseReservedCacheNodesOfferingRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(PurchaseReservedCacheNodesOfferingRequest)");
        }

        Request<PurchaseReservedCacheNodesOfferingRequest> request = new DefaultRequest<PurchaseReservedCacheNodesOfferingRequest>(
                purchaseReservedCacheNodesOfferingRequest, "AmazonElastiCache");
        request.addParameter("Action", "PurchaseReservedCacheNodesOffering");
        request.addParameter("Version", "2015-02-02");

        String prefix;
        if (purchaseReservedCacheNodesOfferingRequest.getReservedCacheNodesOfferingId() != null) {
            prefix = "ReservedCacheNodesOfferingId";
            String reservedCacheNodesOfferingId = purchaseReservedCacheNodesOfferingRequest
                    .getReservedCacheNodesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodesOfferingId));
        }
        if (purchaseReservedCacheNodesOfferingRequest.getReservedCacheNodeId() != null) {
            prefix = "ReservedCacheNodeId";
            String reservedCacheNodeId = purchaseReservedCacheNodesOfferingRequest
                    .getReservedCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodeId));
        }
        if (purchaseReservedCacheNodesOfferingRequest.getCacheNodeCount() != null) {
            prefix = "CacheNodeCount";
            Integer cacheNodeCount = purchaseReservedCacheNodesOfferingRequest.getCacheNodeCount();
            request.addParameter(prefix, StringUtils.fromInteger(cacheNodeCount));
        }

        return request;
    }
}
