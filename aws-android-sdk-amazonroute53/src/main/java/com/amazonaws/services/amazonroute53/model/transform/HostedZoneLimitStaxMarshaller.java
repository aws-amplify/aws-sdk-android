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

package com.amazonaws.services.amazonroute53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.amazonroute53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO HostedZoneLimit
 */
class HostedZoneLimitStaxMarshaller {

    public void marshall(HostedZoneLimit _hostedZoneLimit, Request<?> request, String _prefix) {
        String prefix;
        if (_hostedZoneLimit.getType() != null) {
            prefix = _prefix + "Type";
            String type = _hostedZoneLimit.getType();
            request.addParameter(prefix, StringUtils.fromString(type));
        }
        if (_hostedZoneLimit.getValue() != null) {
            prefix = _prefix + "Value";
            Long value = _hostedZoneLimit.getValue();
            request.addParameter(prefix, StringUtils.fromLong(value));
        }
    }

    private static HostedZoneLimitStaxMarshaller instance;

    public static HostedZoneLimitStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HostedZoneLimitStaxMarshaller();
        return instance;
    }
}
