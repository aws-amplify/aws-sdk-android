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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClientVpnRoute
 */
class ClientVpnRouteJsonMarshaller {

    public void marshall(ClientVpnRoute clientVpnRoute, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (clientVpnRoute.getClientVpnEndpointId() != null) {
            String clientVpnEndpointId = clientVpnRoute.getClientVpnEndpointId();
            jsonWriter.name("ClientVpnEndpointId");
            jsonWriter.value(clientVpnEndpointId);
        }
        if (clientVpnRoute.getDestinationCidr() != null) {
            String destinationCidr = clientVpnRoute.getDestinationCidr();
            jsonWriter.name("DestinationCidr");
            jsonWriter.value(destinationCidr);
        }
        if (clientVpnRoute.getTargetSubnet() != null) {
            String targetSubnet = clientVpnRoute.getTargetSubnet();
            jsonWriter.name("TargetSubnet");
            jsonWriter.value(targetSubnet);
        }
        if (clientVpnRoute.getType() != null) {
            String type = clientVpnRoute.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (clientVpnRoute.getOrigin() != null) {
            String origin = clientVpnRoute.getOrigin();
            jsonWriter.name("Origin");
            jsonWriter.value(origin);
        }
        if (clientVpnRoute.getStatus() != null) {
            ClientVpnRouteStatus status = clientVpnRoute.getStatus();
            jsonWriter.name("Status");
            ClientVpnRouteStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (clientVpnRoute.getDescription() != null) {
            String description = clientVpnRoute.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static ClientVpnRouteJsonMarshaller instance;

    public static ClientVpnRouteJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnRouteJsonMarshaller();
        return instance;
    }
}
