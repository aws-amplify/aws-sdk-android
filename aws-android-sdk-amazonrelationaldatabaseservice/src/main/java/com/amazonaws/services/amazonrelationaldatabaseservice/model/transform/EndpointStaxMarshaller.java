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
 * StAX marshaller for POJO Endpoint
 */
class EndpointStaxMarshaller {

    public void marshall(Endpoint _endpoint, Request<?> request, String _prefix) {
        String prefix;
        if (_endpoint.getAddress() != null) {
            prefix = _prefix + "Address";
            String address = _endpoint.getAddress();
            request.addParameter(prefix, StringUtils.fromString(address));
        }
        if (_endpoint.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _endpoint.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
        if (_endpoint.getHostedZoneId() != null) {
            prefix = _prefix + "HostedZoneId";
            String hostedZoneId = _endpoint.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
    }

    private static EndpointStaxMarshaller instance;

    public static EndpointStaxMarshaller getInstance() {
        if (instance == null)
            instance = new EndpointStaxMarshaller();
        return instance;
    }
}
