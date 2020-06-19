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

package com.amazonaws.services.elasticache.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.elasticache.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CustomerNodeEndpoint
 */
class CustomerNodeEndpointStaxMarshaller {

    public void marshall(CustomerNodeEndpoint _customerNodeEndpoint, Request<?> request,
            String _prefix) {
        String prefix;
        if (_customerNodeEndpoint.getAddress() != null) {
            prefix = _prefix + "Address";
            String address = _customerNodeEndpoint.getAddress();
            request.addParameter(prefix, StringUtils.fromString(address));
        }
        if (_customerNodeEndpoint.getPort() != null) {
            prefix = _prefix + "Port";
            Integer port = _customerNodeEndpoint.getPort();
            request.addParameter(prefix, StringUtils.fromInteger(port));
        }
    }

    private static CustomerNodeEndpointStaxMarshaller instance;

    public static CustomerNodeEndpointStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomerNodeEndpointStaxMarshaller();
        return instance;
    }
}
