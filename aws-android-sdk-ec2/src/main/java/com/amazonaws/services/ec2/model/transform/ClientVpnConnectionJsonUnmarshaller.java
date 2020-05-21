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
 * JSON unmarshaller for POJO ClientVpnConnection
 */
class ClientVpnConnectionJsonUnmarshaller implements
        Unmarshaller<ClientVpnConnection, JsonUnmarshallerContext> {

    public ClientVpnConnection unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ClientVpnConnection clientVpnConnection = new ClientVpnConnection();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ClientVpnEndpointId")) {
                clientVpnConnection.setClientVpnEndpointId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Timestamp")) {
                clientVpnConnection.setTimestamp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionId")) {
                clientVpnConnection.setConnectionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Username")) {
                clientVpnConnection.setUsername(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionEstablishedTime")) {
                clientVpnConnection.setConnectionEstablishedTime(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngressBytes")) {
                clientVpnConnection.setIngressBytes(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EgressBytes")) {
                clientVpnConnection.setEgressBytes(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngressPackets")) {
                clientVpnConnection.setIngressPackets(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EgressPackets")) {
                clientVpnConnection.setEgressPackets(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ClientIp")) {
                clientVpnConnection.setClientIp(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CommonName")) {
                clientVpnConnection.setCommonName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                clientVpnConnection.setStatus(ClientVpnConnectionStatusJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("ConnectionEndTime")) {
                clientVpnConnection.setConnectionEndTime(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return clientVpnConnection;
    }

    private static ClientVpnConnectionJsonUnmarshaller instance;

    public static ClientVpnConnectionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ClientVpnConnectionJsonUnmarshaller();
        return instance;
    }
}
