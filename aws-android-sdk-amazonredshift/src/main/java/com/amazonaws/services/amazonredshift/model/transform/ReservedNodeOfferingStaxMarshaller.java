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

package com.amazonaws.services.amazonredshift.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonredshift.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReservedNodeOffering
 */
class ReservedNodeOfferingStaxMarshaller {

    public void marshall(ReservedNodeOffering _reservedNodeOffering, Request<?> request,
            String _prefix) {
        String prefix;
        if (_reservedNodeOffering.getReservedNodeOfferingId() != null) {
            prefix = _prefix + "ReservedNodeOfferingId";
            String reservedNodeOfferingId = _reservedNodeOffering.getReservedNodeOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedNodeOfferingId));
        }
        if (_reservedNodeOffering.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _reservedNodeOffering.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_reservedNodeOffering.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _reservedNodeOffering.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_reservedNodeOffering.getFixedPrice() != null) {
            prefix = _prefix + "FixedPrice";
            Double fixedPrice = _reservedNodeOffering.getFixedPrice();
            request.addParameter(prefix, StringUtils.fromDouble(fixedPrice));
        }
        if (_reservedNodeOffering.getUsagePrice() != null) {
            prefix = _prefix + "UsagePrice";
            Double usagePrice = _reservedNodeOffering.getUsagePrice();
            request.addParameter(prefix, StringUtils.fromDouble(usagePrice));
        }
        if (_reservedNodeOffering.getCurrencyCode() != null) {
            prefix = _prefix + "CurrencyCode";
            String currencyCode = _reservedNodeOffering.getCurrencyCode();
            request.addParameter(prefix, StringUtils.fromString(currencyCode));
        }
        if (_reservedNodeOffering.getOfferingType() != null) {
            prefix = _prefix + "OfferingType";
            String offeringType = _reservedNodeOffering.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (_reservedNodeOffering.getRecurringCharges() != null) {
            prefix = _prefix + "RecurringCharges";
            java.util.List<RecurringCharge> recurringCharges = _reservedNodeOffering
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
        if (_reservedNodeOffering.getReservedNodeOfferingType() != null) {
            prefix = _prefix + "ReservedNodeOfferingType";
            String reservedNodeOfferingType = _reservedNodeOffering.getReservedNodeOfferingType();
            request.addParameter(prefix, StringUtils.fromString(reservedNodeOfferingType));
        }
    }

    private static ReservedNodeOfferingStaxMarshaller instance;

    public static ReservedNodeOfferingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeOfferingStaxMarshaller();
        return instance;
    }
}
