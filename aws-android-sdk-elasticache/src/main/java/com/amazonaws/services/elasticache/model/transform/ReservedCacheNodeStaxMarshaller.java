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

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReservedCacheNode
 */
class ReservedCacheNodeStaxMarshaller {

    public void marshall(ReservedCacheNode _reservedCacheNode, Request<?> request, String _prefix) {
        String prefix;
        if (_reservedCacheNode.getReservedCacheNodeId() != null) {
            prefix = _prefix + "ReservedCacheNodeId";
            String reservedCacheNodeId = _reservedCacheNode.getReservedCacheNodeId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodeId));
        }
        if (_reservedCacheNode.getReservedCacheNodesOfferingId() != null) {
            prefix = _prefix + "ReservedCacheNodesOfferingId";
            String reservedCacheNodesOfferingId = _reservedCacheNode
                    .getReservedCacheNodesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodesOfferingId));
        }
        if (_reservedCacheNode.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _reservedCacheNode.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_reservedCacheNode.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _reservedCacheNode.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_reservedCacheNode.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _reservedCacheNode.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_reservedCacheNode.getFixedPrice() != null) {
            prefix = _prefix + "FixedPrice";
            Double fixedPrice = _reservedCacheNode.getFixedPrice();
            request.addParameter(prefix, StringUtils.fromDouble(fixedPrice));
        }
        if (_reservedCacheNode.getUsagePrice() != null) {
            prefix = _prefix + "UsagePrice";
            Double usagePrice = _reservedCacheNode.getUsagePrice();
            request.addParameter(prefix, StringUtils.fromDouble(usagePrice));
        }
        if (_reservedCacheNode.getCacheNodeCount() != null) {
            prefix = _prefix + "CacheNodeCount";
            Integer cacheNodeCount = _reservedCacheNode.getCacheNodeCount();
            request.addParameter(prefix, StringUtils.fromInteger(cacheNodeCount));
        }
        if (_reservedCacheNode.getProductDescription() != null) {
            prefix = _prefix + "ProductDescription";
            String productDescription = _reservedCacheNode.getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (_reservedCacheNode.getOfferingType() != null) {
            prefix = _prefix + "OfferingType";
            String offeringType = _reservedCacheNode.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (_reservedCacheNode.getState() != null) {
            prefix = _prefix + "State";
            String state = _reservedCacheNode.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_reservedCacheNode.getRecurringCharges() != null) {
            prefix = _prefix + "RecurringCharges";
            java.util.List<RecurringCharge> recurringCharges = _reservedCacheNode
                    .getRecurringCharges();
            int recurringChargesIndex = 1;
            String recurringChargesPrefix = prefix;
            for (RecurringCharge recurringChargesItem : recurringCharges) {
                prefix = recurringChargesPrefix + "." + recurringChargesIndex;
                if (recurringChargesItem != null) {
                    RecurringChargeStaxMarshaller.getInstance().marshall(recurringChargesItem,
                            request, prefix + ".");
                }
                recurringChargesIndex++;
            }
            prefix = recurringChargesPrefix;
        }
        if (_reservedCacheNode.getReservationARN() != null) {
            prefix = _prefix + "ReservationARN";
            String reservationARN = _reservedCacheNode.getReservationARN();
            request.addParameter(prefix, StringUtils.fromString(reservationARN));
        }
    }

    private static ReservedCacheNodeStaxMarshaller instance;

    public static ReservedCacheNodeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedCacheNodeStaxMarshaller();
        return instance;
    }
}
