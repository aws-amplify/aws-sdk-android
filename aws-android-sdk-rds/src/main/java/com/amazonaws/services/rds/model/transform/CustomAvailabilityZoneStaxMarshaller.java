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

package com.amazonaws.services.rds.model.transform;

import com.amazonaws.Request;
import com.amazonaws.services.rds.model.*;
import com.amazonaws.util.StringUtils;

/**
 * StAX marshaller for POJO CustomAvailabilityZone
 */
class CustomAvailabilityZoneStaxMarshaller {

    public void marshall(CustomAvailabilityZone _customAvailabilityZone, Request<?> request,
            String _prefix) {
        String prefix;
        if (_customAvailabilityZone.getCustomAvailabilityZoneId() != null) {
            prefix = _prefix + "CustomAvailabilityZoneId";
            String customAvailabilityZoneId = _customAvailabilityZone.getCustomAvailabilityZoneId();
            request.addParameter(prefix, StringUtils.fromString(customAvailabilityZoneId));
        }
        if (_customAvailabilityZone.getCustomAvailabilityZoneName() != null) {
            prefix = _prefix + "CustomAvailabilityZoneName";
            String customAvailabilityZoneName = _customAvailabilityZone
                    .getCustomAvailabilityZoneName();
            request.addParameter(prefix, StringUtils.fromString(customAvailabilityZoneName));
        }
        if (_customAvailabilityZone.getCustomAvailabilityZoneStatus() != null) {
            prefix = _prefix + "CustomAvailabilityZoneStatus";
            String customAvailabilityZoneStatus = _customAvailabilityZone
                    .getCustomAvailabilityZoneStatus();
            request.addParameter(prefix, StringUtils.fromString(customAvailabilityZoneStatus));
        }
        if (_customAvailabilityZone.getVpnDetails() != null) {
            prefix = _prefix + "VpnDetails";
            VpnDetails vpnDetails = _customAvailabilityZone.getVpnDetails();
            VpnDetailsStaxMarshaller.getInstance().marshall(vpnDetails, request, prefix + ".");
        }
    }

    private static CustomAvailabilityZoneStaxMarshaller instance;

    public static CustomAvailabilityZoneStaxMarshaller getInstance() {
        if (instance == null)
            instance = new CustomAvailabilityZoneStaxMarshaller();
        return instance;
    }
}
