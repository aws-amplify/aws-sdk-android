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
 * StAX marshaller for POJO Subnet
 */
class SubnetStaxMarshaller {

    public void marshall(Subnet _subnet, Request<?> request, String _prefix) {
        String prefix;
        if (_subnet.getSubnetIdentifier() != null) {
            prefix = _prefix + "SubnetIdentifier";
            String subnetIdentifier = _subnet.getSubnetIdentifier();
            request.addParameter(prefix, StringUtils.fromString(subnetIdentifier));
        }
        if (_subnet.getSubnetAvailabilityZone() != null) {
            prefix = _prefix + "SubnetAvailabilityZone";
            AvailabilityZone subnetAvailabilityZone = _subnet.getSubnetAvailabilityZone();
            AvailabilityZoneStaxMarshaller.getInstance().marshall(subnetAvailabilityZone, request,
                    prefix + ".");
        }
        if (_subnet.getSubnetStatus() != null) {
            prefix = _prefix + "SubnetStatus";
            String subnetStatus = _subnet.getSubnetStatus();
            request.addParameter(prefix, StringUtils.fromString(subnetStatus));
        }
    }

    private static SubnetStaxMarshaller instance;

    public static SubnetStaxMarshaller getInstance() {
        if (instance == null)
            instance = new SubnetStaxMarshaller();
        return instance;
    }
}
