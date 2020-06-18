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

package com.amazonaws.services.route53.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.route53.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO LinkedService
 */
class LinkedServiceStaxMarshaller {

    public void marshall(LinkedService _linkedService, Request<?> request, String _prefix) {
        String prefix;
        if (_linkedService.getServicePrincipal() != null) {
            prefix = _prefix + "ServicePrincipal";
            String servicePrincipal = _linkedService.getServicePrincipal();
            request.addParameter(prefix, StringUtils.fromString(servicePrincipal));
        }
        if (_linkedService.getDescription() != null) {
            prefix = _prefix + "Description";
            String description = _linkedService.getDescription();
            request.addParameter(prefix, StringUtils.fromString(description));
        }
    }

    private static LinkedServiceStaxMarshaller instance;

    public static LinkedServiceStaxMarshaller getInstance() {
        if (instance == null)
            instance = new LinkedServiceStaxMarshaller();
        return instance;
    }
}
