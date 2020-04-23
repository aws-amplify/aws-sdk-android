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
 * StAX marshaller for POJO ReservedDBInstance
 */
class ReservedDBInstanceStaxMarshaller {

    public void marshall(ReservedDBInstance _reservedDBInstance, Request<?> request, String _prefix) {
        String prefix;
        if (_reservedDBInstance.getReservedDBInstanceId() != null) {
            prefix = _prefix + "ReservedDBInstanceId";
            String reservedDBInstanceId = _reservedDBInstance.getReservedDBInstanceId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstanceId));
        }
        if (_reservedDBInstance.getReservedDBInstancesOfferingId() != null) {
            prefix = _prefix + "ReservedDBInstancesOfferingId";
            String reservedDBInstancesOfferingId = _reservedDBInstance
                    .getReservedDBInstancesOfferingId();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstancesOfferingId));
        }
        if (_reservedDBInstance.getDBInstanceClass() != null) {
            prefix = _prefix + "DBInstanceClass";
            String dBInstanceClass = _reservedDBInstance.getDBInstanceClass();
            request.addParameter(prefix, StringUtils.fromString(dBInstanceClass));
        }
        if (_reservedDBInstance.getStartTime() != null) {
            prefix = _prefix + "StartTime";
            java.util.Date startTime = _reservedDBInstance.getStartTime();
            request.addParameter(prefix, StringUtils.fromDate(startTime));
        }
        if (_reservedDBInstance.getDuration() != null) {
            prefix = _prefix + "Duration";
            Integer duration = _reservedDBInstance.getDuration();
            request.addParameter(prefix, StringUtils.fromInteger(duration));
        }
        if (_reservedDBInstance.getFixedPrice() != null) {
            prefix = _prefix + "FixedPrice";
            Double fixedPrice = _reservedDBInstance.getFixedPrice();
            request.addParameter(prefix, StringUtils.fromDouble(fixedPrice));
        }
        if (_reservedDBInstance.getUsagePrice() != null) {
            prefix = _prefix + "UsagePrice";
            Double usagePrice = _reservedDBInstance.getUsagePrice();
            request.addParameter(prefix, StringUtils.fromDouble(usagePrice));
        }
        if (_reservedDBInstance.getCurrencyCode() != null) {
            prefix = _prefix + "CurrencyCode";
            String currencyCode = _reservedDBInstance.getCurrencyCode();
            request.addParameter(prefix, StringUtils.fromString(currencyCode));
        }
        if (_reservedDBInstance.getDBInstanceCount() != null) {
            prefix = _prefix + "DBInstanceCount";
            Integer dBInstanceCount = _reservedDBInstance.getDBInstanceCount();
            request.addParameter(prefix, StringUtils.fromInteger(dBInstanceCount));
        }
        if (_reservedDBInstance.getProductDescription() != null) {
            prefix = _prefix + "ProductDescription";
            String productDescription = _reservedDBInstance.getProductDescription();
            request.addParameter(prefix, StringUtils.fromString(productDescription));
        }
        if (_reservedDBInstance.getOfferingType() != null) {
            prefix = _prefix + "OfferingType";
            String offeringType = _reservedDBInstance.getOfferingType();
            request.addParameter(prefix, StringUtils.fromString(offeringType));
        }
        if (_reservedDBInstance.getMultiAZ() != null) {
            prefix = _prefix + "MultiAZ";
            Boolean multiAZ = _reservedDBInstance.getMultiAZ();
            request.addParameter(prefix, StringUtils.fromBoolean(multiAZ));
        }
        if (_reservedDBInstance.getState() != null) {
            prefix = _prefix + "State";
            String state = _reservedDBInstance.getState();
            request.addParameter(prefix, StringUtils.fromString(state));
        }
        if (_reservedDBInstance.getRecurringCharges() != null) {
            prefix = _prefix + "RecurringCharges";
            java.util.List<RecurringCharge> recurringCharges = _reservedDBInstance
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
        if (_reservedDBInstance.getReservedDBInstanceArn() != null) {
            prefix = _prefix + "ReservedDBInstanceArn";
            String reservedDBInstanceArn = _reservedDBInstance.getReservedDBInstanceArn();
            request.addParameter(prefix, StringUtils.fromString(reservedDBInstanceArn));
        }
        if (_reservedDBInstance.getLeaseId() != null) {
            prefix = _prefix + "LeaseId";
            String leaseId = _reservedDBInstance.getLeaseId();
            request.addParameter(prefix, StringUtils.fromString(leaseId));
        }
    }

    private static ReservedDBInstanceStaxMarshaller instance;

    public static ReservedDBInstanceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReservedDBInstanceStaxMarshaller();
        return instance;
    }
}
