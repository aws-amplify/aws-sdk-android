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
 * StAX marshaller for POJO IPRange
 */
class IPRangeStaxMarshaller {

    public void marshall(IPRange _iPRange, Request<?> request, String _prefix) {
        String prefix;
        if (_iPRange.getStatus() != null) {
            prefix = _prefix + "Status";
            String status = _iPRange.getStatus();
            request.addParameter(prefix, StringUtils.fromString(status));
        }
        if (_iPRange.getCIDRIP() != null) {
            prefix = _prefix + "CIDRIP";
            String cIDRIP = _iPRange.getCIDRIP();
            request.addParameter(prefix, StringUtils.fromString(cIDRIP));
        }
    }

    private static IPRangeStaxMarshaller instance;

    public static IPRangeStaxMarshaller getInstance() {
        if (instance == null)
            instance = new IPRangeStaxMarshaller();
        return instance;
    }
}
