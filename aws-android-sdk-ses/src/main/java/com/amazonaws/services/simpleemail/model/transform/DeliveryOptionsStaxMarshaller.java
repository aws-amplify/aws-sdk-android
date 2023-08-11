/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * StAX marshaller for POJO DeliveryOptions
 */
class DeliveryOptionsStaxMarshaller {

    public void marshall(DeliveryOptions _deliveryOptions, Request<?> request, String _prefix) {
        String prefix;
        if (_deliveryOptions.getTlsPolicy() != null) {
            prefix = _prefix + "TlsPolicy";
            String tlsPolicy = _deliveryOptions.getTlsPolicy();
            request.addParameter(prefix, StringUtils.fromString(tlsPolicy));
        }
    }

    private static DeliveryOptionsStaxMarshaller instance;

    public static DeliveryOptionsStaxMarshaller getInstance() {
        if (instance == null)
            instance = new DeliveryOptionsStaxMarshaller();
        return instance;
    }
}
