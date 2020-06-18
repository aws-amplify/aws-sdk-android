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
 * StAX marshaller for POJO HostedZoneSummary
 */
class HostedZoneSummaryStaxMarshaller {

    public void marshall(HostedZoneSummary _hostedZoneSummary, Request<?> request, String _prefix) {
        String prefix;
        if (_hostedZoneSummary.getHostedZoneId() != null) {
            prefix = _prefix + "HostedZoneId";
            String hostedZoneId = _hostedZoneSummary.getHostedZoneId();
            request.addParameter(prefix, StringUtils.fromString(hostedZoneId));
        }
        if (_hostedZoneSummary.getName() != null) {
            prefix = _prefix + "Name";
            String name = _hostedZoneSummary.getName();
            request.addParameter(prefix, StringUtils.fromString(name));
        }
        if (_hostedZoneSummary.getOwner() != null) {
            prefix = _prefix + "Owner";
            HostedZoneOwner owner = _hostedZoneSummary.getOwner();
            HostedZoneOwnerStaxMarshaller.getInstance().marshall(owner, request, prefix + ".");
        }
    }

    private static HostedZoneSummaryStaxMarshaller instance;

    public static HostedZoneSummaryStaxMarshaller getInstance() {
        if (instance == null)
            instance = new HostedZoneSummaryStaxMarshaller();
        return instance;
    }
}
