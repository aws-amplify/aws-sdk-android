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
 * StAX marshaller for POJO HostedZoneOwner
 */
class HostedZoneOwnerStaxMarshaller {

    public void marshall(HostedZoneOwner _hostedZoneOwner, Request<?> request, String _prefix) {
        String prefix;
        if (_hostedZoneOwner.getOwningAccount() != null) {
            prefix = _prefix + "OwningAccount";
            String owningAccount = _hostedZoneOwner.getOwningAccount();
            request.addParameter(prefix, StringUtils.fromString(owningAccount));
        }
        if (_hostedZoneOwner.getOwningService() != null) {
            prefix = _prefix + "OwningService";
            String owningService = _hostedZoneOwner.getOwningService();
            request.addParameter(prefix, StringUtils.fromString(owningService));
        }
    }

    private static HostedZoneOwnerStaxMarshaller instance;

    public static HostedZoneOwnerStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HostedZoneOwnerStaxMarshaller();
        return instance;
    }
}
