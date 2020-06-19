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
 * StAX marshaller for POJO ReservedCacheNodesOffering
 */
class ReservedCacheNodesOfferingStaxMarshaller {

    public void marshall(ReservedCacheNodesOffering _reservedCacheNodesOffering,
            Request<?> request, String _prefix) {
        String prefix;
        if (_reservedCacheNodesOffering.getReservedCacheNodesOfferingId() != null) {
            prefix = _prefix + "ReservedCacheNodesOfferingId";
            String reservedCacheNodesOfferingId = _reservedCacheNodesOffering
                    .getReservedCacheNodesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedCacheNodesOfferingId));
        }
        if (_reservedCacheNodesOffering.getCacheNodeType() != null) {
            prefix = _prefix + "CacheNodeType";
            String cacheNodeType = _reservedCacheNodesOffering.getCacheNodeType();
            request.addParameter(prefix, StringUtils.fromString(cacheNodeType));
        }
        if (_reservedCacheNodesOffering.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _reservedCacheNodesOffering.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_reservedCacheNodesOffering.getFixedPrice() != null) {
            prefix = _prefix + "FixedPrice";
            Double fixedPrice = _reservedCacheNodesOffering.getFixedPrice();
            request.addParameter(prefix, StringUtils.fromDouble(fixedPrice));
        }
        if (_reservedCacheNodesOffering.getUsagePrice() != null) {
            prefix = _prefix + "UsagePrice";
            Double usagePrice = _reservedCacheNodesOffering.getUsagePrice();
            request.addParameter(prefix, StringUtils.fromDouble(usagePrice));
        }
        if (_reservedCacheNodesOffering.getProductDescription() != null) {
            prefix = _prefix + "ProductDescription";
            String productDescription = _reservedCacheNodesOffering.getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (_reservedCacheNodesOffering.getOfferingType() != null) {
            prefix = _prefix + "OfferingType";
            String offeringType = _reservedCacheNodesOffering.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (_reservedCacheNodesOffering.getRecurringCharges() != null) {
            prefix = _prefix + "RecurringCharges";
            java.util.List<RecurringCharge> recurringCharges = _reservedCacheNodesOffering
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
    }

    private static ReservedCacheNodesOfferingStaxMarshaller instance;

    public static ReservedCacheNodesOfferingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedCacheNodesOfferingStaxMarshaller();
        return instance;
    }
}
