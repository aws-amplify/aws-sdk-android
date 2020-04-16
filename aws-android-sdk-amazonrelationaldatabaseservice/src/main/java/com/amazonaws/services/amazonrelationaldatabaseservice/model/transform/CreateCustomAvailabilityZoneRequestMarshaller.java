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

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.DefaultRequest;
import com.amazonaws.services.amazonrelationaldatabaseservice.model.*;
import com.amazonaws.transform.Marshaller;
import com.amazonaws.util.StringUtils;

/**
 * StAX request marshaller for CreateCustomAvailabilityZoneRequest
 */
public class CreateCustomAvailabilityZoneRequestMarshaller
        implements
        Marshaller<Request<CreateCustomAvailabilityZoneRequest>, CreateCustomAvailabilityZoneRequest> {

    public Request<CreateCustomAvailabilityZoneRequest> marshall(
            CreateCustomAvailabilityZoneRequest createCustomAvailabilityZoneRequest) {
        if (createCustomAvailabilityZoneRequest == null) {
            throw new AmazonClientException(
                    "Invalid argument passed to marshall(CreateCustomAvailabilityZoneRequest)");
        }

        Request<CreateCustomAvailabilityZoneRequest> request = new DefaultRequest<CreateCustomAvailabilityZoneRequest>(
                createCustomAvailabilityZoneRequest, "AmazonRelationalDatabaseService");
        request.addParameter("Action", "CreateCustomAvailabilityZone");
        request.addParameter("Version", "2014-10-31");

        String prefix;
        if (createCustomAvailabilityZoneRequest.getCustomAvailabilityZoneName() != null) {
            prefix = "CustomAvailabilityZoneName";
            String customAvailabilityZoneName = createCustomAvailabilityZoneRequest
                    .getCustomAvailabilityZoneName();
            request.addParameter(prefix, StringUtils.fromString(customAvailabilityZoneName));
        }
        if (createCustomAvailabilityZoneRequest.getExistingVpnId() != null) {
            prefix = "ExistingVpnId";
            String existingVpnId = createCustomAvailabilityZoneRequest.getExistingVpnId();
            request.addParameter(prefix, StringUtils.fromString(existingVpnId));
        }
        if (createCustomAvailabilityZoneRequest.getNewVpnTunnelName() != null) {
            prefix = "NewVpnTunnelName";
            String newVpnTunnelName = createCustomAvailabilityZoneRequest.getNewVpnTunnelName();
            request.addParameter(prefix, StringUtils.fromString(newVpnTunnelName));
        }
        if (createCustomAvailabilityZoneRequest.getVpnTunnelOriginatorIP() != null) {
            prefix = "VpnTunnelOriginatorIP";
            String vpnTunnelOriginatorIP = createCustomAvailabilityZoneRequest
                    .getVpnTunnelOriginatorIP();
            request.addParameter(prefix, StringUtils.fromString(vpnTunnelOriginatorIP));
        }

        return request;
    }
}
