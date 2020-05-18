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
 * JSON marshaller for POJO ClientVpnConnection
 */
class ClientVpnConnectionJsonMarshaller {

    public void marshall(ClientVpnConnection clientVpnConnection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (clientVpnConnection.getClientVpnEndpointId() != null) {
            String clientVpnEndpointId = clientVpnConnection.getClientVpnEndpointId();
            jsonWriter.name("ClientVpnEndpointId");
            jsonWriter.value(clientVpnEndpointId);
        }
        if (clientVpnConnection.getTimestamp() != null) {
            String timestamp = clientVpnConnection.getTimestamp();
            jsonWriter.name("Timestamp");
            jsonWriter.value(timestamp);
        }
        if (clientVpnConnection.getConnectionId() != null) {
            String connectionId = clientVpnConnection.getConnectionId();
            jsonWriter.name("ConnectionId");
            jsonWriter.value(connectionId);
        }
        if (clientVpnConnection.getUsername() != null) {
            String username = clientVpnConnection.getUsername();
            jsonWriter.name("Username");
            jsonWriter.value(username);
        }
        if (clientVpnConnection.getConnectionEstablishedTime() != null) {
            String connectionEstablishedTime = clientVpnConnection.getConnectionEstablishedTime();
            jsonWriter.name("ConnectionEstablishedTime");
            jsonWriter.value(connectionEstablishedTime);
        }
        if (clientVpnConnection.getIngressBytes() != null) {
            String ingressBytes = clientVpnConnection.getIngressBytes();
            jsonWriter.name("IngressBytes");
            jsonWriter.value(ingressBytes);
        }
        if (clientVpnConnection.getEgressBytes() != null) {
            String egressBytes = clientVpnConnection.getEgressBytes();
            jsonWriter.name("EgressBytes");
            jsonWriter.value(egressBytes);
        }
        if (clientVpnConnection.getIngressPackets() != null) {
            String ingressPackets = clientVpnConnection.getIngressPackets();
            jsonWriter.name("IngressPackets");
            jsonWriter.value(ingressPackets);
        }
        if (clientVpnConnection.getEgressPackets() != null) {
            String egressPackets = clientVpnConnection.getEgressPackets();
            jsonWriter.name("EgressPackets");
            jsonWriter.value(egressPackets);
        }
        if (clientVpnConnection.getClientIp() != null) {
            String clientIp = clientVpnConnection.getClientIp();
            jsonWriter.name("ClientIp");
            jsonWriter.value(clientIp);
        }
        if (clientVpnConnection.getCommonName() != null) {
            String commonName = clientVpnConnection.getCommonName();
            jsonWriter.name("CommonName");
            jsonWriter.value(commonName);
        }
        if (clientVpnConnection.getStatus() != null) {
            ClientVpnConnectionStatus status = clientVpnConnection.getStatus();
            jsonWriter.name("Status");
            ClientVpnConnectionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (clientVpnConnection.getConnectionEndTime() != null) {
            String connectionEndTime = clientVpnConnection.getConnectionEndTime();
            jsonWriter.name("ConnectionEndTime");
            jsonWriter.value(connectionEndTime);
        }
        jsonWriter.endObject();
    }

    private static ClientVpnConnectionJsonMarshaller instance;

    public static ClientVpnConnectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnConnectionJsonMarshaller();
        return instance;
    }
}
