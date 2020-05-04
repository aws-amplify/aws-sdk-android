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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VpnConnection
 */
class VpnConnectionJsonUnmarshaller implements Unmarshaller<VpnConnection, JsonUnmarshallerContext> {

    public VpnConnection unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VpnConnection vpnConnection = new VpnConnection();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("CustomerGatewayConfiguration")) {
                vpnConnection.setCustomerGatewayConfiguration(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CustomerGatewayId")) {
                vpnConnection.setCustomerGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Category")) {
                vpnConnection.setCategory(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                vpnConnection.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Type")) {
                vpnConnection.setType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpnConnectionId")) {
                vpnConnection.setVpnConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpnGatewayId")) {
                vpnConnection.setVpnGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TransitGatewayId")) {
                vpnConnection.setTransitGatewayId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Options")) {
                vpnConnection.setOptions(VpnConnectionOptionsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Routes")) {
                vpnConnection.setRoutes(new ListUnmarshaller<VpnStaticRoute>(
                        VpnStaticRouteJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                vpnConnection.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("VgwTelemetry")) {
                vpnConnection.setVgwTelemetry(new ListUnmarshaller<VgwTelemetry>(
                        VgwTelemetryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return vpnConnection;
    }

    private static VpnConnectionJsonUnmarshaller instance;

    public static VpnConnectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VpnConnectionJsonUnmarshaller();
        return instance;
    }
}
