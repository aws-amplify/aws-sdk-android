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
 * StAX marshaller for POJO ReservedNode
 */
class ReservedNodeStaxMarshaller {

    public void marshall(ReservedNode _reservedNode, Request<?> request, String _prefix) {
        String prefix;
        if (_reservedNode.getReservedNodeId() != null) {
            prefix = _prefix + "ReservedNodeId";
            String reservedNodeId = _reservedNode.getReservedNodeId();
            request.addParameter(prefix, StringUtils.fromString(reservedNodeId));
        }
        if (_reservedNode.getReservedNodeOfferingId() != null) {
            prefix = _prefix + "ReservedNodeOfferingId";
            String reservedNodeOfferingId = _reservedNode.getReservedNodeOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedNodeOfferingId));
        }
        if (_reservedNode.getNodeType() != null) {
            prefix = _prefix + "NodeType";
            String nodeType = _reservedNode.getNodeType();
            request.addParameter(prefix, StringUtils.fromString(nodeType));
        }
        if (_reservedNode.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _reservedNode.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_reservedNode.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _reservedNode.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_reservedNode.getFixedPrice() != null) {
            prefix = _prefix + "FixedPrice";
            Double fixedPrice = _reservedNode.getFixedPrice();
            request.addParameter(prefix, StringUtils.fromDouble(fixedPrice));
        }
        if (_reservedNode.getUsagePrice() != null) {
            prefix = _prefix + "UsagePrice";
            Double usagePrice = _reservedNode.getUsagePrice();
            request.addParameter(prefix, StringUtils.fromDouble(usagePrice));
        }
        if (_reservedNode.getCurrencyCode() != null) {
            prefix = _prefix + "CurrencyCode";
            String currencyCode = _reservedNode.getCurrencyCode();
            request.addParameter(prefix, StringUtils.fromString(currencyCode));
        }
        if (_reservedNode.getNodeCount() != null) {
            prefix = _prefix + "NodeCount";
            Integer nodeCount = _reservedNode.getNodeCount();
            request.addParameter(prefix, StringUtils.fromInteger(nodeCount));
        }
        if (_reservedNode.getState() != null) {
            prefix = _prefix + "State";
            String state = _reservedNode.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_reservedNode.getOfferingType() != null) {
            prefix = _prefix + "OfferingType";
            String offeringType = _reservedNode.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (_reservedNode.getRecurringCharges() != null) {
            prefix = _prefix + "RecurringCharges";
            java.util.List<RecurringCharge> recurringCharges = _reservedNode.getRecurringCharges();
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
        if (_reservedNode.getReservedNodeOfferingType() != null) {
            prefix = _prefix + "ReservedNodeOfferingType";
            String reservedNodeOfferingType = _reservedNode.getReservedNodeOfferingType();
            request.addParameter(prefix, StringUtils.fromString(reservedNodeOfferingType));
        }
    }

    private static ReservedNodeStaxMarshaller instance;

    public static ReservedNodeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedNodeStaxMarshaller();
        return instance;
    }
}
