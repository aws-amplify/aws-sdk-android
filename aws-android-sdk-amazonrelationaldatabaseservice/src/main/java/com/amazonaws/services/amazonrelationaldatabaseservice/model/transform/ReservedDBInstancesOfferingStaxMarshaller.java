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

import com.amazonaws.Request;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReservedDBInstancesOffering
 */
class ReservedDBInstancesOfferingStaxMarshaller {

    public void marshall(ReservedDBInstancesOffering _reservedDBInstancesOffering,
            Request<?> request, String _prefix) {
        String prefix;
        if (_reservedDBInstancesOffering.getReservedDBInstancesOfferingId() != null) {
            prefix = _prefix + "ReservedDBInstancesOfferingId";
            String reservedDBInstancesOfferingId = _reservedDBInstancesOffering
                    .getReservedDBInstancesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstancesOfferingId));
        }
        if (_reservedDBInstancesOffering.getDBInstanceClass() != null) {
            prefix = _prefix + "DBInstanceClass";
            String dBInstanceClass = _reservedDBInstancesOffering.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (_reservedDBInstancesOffering.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _reservedDBInstancesOffering.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_reservedDBInstancesOffering.getFixedPrice() != null) {
            prefix = _prefix + "FixedPrice";
            Double fixedPrice = _reservedDBInstancesOffering.getFixedPrice();
            request.addParameter(prefix, StringUtils.fromDouble(fixedPrice));
        }
        if (_reservedDBInstancesOffering.getUsagePrice() != null) {
            prefix = _prefix + "UsagePrice";
            Double usagePrice = _reservedDBInstancesOffering.getUsagePrice();
            request.addParameter(prefix, StringUtils.fromDouble(usagePrice));
        }
        if (_reservedDBInstancesOffering.getCurrencyCode() != null) {
            prefix = _prefix + "CurrencyCode";
            String currencyCode = _reservedDBInstancesOffering.getCurrencyCode();
            request.addParameter(prefix, StringUtils.fromString(currencyCode));
        }
        if (_reservedDBInstancesOffering.getProductDescription() != null) {
            prefix = _prefix + "ProductDescription";
            String productDescription = _reservedDBInstancesOffering.getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (_reservedDBInstancesOffering.getOfferingType() != null) {
            prefix = _prefix + "OfferingType";
            String offeringType = _reservedDBInstancesOffering.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (_reservedDBInstancesOffering.getMultiAZ() != null) {
            prefix = _prefix + "MultiAZ";
            Boolean multiAZ = _reservedDBInstancesOffering.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (_reservedDBInstancesOffering.getRecurringCharges() != null) {
            prefix = _prefix + "RecurringCharges";
            java.util.List<RecurringCharge> recurringCharges = _reservedDBInstancesOffering
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

    private static ReservedDBInstancesOfferingStaxMarshaller instance;

    public static ReservedDBInstancesOfferingStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedDBInstancesOfferingStaxMarshaller();
        return instance;
    }
}
