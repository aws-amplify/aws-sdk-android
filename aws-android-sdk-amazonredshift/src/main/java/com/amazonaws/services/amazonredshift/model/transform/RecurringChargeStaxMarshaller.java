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
 * StAX marshaller for POJO RecurringCharge
 */
class RecurringChargeStaxMarshaller {

    public void marshall(RecurringCharge _recurringCharge, Request<?> request, String _prefix) {
        String prefix;
        if (_recurringCharge.getRecurringChargeAmount() != null) {
            prefix = _prefix + "RecurringChargeAmount";
            Double recurringChargeAmount = _recurringCharge.getRecurringChargeAmount();
            request.addParameter(prefix, StringUtils.fromDouble(recurringChargeAmount));
        }
        if (_recurringCharge.getRecurringChargeFrequency() != null) {
            prefix = _prefix + "RecurringChargeFrequency";
            String recurringChargeFrequency = _recurringCharge.getRecurringChargeFrequency();
            request.addParameter(prefix, StringUtils.fromString(recurringChargeFrequency));
        }
    }

    private static RecurringChargeStaxMarshaller instance;

    public static RecurringChargeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new RecurringChargeStaxMarshaller();
        return instance;
    }
}
