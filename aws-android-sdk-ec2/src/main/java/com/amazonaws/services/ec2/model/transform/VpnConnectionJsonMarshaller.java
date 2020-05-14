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
 * JSON marshaller for POJO VpnConnection
 */
class VpnConnectionJsonMarshaller {

    public void marshall(VpnConnection vpnConnection, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (vpnConnection.getCustomerGatewayConfiguration() != null) {
            String customerGatewayConfiguration = vpnConnection.getCustomerGatewayConfiguration();
            jsonWriter.name("CustomerGatewayConfiguration");
            jsonWriter.value(customerGatewayConfiguration);
        }
        if (vpnConnection.getCustomerGatewayId() != null) {
            String customerGatewayId = vpnConnection.getCustomerGatewayId();
            jsonWriter.name("CustomerGatewayId");
            jsonWriter.value(customerGatewayId);
        }
        if (vpnConnection.getCategory() != null) {
            String category = vpnConnection.getCategory();
            jsonWriter.name("Category");
            jsonWriter.value(category);
        }
        if (vpnConnection.getState() != null) {
            String state = vpnConnection.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (vpnConnection.getType() != null) {
            String type = vpnConnection.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (vpnConnection.getVpnConnectionId() != null) {
            String vpnConnectionId = vpnConnection.getVpnConnectionId();
            jsonWriter.name("VpnConnectionId");
            jsonWriter.value(vpnConnectionId);
        }
        if (vpnConnection.getVpnGatewayId() != null) {
            String vpnGatewayId = vpnConnection.getVpnGatewayId();
            jsonWriter.name("VpnGatewayId");
            jsonWriter.value(vpnGatewayId);
        }
        if (vpnConnection.getTransitGatewayId() != null) {
            String transitGatewayId = vpnConnection.getTransitGatewayId();
            jsonWriter.name("TransitGatewayId");
            jsonWriter.value(transitGatewayId);
        }
        if (vpnConnection.getOptions() != null) {
            VpnConnectionOptions options = vpnConnection.getOptions();
            jsonWriter.name("Options");
            VpnConnectionOptionsJsonMarshaller.getInstance().marshall(options, jsonWriter);
        }
        if (vpnConnection.getRoutes() != null) {
            java.util.List<VpnStaticRoute> routes = vpnConnection.getRoutes();
            jsonWriter.name("Routes");
            jsonWriter.beginArray();
            for (VpnStaticRoute routesItem : routes) {
                if (routesItem != null) {
                    VpnStaticRouteJsonMarshaller.getInstance().marshall(routesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnConnection.getTags() != null) {
            java.util.List<Tag> tags = vpnConnection.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (vpnConnection.getVgwTelemetry() != null) {
            java.util.List<VgwTelemetry> vgwTelemetry = vpnConnection.getVgwTelemetry();
            jsonWriter.name("VgwTelemetry");
            jsonWriter.beginArray();
            for (VgwTelemetry vgwTelemetryItem : vgwTelemetry) {
                if (vgwTelemetryItem != null) {
                    VgwTelemetryJsonMarshaller.getInstance().marshall(vgwTelemetryItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static VpnConnectionJsonMarshaller instance;

    public static VpnConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VpnConnectionJsonMarshaller();
        return instance;
    }
}
