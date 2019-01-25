/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.simpleemail.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.simpleemail.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO ReceiptIpFilter
 */
class ReceiptIpFilterStaxMarshaller {

    public void marshall(ReceiptIpFilter _receiptIpFilter, Request<?> request, String _prefix) {
        String prefix;
        if (_receiptIpFilter.getPolicy() != null) {
            prefix = _prefix + "Policy";
            String policy = _receiptIpFilter.getPolicy();
            request.addParameter(prefix, StringUtils.fromString(policy));
        }
        if (_receiptIpFilter.getCidr() != null) {
            prefix = _prefix + "Cidr";
            String cidr = _receiptIpFilter.getCidr();
            request.addParameter(prefix, StringUtils.fromString(cidr));
        }
    }

    private static ReceiptIpFilterStaxMarshaller instance;

    public static ReceiptIpFilterStaxMarshaller getInstance() {
        if (instance == null)
            instance = new ReceiptIpFilterStaxMarshaller();
        return instance;
    }
}
